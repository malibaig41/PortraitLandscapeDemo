package com.ali.ahmed.muhammad.portraitlandscapedemo;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = ThirdActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        freezeScreenRotation(this);
        showFirstFragment();

    }

    private void showFirstFragment() {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        Fragment fragment = FirstFragment.newInstance();
        fragmentTransaction.add(R.id.fragment_container, fragment, "firstFragment");
        fragmentTransaction.commit();
    }


//    public static void setThisActivityOrientation(Activity a) {
//        if (appStartedInLandMode == null) {
//            appStartedInLandMode = ScreenRotationUtils.isDeviceDefaultOrientationLandscape(a);
//        }
//
////        if(!appStartedInLandMode) {
////            a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
////        }else{
////            a.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
////        }
//
//        freezeScreenRotation(a);
//    }

    public static void freezeScreenRotation(Activity target) {

        if (Build.VERSION.SDK_INT >= 18) {
            Log.d(TAG, "SDK version is at least 18, using SCREEN_ORIENTATION_LOCKED");
            target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LOCKED);
        }
//        else {
//
//            int windowOrientation = target.getWindowManager().getDefaultDisplay().getRotation();
//
//            boolean isLandscapeDefault = isDeviceDefaultOrientationLandscape(target);
//
//            Log.d(TAG, "isLandscapeDefault: " + isLandscapeDefault);
//
//            switch (windowOrientation) {
//                case Surface.ROTATION_0:
//                    if (isLandscapeDefault) {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//                    } else {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//                    }
//                    break;
//                case Surface.ROTATION_180:
//                    if (isLandscapeDefault) {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
//                    } else {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT);
//                    }
//                    break;
//                case Surface.ROTATION_270:
//                    if (isLandscapeDefault) {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
//                    } else {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE);
//                    }
//                    break;
//                case Surface.ROTATION_90:
//                    if (isLandscapeDefault) {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT);
//                    } else {
//                        target.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
//                    }
//                    break;
//            }
    }
}



