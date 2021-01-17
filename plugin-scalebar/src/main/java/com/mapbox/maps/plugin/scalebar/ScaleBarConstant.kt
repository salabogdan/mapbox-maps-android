package com.mapbox.maps.plugin.scalebar

import android.util.Pair

internal const val FEET_PER_METER = 3.2808F
internal const val KILOMETER = 1000
internal const val FEET_PER_MILE = 5280
internal const val METER_UNIT = " m"
internal const val FEET_UNIT = " ft"
internal const val KILOMETER_UNIT = " km"
internal const val MILE_UNIT = " mi"
internal val metricTable = listOf(
  Pair(1, 2),
  Pair(2, 2),
  Pair(4, 2),
  Pair(10, 2),
  Pair(20, 2),
  Pair(50, 2),
  Pair(75, 3),
  Pair(100, 2),
  Pair(150, 2),
  Pair(200, 2),
  Pair(300, 3),
  Pair(500, 2),
  Pair(1000, 2),
  Pair(1500, 2),
  Pair(3000, 3),
  Pair(5000, 2),
  Pair(10000, 2),
  Pair(20000, 2),
  Pair(30000, 3),
  Pair(50000, 2),
  Pair(100000, 2),
  Pair(200000, 2),
  Pair(300000, 3),
  Pair(400000, 2),
  Pair(500000, 2),
  Pair(600000, 3),
  Pair(800000, 2),
  Pair(1000000, 2),
  Pair(2000000, 2),
  Pair(3000000, 3),
  Pair(4000000, 2),
  Pair(5000000, 2),
  Pair(6000000, 3),
  Pair(8000000, 2),
  Pair(10000000, 2),
  Pair(12000000, 2),
  Pair(15000000, 2)
)
internal val imperialTable = listOf(
  Pair(4, 2),
  Pair(6, 2),
  Pair(10, 2),
  Pair(20, 2),
  Pair(30, 2),
  Pair(50, 2),
  Pair(75, 3),
  Pair(100, 2),
  Pair(200, 2),
  Pair(300, 3),
  Pair(400, 2),
  Pair(600, 3),
  Pair(800, 2),
  Pair(1000, 2),
  Pair((0.25f * FEET_PER_MILE).toInt(), 2),
  Pair((0.5f * FEET_PER_MILE).toInt(), 2),
  Pair(FEET_PER_MILE, 2),
  Pair(2 * FEET_PER_MILE, 2),
  Pair(3 * FEET_PER_MILE, 3),
  Pair(4 * FEET_PER_MILE, 2),
  Pair(8 * FEET_PER_MILE, 2),
  Pair(12 * FEET_PER_MILE, 2),
  Pair(15 * FEET_PER_MILE, 3),
  Pair(20 * FEET_PER_MILE, 2),
  Pair(30 * FEET_PER_MILE, 3),
  Pair(40 * FEET_PER_MILE, 2),
  Pair(80 * FEET_PER_MILE, 2),
  Pair(120 * FEET_PER_MILE, 2),
  Pair(200 * FEET_PER_MILE, 2),
  Pair(300 * FEET_PER_MILE, 3),
  Pair(400 * FEET_PER_MILE, 2),
  Pair(600 * FEET_PER_MILE, 3),
  Pair(1000 * FEET_PER_MILE, 2),
  Pair(1500 * FEET_PER_MILE, 3),
  Pair(2000 * FEET_PER_MILE, 2),
  Pair(3000 * FEET_PER_MILE, 2),
  Pair(4000 * FEET_PER_MILE, 2),
  Pair(5000 * FEET_PER_MILE, 2),
  Pair(6000 * FEET_PER_MILE, 3),
  Pair(8000 * FEET_PER_MILE, 2),
  Pair(10000 * FEET_PER_MILE, 2)
)