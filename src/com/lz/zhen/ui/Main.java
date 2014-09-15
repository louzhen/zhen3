package com.lz.zhen.ui;

import com.lz.zhen.util.DatabaseUtil;
import com.lz.zhen.util.DialogUtil;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View.OnKeyListener;
import android.view.Window;
import android.widget.TabHost;

public class Main extends TabActivity {
	final static String tagShu = "shu";
	final static String tagWei = "wei";
	final static String tagZhong = "zhong";
	final static String tagWu = "wu";
	final static String tagMe = "me";
	final static String InShu = "���";
	final static String  InWei = "κ��";
	final static String  InZhong = "����";
	final static String  InWu = "��Ʒ";
	final static String  InMe = "����";
	TabHost tabHost;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.main);
        setTab();
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	super.onDestroy();
    }
    
    public void setTab()
    {
    	tabHost = getTabHost();
    	tabHost.addTab(tabHost.newTabSpec(tagShu).setIndicator(InShu,getResources().getDrawable(R.drawable.radio1)).setContent(new Intent(this, ShuUi.class)));
    	tabHost.addTab(tabHost.newTabSpec(tagWei).setIndicator(InWei,getResources().getDrawable(R.drawable.radio1)).setContent(new Intent(this, WeiUi.class)));
    	tabHost.addTab(tabHost.newTabSpec(tagZhong).setIndicator(InZhong,getResources().getDrawable(R.drawable.radio1)).setContent(new Intent(this, ZhongUi.class)));
    	tabHost.addTab(tabHost.newTabSpec(tagWu).setIndicator(InWu,getResources().getDrawable(R.drawable.radio1)).setContent(new Intent(this, WuUi.class)));
    	tabHost.addTab(tabHost.newTabSpec(tagMe).setIndicator(InMe,getResources().getDrawable(R.drawable.radio1)).setContent(new Intent(this, MeUi.class)));
    }
      
}