package com.wix.rncamera;

import android.view.View;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.views.text.ReactTextView;

public class CameraViewManager extends SimpleViewManager {

    public static final String REACT_CLASS = "CKCamera";

    @Override
    public String getName() {
        return REACT_CLASS;
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        return new ReactTextView(reactContext);
    }
}
