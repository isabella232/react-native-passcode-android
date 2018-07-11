package com.authentication;

import android.app.Activity;
import android.content.Intent;

import com.facebook.react.bridge.ActivityEventListener;

public class AuthenticationScreenActivityEventListener implements ActivityEventListener {

    private ActivityResultInterface mCallback;

    public AuthenticationScreenActivityEventListener(ActivityResultInterface callback) {
        mCallback = callback;
    }

    // < RN 0.33.0
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        mCallback.callback(requestCode, resultCode, data);
    }

    // >= RN 0.33.0
    public void onActivityResult(Activity activity, int requestCode, int resultCode, Intent data) {
        mCallback.callback(requestCode, resultCode, data);
    }
}
