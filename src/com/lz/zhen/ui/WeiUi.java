package com.lz.zhen.ui;

import com.lz.zhen.ui.ShuUi.MyAdapter;
import com.lz.zhen.ui.ShuUi.MyOnItemClickListener;
import com.lz.zhen.ui.ShuUi.ViewHolder;
import com.lz.zhen.util.DialogUtil;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class WeiUi extends Activity{
	final static String[] weiHero ={"Àæ¬Ì‹≤","µ‰Œ§","‹˜è™","π˘ºŒ","≤‹» ","≤‹≤Ÿ","œƒ∫Ó∂ÿ","œƒ∫Ó‘®","∑˛≤ø∞Î≤ÿ","’Áºß","–ÌÒ“","’≈¡…","’≈Ú¢","”⁄Ω˚","≤‹∫È","º÷⁄º","–ÏªŒ"};
	final static int[] weiHeroImgID ={R.drawable.smy2,R.drawable.dw2,R.drawable.xy2,R.drawable.gj2,R.drawable.cr2,
		R.drawable.cc2,R.drawable.xhd2,R.drawable.xhy2,R.drawable.fbbz2,R.drawable.zj2,
		R.drawable.xc2,R.drawable.zl2,R.drawable.zh2,R.drawable.yj2,R.drawable.ch2,
		R.drawable.jx2,R.drawable.xh2};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.herolist);
		setListContent();
	}
	 @Override
	 public boolean onKeyDown(int keyCode, KeyEvent event) {
	    
	    if(keyCode == KeyEvent.KEYCODE_BACK)
	    	{
	    		DialogUtil.ShowDialog(WeiUi.this, "»∑∂®ÕÀ≥ˆπ•¬‘£ø");
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
				Intent intent00 = new Intent(WeiUi.this,HeroUi.class);
				intent00.putExtra("name", weiHero[arg2]);
				startActivity(intent00);
		}
	}
	
	class MyAdapter extends BaseAdapter
	{
		@Override
		public int getCount() {
			return weiHero.length;
		}

		@Override
		public Object getItem(int position) {
			return weiHero[position];
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
			viewhold.textView.setText(weiHero[position]);
			viewhold.imageView.setImageResource(weiHeroImgID[position]);
			return convertView;
		}
	}
	class ViewHolder
	{
		TextView textView;
		ImageView imageView;
	}
}
