package com.excel.welcomeguestapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.excel.excelclasslibrary.UtilShell;

public class WebViewActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d( "asshole", "bbbb WelcomeGuestAppEmptyGIEC " );
        UtilShell.executeShellCommandWithOp( "input keyevent 3" );
        //UtilMisc.startApplicationUsingPackageName( this, "com.excel.appstvlauncher.secondgen" );
        finish();
    }
}
