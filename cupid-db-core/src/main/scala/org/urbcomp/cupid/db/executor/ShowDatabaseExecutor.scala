/*
 * Copyright 2022 ST-Lab
 *
 * This program is free software; you can redistribute it and/or modify it under the terms of the
 * GNU General Public License version 3 as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 */

package org.urbcomp.cupid.db.executor

import org.urbcomp.cupid.db.infra.{BaseExecutor, MetadataResult}
import org.urbcomp.cupid.db.metadata.MetadataAccessUtil
import org.urbcomp.cupid.db.metadata.entity.Database
import org.urbcomp.cupid.db.util.SqlParam

import java.util
import scala.collection.JavaConverters.asScalaBufferConverter

case class ShowDatabaseExecutor() extends BaseExecutor {

  override def execute[Array](): MetadataResult[Array] = {
    val param = SqlParam.CACHE.get()
    val userName = param.getUserName

    val all: util.List[Database] = MetadataAccessUtil.getDatabases(userName)
    val dbs = all.asScala.map(d => Array(d.getName.asInstanceOf[AnyRef])).toArray
    MetadataResult
      .buildResult(Array("Database"), java.util.Arrays.asList(dbs: _*))
      .asInstanceOf[MetadataResult[Array]]
  }
}
