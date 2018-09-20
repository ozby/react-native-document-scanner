
package com.reactlibrary;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNPdfScannerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNPdfScannerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNPdfScanner";
  }

  @ReactMethod
  void navigateToMainActivity() {
    Activity activity = getCurrentActivity();
    if (activity != null) {
      Intent intent = new Intent(activity, MainActivity.class);
      activity.startActivity(intent);
    }
  }

}