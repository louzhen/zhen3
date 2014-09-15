package com.lz.zhen.ui;

import com.lz.zhen.ui.WeiUi.MyAdapter;
import com.lz.zhen.ui.WeiUi.MyOnItemClickListener;
import com.lz.zhen.ui.WeiUi.ViewHolder;
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

public class WuUi extends Activity{
	final static String[] wuHero ={"ҽ�Ƽ�","����ҩˮ","��������","��������","��ũ����","������","�ݼ�����","���ӱ���" , "̫ƽҪ��", "�ϵ�����",
													"��ľ��֦", "��������","��������","ƤЬ","�λ�","����","��������","��������","�ٶ�֮ѥ","�ָ�ָ��",
													"��ʦ����","����ͷ��","�����","��ȸ��","������","��ʯ","�ٲ���","�","ҹ����","���α�ʯ",
													"����","����","����","����","����","�������","�����̽�","����֮��","���֮��","ذ��",
													"����","���","����֮�m","�¹�ǹ","��ǹ","��Ѫذ��","����ذ��","��","���ҹ�","ʷ��",
													"��ǹ","��罣","����","��������","�����","�ɵ�","������","���ٷ�","��սʿ֮��","�����ĵ�",
													"�ټ���","�籩֮��","��ħ��","���丫","����m","��ʿ��","��ѥ","������","������","������",
													"Դʽ֮��","���ǽ�","���콣","��ظ�","Ѫ��","��������","��Ʒ�ϳ�(���ר��)","��Ʒ�ϳ�(κ��ר��)"};
	final static int[] wuHeroImgID ={R.drawable.ylj,R.drawable.jhys,R.drawable.zlsw,R.drawable.gssw,R.drawable.snbc,R.drawable.qns,R.drawable.djts,R.drawable.szbf,R.drawable.tpys,R.drawable.mdxs,
		R.drawable.tmsz,R.drawable.llst,R.drawable.zldp,R.drawable.px,R.drawable.sh,R.drawable.hw,R.drawable.jsst,R.drawable.yrmz,R.drawable.sdzx,R.drawable.hfzh,
		R.drawable.fscp,R.drawable.nltk,R.drawable.xwj,R.drawable.zqy,R.drawable.qld,R.drawable.zs,R.drawable.bcw,R.drawable.hd,R.drawable.ymz,R.drawable.xxbs,
		R.drawable.by,R.drawable.ly,R.drawable.ly1,R.drawable.yy,R.drawable.dy,R.drawable.zzyc,R.drawable.dzdj,R.drawable.llzf,R.drawable.fjzz,R.drawable.bs,
		R.drawable.tj,R.drawable.tj1,R.drawable.gtzc,R.drawable.ygq,R.drawable.tq,R.drawable.xxbs,R.drawable.xtbs,R.drawable.df,R.drawable.hzg,R.drawable.sj,
		R.drawable.yq,R.drawable.qhj,R.drawable.yj3,R.drawable.llhw,R.drawable.hsf,R.drawable.xd,R.drawable.qlx,R.drawable.ssf,R.drawable.kzszf,R.drawable.hwxd,
		R.drawable.tjk,R.drawable.fbzz,R.drawable.tmd,R.drawable.xwf,R.drawable.egc,R.drawable.wsd,R.drawable.xx,R.drawable.fxr,R.drawable.wsz,R.drawable.hlj,
		R.drawable.yszk,R.drawable.qxj,R.drawable.ytj,R.drawable.ddf,R.drawable.xf,R.drawable.yxmr,R.drawable.wphc1,R.drawable.wphc2};
	
	
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
	    		DialogUtil.ShowDialog(WuUi.this, "ȷ���˳����ԣ�");
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
				Intent intent00 = new Intent(WuUi.this,WuOneUi.class);
				intent00.putExtra("name", wuHero[arg2]);
				startActivity(intent00);
		}
	}
	
	class MyAdapter extends BaseAdapter
	{
		@Override
		public int getCount() {
			return wuHero.length;
		}

		@Override
		public Object getItem(int position) {
			return wuHero[position];
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
			viewhold.textView.setText(wuHero[position]);
			viewhold.imageView.setImageResource(wuHeroImgID[position]);
			return convertView;
		}
	}
	class ViewHolder
	{
		TextView textView;
		ImageView imageView;
	}
}
