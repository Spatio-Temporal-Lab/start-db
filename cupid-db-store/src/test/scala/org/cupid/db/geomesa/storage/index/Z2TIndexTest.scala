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

package org.cupid.db.geomesa.storage.index

import com.typesafe.scalalogging.LazyLogging
import org.cupid.db.geomesa.storage.TestGeoMesaDataStore
import org.geotools.data.{Query, Transaction}
import org.geotools.filter.text.ecql.ECQL
import org.junit.runner.RunWith
import org.locationtech.geomesa.features.ScalaSimpleFeature
import org.locationtech.geomesa.utils.collection.SelfClosingIterator
import org.locationtech.geomesa.utils.geotools.{FeatureUtils, SimpleFeatureTypes}
import org.locationtech.geomesa.utils.io.WithClose
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class Z2TIndexTest extends Specification with LazyLogging {

  "Z2TIndex" should {
    "index and query yearly epochs correctly" in {
      foreach(Seq("z2t:geom:dtg")) { indices =>
        val spec =
          "name:String,track:String,dtg:Date,*geom:Point:srid=4326;" +
            s"geomesa.z3.interval=day,geomesa.indices.enabled=$indices"

        val sft = SimpleFeatureTypes.createType("test", spec)

        val ds = new TestGeoMesaDataStore(true) // loose bbox

        val features =
          (0 until 10).map { i =>
            ScalaSimpleFeature.create(
              sft,
              s"$i",
              s"name$i",
              "track1",
              s"2022-12-07T0$i:00:00.000Z",
              s"POINT(4$i 60)"
            )
          } ++ (10 until 20).map { i =>
            ScalaSimpleFeature.create(
              sft,
              s"$i",
              s"name$i",
              "track2",
              s"2022-12-${i}T$i:00:00.000Z",
              s"POINT(4${i - 10} 60)"
            )
          } ++ (20 until 30).map { i =>
            ScalaSimpleFeature.create(
              sft,
              s"$i",
              s"name$i",
              "track3",
              s"2022-12-${i}T${i - 10}:00:00.000Z",
              s"POINT(6${i - 20} 60)"
            )
          } ++ (30 until 32).map { i =>
            ScalaSimpleFeature.create(
              sft,
              s"$i",
              s"name$i",
              "track4",
              s"2022-12-${i}T${i - 10}:00:00.000Z",
              s"POINT(${i - 20} 60)"
            )
          }

        ds.createSchema(sft)
        WithClose(ds.getFeatureWriterAppend(sft.getTypeName, Transaction.AUTO_COMMIT)) { writer =>
          features.foreach(FeatureUtils.write(writer, _, useProvidedFid = true))
        }

        val filter = ECQL.toFilter(
          "bbox(geom,0,55,70,65) AND dtg during 2022-12-01T00:00:00.000Z/2022-12-31T23:59:59.999Z"
        )

        val filterReault = SelfClosingIterator(
          ds.getFeatureReader(new Query("test", filter), Transaction.AUTO_COMMIT)
        ).toList
        filterReault must containTheSameElementsAs(features)

        val lastDayFilter = ECQL.toFilter(
          "bbox(geom,9,59,12,61) AND dtg during 2022-12-31T00:00:00.000Z/2022-12-31T23:59:59.999Z"
        )

        val lastDayResults = SelfClosingIterator(
          ds.getFeatureReader(new Query("test", lastDayFilter), Transaction.AUTO_COMMIT)
        ).toList
        lastDayResults must not be empty
      }
    }
  }
}
