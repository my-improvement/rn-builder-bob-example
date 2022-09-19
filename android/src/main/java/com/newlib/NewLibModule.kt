package com.newlib

import com.facebook.react.bridge.Promise
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod
import com.openpath.mobileaccesscore.*
import okhttp3.internal.wait
import org.json.JSONObject
import kotlin.collections.ArrayList

var currentPromise: Promise? = null

class NewLibModule(reactContext: ReactApplicationContext) : ReactContextBaseJavaModule(reactContext), OpenpathMobileAccessCore.OpenpathEventHandler {
    override fun getName(): String {
        return "NewLib"
    }

  @ReactMethod
    fun initOpenPath(promise: Promise) {
      currentActivity!!.runOnUiThread {
        currentPromise = promise

        OpenpathMobileAccessCore.getInstance().init(currentActivity?.application, this)
      }
    }

  override fun onInit() {
    currentPromise?.resolve("Terinisialisasi")
    currentPromise = null
  }

  override fun onProvisionResponse(p0: OpenpathProvisionResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onUnprovisionResponse(p0: OpenpathUnprovisionResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onSwitchUserResponse(p0: OpenpathSwitchUserResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onSyncUserResponse(p0: OpenpathSyncUserResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onUnlockResponse(p0: OpenpathRequestResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onUserSettingsSet(p0: OpenpathUserSettings?) {
    // TODO("Not yet implemented")
  }

  override fun onItemsSet(p0: ArrayList<OpenpathItem>?, p1: ArrayList<OpenpathOrderingItem>?) {
    // TODO("Not yet implemented")
  }

  override fun onItemsUpdated(p0: ArrayList<OpenpathItem>?) {
    // TODO("Not yet implemented")
  }

  override fun onLocationStatusChanged(p0: OpenpathLocationStatus?) {
    // TODO("Not yet implemented")
  }

  override fun onBatteryOptimizationStatusChanged(p0: Boolean) {
    // TODO("Not yet implemented")
  }

  override fun onBluetoothStatusChanged(p0: Boolean, p1: Boolean) {
    // TODO("Not yet implemented")
  }

  override fun onInternetStatusChanged(p0: Boolean) {
    // TODO("Not yet implemented")
  }

  override fun onFeedbackResponse(p0: OpenpathResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onRevertResponse(p0: OpenpathRequestResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onOverrideResponse(p0: OpenpathRequestResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onTriggerLockdownPlanResponse(p0: OpenpathRequestResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onRevertLockdownPlanResponse(p0: OpenpathRequestResponse?) {
    // TODO("Not yet implemented")
  }

  override fun onNotificationClicked(p0: String?, p1: Int) {
    // TODO("Not yet implemented")
  }

  override fun onBluetoothError(p0: Int, p1: String?) {
    // TODO("Not yet implemented")
  }

  override fun onLockdownPlansSet(p0: ArrayList<OpenpathLockdownPlan>?) {
    // TODO("Not yet implemented")
  }

  override fun onEvent(p0: JSONObject?) {
    // TODO("Not yet implemented")
  }
}
