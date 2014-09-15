package com.lz.zhen.ui;

import com.lz.zhen.util.DialogUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;

public class MeUi extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
	}
	 @Override
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	    
	    if(keyCode == KeyEvent.KEYCODE_BACK)
	    	{
	    		DialogUtil.ShowDialog(MeUi.this, "È·¶¨ÍË³ö¹¥ÂÔ£¿");
	    		return true;
	    	}
	    	return super.onKeyDown(keyCode, event);
	    }
}
