package com.wooboo.bannercodedemo;

import com.wooboo.adlib_android.AdListener;
import com.wooboo.adlib_android.WoobooAdView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

public class WoobooAdV23BannerCodeDemoActivity extends Activity implements AdListener{
    /** Called when the activity is first created. */
	private String TAG = "Wooboo SDK V2.3 BannerCodeDemo";
	private WoobooAdView ad;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        LinearLayout adlayout = (LinearLayout) this.findViewById(R.id.adlayout);
        
        ad = new WoobooAdView(this, 0xFF000000, 0xFFFFFFFF, 40);
		LayoutParams params = new LayoutParams(LayoutParams.FILL_PARENT, LayoutParams.WRAP_CONTENT);
		ad.setLayoutParams(params);
		adlayout.addView(ad);
		ad.setAdListener(this);// 开发者可以不调用该接口
    }
    
    @Override
	public void onFailedToReceiveAd(Object arg0) {
		Log.e(TAG, "onFailedToReceiveAd");
	}

	@Override
	public void onPlayFinish() {
		Log.e(TAG, "onPlayFinish");

	}

	@Override
	public void onReceiveAd(Object arg0) {
		Log.e(TAG, "onReceiveAd");

	}
}