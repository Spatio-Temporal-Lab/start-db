/*
 * Copyright 2022 ST-Lab
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 2 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */

package org.urbcomp.start.db.executor

import org.apache.calcite.sql.{SqlIdentifier, SqlUpdate}
import org.geotools.data.{DataStoreFinder, Transaction}
import org.geotools.filter.text.cql2.CQL
import org.locationtech.geomesa.utils.io.WithClose
import org.locationtech.jts.geom.LineString
import org.urbcomp.start.db.infra.{BaseExecutor, MetadataResult}
import org.urbcomp.start.db.metadata.{AccessorFactory, CalciteHelper, MetadataVerifyUtil}
import org.urbcomp.start.db.model.roadnetwork.RoadSegment
import org.urbcomp.start.db.model.trajectory.Trajectory
import org.urbcomp.start.db.util.{GeoFunctions, WKTUtils}

import java.sql.ResultSet
import java.util
import scala.collection.JavaConverters.asScalaBufferConverter
import scala.collection.convert.ImplicitConversions.`collection AsScalaIterable`

/**
  * executor for update operations
  *
  * @param n SqlUpdate instance
  * @author Wang Bohong
  * @date 2022-06-13
  */
case class UpdateExecutor(n: SqlUpdate) extends BaseExecutor {

  override def execute[Int](): MetadataResult[Int] = {
    // extract database name and table name
    // ToDO Sql Param
    val userName = "start_db"
    val envDbName = "db_test"
    val targetTable = n.getTargetTable.asInstanceOf[SqlIdentifier]
    val str = targetTable.names.get(0)
    val target = targetTable.names.get(0).split('.')
    val (dbName, tableName) = target.length match {
      case 3 =>
        (target(1), target(2))
      case 2 =>
        (target(0), target(1))
      case 1 =>
        (envDbName, target(0))
      case _ =>
        throw new RuntimeException("target table format should like dbname.tablename or tablename")
    }
    // metadata verify
    val fields = MetadataVerifyUtil.getFields(userName, dbName, tableName)
    if (fields == null) throw new RuntimeException("There is no corresponding table!")
    // filter condition
    val condition = n.getCondition.toString.replace("`", "")
    // construct sql
    val list = n.getSourceExpressionList.getList
    val queryItem = list.map(j => j.toString).mkString(",")
    val originalQuerySql =
      s"""
         |SELECT $queryItem
         |""".stripMargin
    val querySql = originalQuerySql.replace("`", "")
    val result = new util.ArrayList[AnyRef]()
    WithClose(executeQuery(userName, dbName, querySql)) { rs =>
      {
        rs.next()
        val count = rs.getMetaData.getColumnCount
        for (x <- 1 to count) {
          result.add(rs.getObject(x))
        }
      }
    }
    // update data
    var affectRows = 0
    val params = new util.HashMap[String, String]()
    // ToDO: SqlParam
    val CATALOG = "start_db.db_test"
    params.put("hbase.catalog", CATALOG)
    params.put("hbase.zookeepers", "localhost:2181")
    val dataStore = DataStoreFinder.getDataStore(params)
    val filter = CQL.toFilter(condition)
    // 行数怎么处理
    WithClose(dataStore.getFeatureWriter(tableName, filter, Transaction.AUTO_COMMIT)) { writer =>
      {
        while (writer.hasNext) {
          val sf = writer.next()
          val count = result.size()
          for (x <- 0 until count) {
            val name = n.getTargetColumnList.get(x).toString
            if (result.get(x).isInstanceOf[RoadSegment]) {
              val rs = result.get(x).asInstanceOf[RoadSegment]
              val item = rs.getPoints.asScala
                .map { i =>
                  s"${i.getLng} ${i.getLat}"
                }
                .mkString(", ")
              val wkt = s"LINESTRING($item)"
              val geom = WKTUtils.read(wkt).asInstanceOf[LineString]
              sf.setAttribute(name + ".rsId", rs.getRoadSegmentId)
              sf.setAttribute(name + ".geom", geom)
              sf.setAttribute(name + ".rsGeoJson", rs.toGeoJSON)
            } else if (result.get(x).isInstanceOf[Trajectory]) {
              val traj = result.get(x).asInstanceOf[Trajectory]
              sf.setAttribute(name + ".tid", traj.getTid)
              sf.setAttribute(name + ".oid", traj.getOid)
              sf.setAttribute(name + ".start_time", traj.getStartTime)
              sf.setAttribute(name + ".end_time", traj.getEndTime)
              sf.setAttribute(name + ".geom", GeoFunctions.bboxFromEnvelopeToPolygon(traj.getBBox))
              sf.setAttribute(name + ".geoJson", traj.toGeoJSON)
            } else {
              sf.setAttribute(name, result.get(x))
            }
          }
          affectRows += 1
          writer.write()
        }
      }
    }
    MetadataResult.buildDDLResult(affectRows)
  }

  /**
    * Execute the SQL parsed from the contents of values
    */
  def executeQuery[R](user: String, dbName: String, querySql: String): ResultSet = {
    val statement = CalciteHelper.createConnection().createStatement()
    statement.executeQuery(querySql)
  }

}
