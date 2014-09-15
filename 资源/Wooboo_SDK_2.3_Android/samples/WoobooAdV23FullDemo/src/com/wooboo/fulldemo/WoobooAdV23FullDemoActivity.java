package com.wooboo.fulldemo;

import com.wooboo.adlib_android.AdListener;
import com.wooboo.adlib_android.FullAdView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class WoobooAdV23FullDemoActivity extends Activity implements AdListener {
    /** Called when the activity is first created. */
	
	private String TAG = "Wooboo SDK V2.3 FullDemo";
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        FullAdView full = new FullAdView(this);
        full.setAdListener(this);
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