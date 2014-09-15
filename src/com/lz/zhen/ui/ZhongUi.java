package com.lz.zhen.ui;

import com.lz.zhen.ui.WuUi.MyAdapter;

import com.lz.zhen.ui.WuUi.MyOnItemClickListener;
import com.lz.zhen.ui.WuUi.ViewHolder;
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

public class ZhongUi extends Activity{
	final static String[] zhongHero ={"阿速达","大乔","太史慈","小乔","孙权"};
	final static int[] zhongHeroImgID ={R.drawable.asd2,R.drawable.dq2,R.drawable.tsc2,R.drawable.xq2,R.drawable.sq2};
	
	
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
	    		DialogUtil.ShowDialog(ZhongUi.this, "确定退出攻略？");
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
				Intent intent00 = new Intent(ZhongUi.this,HeroUi.class);
				intent00.putExtra("name", zhongHero[arg2]);
				startActivity(intent00);
		}
	}
	
	class MyAdapter extends BaseAdapter
	{
		@Override
		public int getCount() {
			return zhongHero.length;
		}

		@Override
		public Object getItem(int position) {
			return zhongHero[position];
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
			viewhold.textView.setText(zhongHero[position]);
			viewhold.imageView.setImageResource(zhongHeroImgID[position]);
			return convertView;
		}
	}
	class ViewHolder
	{
		TextView textView;
		ImageView imageView;
	}
}
