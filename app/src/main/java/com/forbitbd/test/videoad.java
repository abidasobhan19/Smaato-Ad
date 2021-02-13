package com.forbitbd.test;




import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;


import com.smaato.sdk.rewarded.EventListener;
import com.smaato.sdk.rewarded.RewardedError;
import com.smaato.sdk.rewarded.RewardedInterstitial;
import com.smaato.sdk.rewarded.RewardedInterstitialAd;
import com.smaato.sdk.rewarded.RewardedRequestError;


public class videoad extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_videoad);

        RewardedInterstitial.loadAd("130626428", eventListener);


    }

    EventListener eventListener = new EventListener() {
        @Override
        public void onAdLoaded(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {

            rewardedInterstitialAd.showAd();

        }

        @Override
        public void onAdFailedToLoad(@NonNull RewardedRequestError rewardedRequestError) {
            Toast.makeText(videoad.this, "adload failed", Toast.LENGTH_SHORT).show();

        }

        @Override
        public void onAdError(@NonNull RewardedInterstitialAd rewardedInterstitialAd, @NonNull RewardedError rewardedError) {

        }

        @Override
        public void onAdClosed(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {

        }

        @Override
        public void onAdClicked(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {

        }

        @Override
        public void onAdStarted(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {

        }

        @Override
        public void onAdReward(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {

        }

        @Override
        public void onAdTTLExpired(@NonNull RewardedInterstitialAd rewardedInterstitialAd) {

        }
    };



}