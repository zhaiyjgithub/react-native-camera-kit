package com.wix.rncamera;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CameraModule extends ReactContextBaseJavaModule {

    public CameraModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @ReactMethod
    public void checkDeviceAuthoriztionStatus(Promise promise) {
        promise.resolve(true);
    }

    @ReactMethod
    public void capture(boolean saveToRoll, Promise promise) {
        promise.resolve("google.com");
    }

    @ReactMethod
    public void changeCamera(Promise promise) {
        promise.resolve(true);
    }

    @ReactMethod
    public void setFlashMode(String mode, Promise promise) {
        promise.resolve(true);
    }

    @Override
    public String getName() {
        return "CKCameraManager";
    }
}
