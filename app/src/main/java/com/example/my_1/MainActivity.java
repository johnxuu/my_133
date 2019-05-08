package com.example.my_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import android.widget.Toast;

import mobi.oneway.sdk.OWRewardedAd;
import mobi.oneway.sdk.OWRewardedAdListener;
import mobi.oneway.sdk.OnewayAdCloseType;
import mobi.oneway.sdk.OnewaySdk;
import mobi.oneway.sdk.OnewaySdkError;

public class MainActivity extends AppCompatActivity {


    private OWRewardedAdListener rewardedAdListener = new OWRewardedAdListener() {
        @Override
        public void onAdReady() {
            // 广告已经准备好，可以进行播放

        }

        @Override
        public void onAdShow(String tag) {

        }

        @Override
        public void onAdClick(String tag) {

        }

        @Override
        public void onAdClose(String tag, OnewayAdCloseType onewayVideoCloseType) {

        }

        @Override
        public void onAdFinish(String s, OnewayAdCloseType onewayAdCloseType, String s1) {

        }


        @Override
        public void onSdkError(OnewaySdkError onewaySdkError, String s) {

        }
    };





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnewaySdk.setDebugMode(true);
        OWRewardedAd.init(rewardedAdListener);
        OnewaySdk.configure(this, "5ddf3fd3b118495e");

        if (OWRewardedAd.isReady()) {
            OWRewardedAd.show(MainActivity.this, "rewarded ad 1");

        } else {
            Toast.makeText(MainActivity.this, "广告还未准备好", Toast.LENGTH_SHORT).show();
        }

    }

}
