package com.example.my_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

        }

        @Override
        public void onAdShow(String s) {

        }

        @Override
        public void onAdClick(String s) {

        }

        @Override
        public void onAdClose(String s, OnewayAdCloseType onewayAdCloseType) {

        }

        @Override
        public void onAdFinish(String s, OnewayAdCloseType onewayAdCloseType, String s1) {

        }

        @Override
        public void onSdkError(OnewaySdkError onewaySdkError, String s) {

        }
    };
    private void initOnewaySdk() {
        String appId = "5ddf3fd3b118495e";
        //Toast.makeText(this, "初始化,请稍后", Toast.LENGTH_LONG).show();
        // 开启测试模式，输出更多日志
        OnewaySdk.setDebugMode(true);
        OnewaySdk.configure(MainActivity.this, appId);
        OWRewardedAd.init(rewardedAdListener);
        //OWInterstitialAd.init(interstitialAdListener);
    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initOnewaySdk();

        if (OWRewardedAd.isReady()) {
            OWRewardedAd.show(this, "rewarded");
            Toast.makeText(this, "广告已经准备好了", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "广告还未准备好", Toast.LENGTH_SHORT).show();
        }
    }

}
