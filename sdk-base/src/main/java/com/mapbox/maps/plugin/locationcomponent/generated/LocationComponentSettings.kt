// This file is generated.

package com.mapbox.maps.plugin.locationcomponent.generated

import android.graphics.Color
import com.mapbox.maps.plugin.LocationPuck
/**
 * Shows a location puck on the map.
 */
data class LocationComponentSettings(

  /**
   * Whether the user location is visible on the map.
   */
  var enabled: Boolean = false,

  /**
   * Whether the location puck is pulsing on the map. Only work for 2D location puck.
   */
  var pulsingEnabled: Boolean = false,

  /**
   * The color of the pulsing circle. Only work for 2D location puck.
   */
  var pulsingColor: Int = Color.parseColor("#4A90E2"),

  /**
   * The maximum radius of the pulsing circle. Only work for 2D location puck.
   */
  var pulsingMaxRadius: Float = 10f,

  /**
   * Sets the id of the layer that's added above to when placing the component on the map.
   */
  var layerAbove: String? = null,

  /**
   * Sets the id of the layer that's added below to when placing the component on the map.
   */
  var layerBelow: String? = null,

  /**
   * Defines what the customised look of the location puck.
   */
  var locationPuck: LocationPuck,
)

// End of generated file.