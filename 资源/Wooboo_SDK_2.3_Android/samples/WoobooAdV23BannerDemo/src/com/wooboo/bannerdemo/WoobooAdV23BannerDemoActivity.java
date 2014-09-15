package com.wooboo.bannerdemo;

import com.wooboo.adlib_android.AdListener;
import com.wooboo.adlib_android.WoobooAdView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Adapter;

public class WoobooAdV23BannerDemoActivity extends Activity implements AdListener {
	/** Called when the activity is first created. */

	private String TAG = "Wooboo SDK V2.3 bannerdemo";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		WoobooAdView bannerview = (WoobooAdView) this.findViewById(R.id.wooboobanner);
		bannerview.setAdListener(this);
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