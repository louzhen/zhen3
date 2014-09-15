package com.wooboo.impressiondemo;

import com.wooboo.adlib_android.AdListener;
import com.wooboo.adlib_android.ImpressionAdView;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

public class WoobooAdV23ImpressionDemoActivity extends Activity implements AdListener {
	/** Called when the activity is first created. */
	private String TAG = "Wooboo SDK V2.3 ImpressionDemo";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		LinearLayout layout = (LinearLayout) this.findViewById(R.id.adlayout);
		ImpressionAdView ad = new ImpressionAdView(this, layout, 0, 100, 0xFFFFFFFF);
		ad.show(40);
		// ad.show();//只请求一次广告
		ad.setAdListener(this);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		ImpressionAdView.close();
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
