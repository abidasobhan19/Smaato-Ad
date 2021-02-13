package com.forbitbd.test;


import android.os.Bundle;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import com.smaato.sdk.banner.ad.BannerAdSize;
import com.smaato.sdk.banner.widget.BannerError;
import com.smaato.sdk.banner.widget.BannerView;



public class MainActivity extends AppCompatActivity {

private  BannerView bannerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BannerView bannerView =  findViewById(R.id.bannerview);

        // load banner with desired size
        bannerView.loadAd("131629459", BannerAdSize.XX_LARGE_320x50);

         bannerView.setEventListener(new BannerView.EventListener() {
             @Override
             public void onAdLoaded(@NonNull BannerView bannerView) {
                 Toast.makeText(MainActivity.this, "ad loaded", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onAdFailedToLoad(@NonNull BannerView bannerView, @NonNull BannerError bannerError) {


                 Toast.makeText(MainActivity.this, "ad load failed", Toast.LENGTH_SHORT).show();
             }

             @Override
             public void onAdImpression(@NonNull BannerView bannerView) {

             }

             @Override
             public void onAdClicked(@NonNull BannerView bannerView) {

             }

             @Override
             public void onAdTTLExpired(@NonNull BannerView bannerView) {

             }
         });
    }



    }
