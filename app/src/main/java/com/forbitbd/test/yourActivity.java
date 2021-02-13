//package com.forbitbd.test;
//
//import android.app.Activity;
//
//import android.os.Bundle;
//
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//
//import com.smaato.sdk.interstitial.EventListener;
//import com.smaato.sdk.interstitial.Interstitial;
//import com.smaato.sdk.interstitial.InterstitialAd;
//import com.smaato.sdk.interstitial.InterstitialError;
//import com.smaato.sdk.interstitial.InterstitialRequestError;
//
//
//public class yourActivity extends Activity  {
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//
//        Interstitial.loadAd("131628617", eventListener);
//
//
//    }
//
//    EventListener eventListener = new EventListener() {
//
//
//        @Override
//        //show interstitial ad when it loaded successfully
//        public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
//
//
//            interstitialAd.setBackgroundColor(0xff123456);
//            interstitialAd.showAd(this,);
//
//
//
//        }
//
//        @Override
//        // interstitial ad failed to load
//        public void onAdFailedToLoad(@NonNull InterstitialRequestError interstitialRequestError) {}
//
//        @Override
//        // interstitial ad had an unexpected error
//        public void onAdError(@NonNull InterstitialAd interstitialAd, @NonNull InterstitialError interstitialError) {}
//
//        @Override
//        // interstitial ad opened and was shown successfully
//        public void onAdOpened(@NonNull InterstitialAd interstitialAd) {}
//
//        @Override
//        // interstitial ad was closed by the user
//        public void onAdClosed(@NonNull InterstitialAd interstitialAd) {}
//
//        @Override
//        // interstitial ad was clicked by the user
//        public void onAdClicked(@NonNull InterstitialAd interstitialAd) {}
//
//        @Override
//        // interstitial ad was viewed by the user
//        public void onAdImpression(@NonNull InterstitialAd interstitialAd) {}
//
//        @Override
//        // interstitial ad Time to Live expired
//        public void onAdTTLExpired(@NonNull InterstitialAd interstitialAd) {}
//    };
//}
