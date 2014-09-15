package com.lz.zhen.ui;

import java.lang.annotation.RetentionPolicy;

import com.lz.zhen.util.DialogUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ShuUi extends Activity{
	final static String[] shuHero ={"÷Ó∏¡¡","’≈∑…","πÿ”","’‘‘∆","Œ∫—”","¡ı±∏","ª∆÷“","¬Ì≥¨","ª∆‘¬”¢","≈”Õ≥","√œªÒ","◊£»⁄∑Ú»À","–Ï ¸","¬Ì¡º","√”Û√","¬Ì·∑","¥Ûµÿ","±©∑Á","–‹√®»À"};
	final static int[] shuHeroImgID ={R.drawable.bzhugeliang,R.drawable.bo0021,R.drawable.bo003,R.drawable.bee000,R.drawable.bh0041,
		R.drawable.liubei2,R.drawable.hz2,R.drawable.mc2,R.drawable.hyy2,R.drawable.pt2,
		R.drawable.mh2,R.drawable.zr2,R.drawable.xs2,R.drawable.ml2,R.drawable.mz2,
		R.drawable.md2,R.drawable.dd2,R.drawable.bf2,R.drawable.xmr2};
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.herolist);
		setListContent();
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}
	
	 @Override
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	    
	    if(keyCode == KeyEvent.KEYCODE_BACK)
	    	{
	    		DialogUtil.ShowDialog(ShuUi.this, "»∑∂®ÕÀ≥ˆπ•¬‘£ø");
	    		return true;
	    	}
	    	return super.onKeyDown(keyCode, event);
	    }
	
	public void setListContent()
	{
		ListView listView = (ListView)findViewById(R.id.listview_herolist);
		MyAdapter myAdapter = new MyAdapter(); 
		listView.setAdapter(myAdapter);
		listView.setOnItemClickListener(new MyOnItemClickListener());
	}
	class MyOnItemClickListener implements OnItemClickListener
	{
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
				Intent intent00 = new Intent(ShuUi.this,HeroUi.class);
				intent00.putExtra("name", shuHero[arg2]);
				startActivity(intent00);
		}
	}
	
	class MyAdapter extends BaseAdapter
	{
		@Override
		public int getCount() {
			return shuHero.length;
		}

		@Override
		public Object getItem(int position) {
			return shuHero[position];
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			ViewHolder viewhold;
			if (convertView == null) {
				viewhold = new ViewHolder();
				convertView = getLayoutInflater().inflate(R.layout.heroitem,null);
				viewhold.textView = (TextView)convertView.findViewById(R.id.textview_heroitem);
				viewhold.imageView = (ImageView)convertView.findViewById(R.id.imageview_heroitem);
				convertView.setTag(viewhold);
			}
			else {
				viewhold = (ViewHolder)convertView.getTag();
			}
			viewhold.textView.setText(shuHero[position]);
			viewhold.imageView.setImageResource(shuHeroImgID[position]);
			return convertView;
		}
	}
	class ViewHolder
	{
		TextView textView;
		ImageView imageView;
	}
}
