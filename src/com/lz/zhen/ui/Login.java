package com.lz.zhen.ui;

import com.lz.zhen.util.DatabaseUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Login extends Activity{
	DatabaseUtil databaseUtil ;
	myHandler handler1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		handler1 = new myHandler();
		
    	Message msg = Message.obtain();
    	msg.what  = 1;
    	handler1.sendMessageDelayed(msg,100);
	}
    @Override
    protected void onDestroy() {
    //	databaseUtil.closeDatabase();
    	super.onDestroy();
    }

	 private void setData()
	    {
	    	databaseUtil =  DatabaseUtil.getInstance(getApplicationContext());
	    }
	    
	class myHandler extends Handler
	{
		@Override
		public void handleMessage(Message msg) {
			if(msg.what == 1)
			{
				setData();
				Intent intent01 = new Intent(Login.this,Main.class);
				startActivity(intent01);
				finish();
			}
			super.handleMessage(msg);
		}
	}
	
}
