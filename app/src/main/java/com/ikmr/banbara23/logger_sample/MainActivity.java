package com.ikmr.banbara23.logger_sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.orhanobut.logger.Logger;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_scrolling);

        Logger.d("Test comment");

        putLog();
    }

    private void putLog() {
        Logger.e(new Exception(),"エラー");
        putJsonLog();
        putTagLog();
    }

    private void putJsonLog() {
        Logger.json("{\"date\":\"10月23日(日)\",\"temperature\":\"32℃[+1] 28℃[-1]\",\"wave\":\"2メートル後1.5メートル\",\"weather\":\"晴後雨\",\"wind\":\"南西の風後北の風\"}");
    }

    private void putTagLog() {
        Logger.t("TAG").d(this.getClass().getCanonicalName());
    }
}
