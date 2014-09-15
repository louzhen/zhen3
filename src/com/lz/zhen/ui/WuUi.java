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
	final static String[] wuHero ={"医疗剂","净化药水","治疗守卫","岗哨守卫","神农本草","青囊书","遁甲天书","孙子兵法" , "太平要术", "孟德新书",
													"铁木树枝", "力量手套","智力斗篷","皮鞋","饰环","护腕","加速手套","艺人面罩","速度之靴","恢复指环",
													"法师长袍","耐力头盔","玄武甲","朱雀翼","青龙胆","钻石","百草丸","活丹","夜明珠","显形宝石",
													"冰玉","烈玉","雷玉","炎玉","毒玉","铸造用槌","盗贼短剑","力量之斧","否决之杖","匕首",
													"铁剑","铁戟","钢铁之鎚","月光枪","铁枪","吸血匕首","玄铁匕首","大斧","黄忠弓","史记",
													"银枪","青虹剑","银剑","力量护腕","护身符","仙丹","麒麟心","神速符","狂战士之斧","护卫心得",
													"藤甲铠","风暴之杖","退魔刀","玄武斧","恶鬼鎚","武士刀","翔靴","风行刃","巫术杖","黄龙剑",
													"源式之铠","七星剑","倚天剑","大地斧","血斧","月下美人","物品合成(蜀国专属)","物品合成(魏国专属)"};
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
	    		DialogUtil.ShowDialog(WuUi.this, "确定退出攻略？");
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
