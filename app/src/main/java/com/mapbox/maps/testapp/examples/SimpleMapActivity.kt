package com.mapbox.maps.testapp.examples

import android.animation.Animator
import android.animation.ValueAnimator
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mapbox.common.Logger
import com.mapbox.geojson.Point
import com.mapbox.maps.CameraOptions
import com.mapbox.maps.Style
import com.mapbox.maps.plugin.animation.*
import com.mapbox.maps.plugin.gestures.getGesturesPlugin
import com.mapbox.maps.testapp.R
import kotlinx.android.synthetic.main.activity_simple_map.*

/**
 * Example of displaying a map.
 */
class SimpleMapActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_simple_map)
    mapView.getMapboxMap().loadStyleUri(Style.MAPBOX_STREETS)

    mapView.getCameraAnimationsPlugin().addCameraAnimationsLifecycleListener(object : CameraAnimationsLifecycleListener {

      override fun onAnimatorStarting(
        type: CameraAnimatorType,
        animator: ValueAnimator,
        owner: String?
      ) {
        Logger.e("KIRYLDD", "onAnimatorStarting $type, $owner")
      }

      override fun onAnimatorInterrupting(
        type: CameraAnimatorType,
        runningAnimator: ValueAnimator,
        runningAnimatorOwner: String?,
        newAnimator: ValueAnimator,
        newAnimatorOwner: String?
      ) {
        Logger.e("KIRYLDD", "onAnimatorInterrupting $type, running $runningAnimatorOwner, interrupting $newAnimatorOwner")
      }

      override fun onAnimatorEnding(
        type: CameraAnimatorType,
        animator: ValueAnimator,
        owner: String?
      ) {
        Logger.e("KIRYLDD", "onAnimatorEnding $type, $owner")
      }

      override fun onAnimatorCancelling(
        type: CameraAnimatorType,
        animator: ValueAnimator,
        owner: String?
      ) {
        Logger.e("KIRYLDD", "onAnimatorCancelling $type, $owner")
      }
    })


    mapView.getMapboxMap().addOnCameraChangeListener { Logger.e("KIRYLDD", "onCameraChanged") }

    mapView.getGesturesPlugin().addOnMapClickListener {
      mapView.getMapboxMap().flyTo(
        CameraOptions.Builder().center(Point.fromLngLat(-122.4194, 37.7749)).zoom(15.0).build(),
        MapAnimationOptions.mapAnimationOptions {
          duration(2000)
          animatorListener(object : Animator.AnimatorListener {
            override fun onAnimationStart(animation: Animator?) {
              Logger.e("KIRYLDD", "onAnimationStart")
            }

            override fun onAnimationEnd(animation: Animator?) {
              Logger.e("KIRYLDD", "onAnimationEnd")
            }

            override fun onAnimationCancel(animation: Animator?) {
              Logger.e("KIRYLDD", "onAnimationCancel")
            }

            override fun onAnimationRepeat(animation: Animator?) {
              Logger.e("KIRYLDD", "onAnimationRepeat")
            }

          })
        }
      )
      true
    }

  }

  override fun onStart() {
    super.onStart()
    mapView.onStart()
  }

  override fun onStop() {
    super.onStop()
    mapView.onStop()
  }

  override fun onLowMemory() {
    super.onLowMemory()
    mapView.onLowMemory()
  }

  override fun onDestroy() {
    super.onDestroy()
    mapView.onDestroy()
  }
}