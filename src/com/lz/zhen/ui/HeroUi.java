package com.lz.zhen.ui;

import java.io.IOException;

import com.lz.zhen.logic.HeroSkill;
import com.lz.zhen.logic.NameValueUtil;
import com.lz.zhen.util.DatabaseUtil;
import com.lz.zhen.util.XmlUtil;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class HeroUi extends Activity{
	private int index;  //英雄索引值
	private int level;  //当前等级
	private Double strong;  //当前力量
	private Double agile;  //当前敏捷
	private Double intelligence; //当前智力
	private int life;  // 基础生命值
	private int magic; //基础魔法
	private int attacklow; //基础低攻击
	private int attackhigh; //基础高攻击
	private Double armor; //基础护甲
	private int herotype;  //英雄类型    1力量  2 敏捷  3智力
	TextView textView05;   //血
	TextView textView06;  //魔法
	TextView textView08;  //等级
	TextView textView10;   //攻击
	TextView textView12;  //护甲
	TextView textView13;  //力量
	TextView textView14;  //敏捷
	TextView textView15;  //智力
	
	//技能相关
	TextView textView16;
	TextView textView17;
	TextView textView18;
	TextView textView19;
	TextView textView20;
	TextView textView21;
	TextView textView22;
	TextView textView23;
	TextView textView24;
	TextView textView25;
	TextView textView26;
	TextView textView27;
	TextView textView28;
	TextView textView29;
	TextView textView30;
	TextView textView31;
	TextView textView32;
	TextView textView33;
	TextView textView34;
	TextView textView35 ;
	TextView textView36;
	TextView textView37 ;
	TextView textView38 ;
	TextView textView39 ;
	TextView textView40 ;
	TextView textView41;
	TextView textView42;
	TextView textView43 ;
	TextView textView44 ;
	
	HeroSkill heroskill;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.herodetail);
		setDetail();
	}
	
	//获取英雄索引值
	void setDetail()
	{
		level = 1;
		life = 100;
		magic = 0;
	    index = NameValueUtil.getValue(getIntent().getStringExtra("name"));
		ImageView imageView01 = (ImageView)findViewById(R.id.image_herodetail_1);
		ImageView imageView02 = (ImageView)findViewById(R.id.image_herodetail_2);
		ImageView imageView03 = (ImageView)findViewById(R.id.image_herodetail_3);
		ImageView imageView04 = (ImageView)findViewById(R.id.image_herodetail_4);
		ImageView imageView05 = (ImageView)findViewById(R.id.image_herodetail_5);
		ImageView imageView06 = (ImageView)findViewById(R.id.image_herodetail_6);
		ImageView imageView07 = (ImageView)findViewById(R.id.image_herodetail_7);
		TextView textView02 = (TextView)findViewById(R.id.textview_herodetail_2);
		TextView textView04 = (TextView)findViewById(R.id.textview_herodetail_4);
		TextView textView45 = (TextView)findViewById(R.id.textview_herodetail_45);
		
		//技能相关
		textView16 = (TextView)findViewById(R.id.textview_herodetail_16);
		textView17 = (TextView)findViewById(R.id.textview_herodetail_17);
		textView18 = (TextView)findViewById(R.id.textview_herodetail_18);
		textView19 = (TextView)findViewById(R.id.textview_herodetail_19);
		textView20 = (TextView)findViewById(R.id.textview_herodetail_20);
		textView21 = (TextView)findViewById(R.id.textview_herodetail_21);
		textView22 = (TextView)findViewById(R.id.textview_herodetail_22);
		textView23 = (TextView)findViewById(R.id.textview_herodetail_23);
		textView24 = (TextView)findViewById(R.id.textview_herodetail_24);
		textView25 = (TextView)findViewById(R.id.textview_herodetail_25);
		textView26 = (TextView)findViewById(R.id.textview_herodetail_26);
		textView27 = (TextView)findViewById(R.id.textview_herodetail_27);
		textView28 = (TextView)findViewById(R.id.textview_herodetail_28);
		textView29 = (TextView)findViewById(R.id.textview_herodetail_29);
		textView30 = (TextView)findViewById(R.id.textview_herodetail_30);
		textView31 = (TextView)findViewById(R.id.textview_herodetail_31);
		textView32 = (TextView)findViewById(R.id.textview_herodetail_32);
		textView33 = (TextView)findViewById(R.id.textview_herodetail_33);
		textView34 = (TextView)findViewById(R.id.textview_herodetail_34);
		textView35 = (TextView)findViewById(R.id.textview_herodetail_35);
		textView36 = (TextView)findViewById(R.id.textview_herodetail_36);
		textView37 = (TextView)findViewById(R.id.textview_herodetail_37);
		textView38 = (TextView)findViewById(R.id.textview_herodetail_38);
		textView39 = (TextView)findViewById(R.id.textview_herodetail_39);
		textView40 = (TextView)findViewById(R.id.textview_herodetail_40);
		textView41 = (TextView)findViewById(R.id.textview_herodetail_41);
		textView42 = (TextView)findViewById(R.id.textview_herodetail_42);
		textView43 = (TextView)findViewById(R.id.textview_herodetail_43);
		textView44 = (TextView)findViewById(R.id.textview_herodetail_44);
		
	    textView05 = (TextView)findViewById(R.id.textview_herodetail_5);
		textView06 = (TextView)findViewById(R.id.textview_herodetail_6);
		textView08 = (TextView)findViewById(R.id.textview_herodetail_8);
		textView10 = (TextView)findViewById(R.id.textview_herodetail_10);
		textView12 = (TextView)findViewById(R.id.textview_herodetail_12);
		textView13 = (TextView)findViewById(R.id.textview_herodetail_13);
		textView14 = (TextView)findViewById(R.id.textview_herodetail_14);
		textView15 = (TextView)findViewById(R.id.textview_herodetail_15);
		Button button01= (Button)findViewById(R.id.button_herodetail_1);
		Button button02= (Button)findViewById(R.id.button_herodetail_2);
		button01.setOnClickListener(new myOnclickListenerL());
		button02.setOnClickListener(new myOnclickListenerR());
		DatabaseUtil databaseUtil =  DatabaseUtil.getInstance(getApplicationContext());
		
		switch (index) {
		case 1: //诸葛
			imageView01.setImageResource(R.drawable.zhugeliang);
			imageView02.setImageResource(R.drawable.hhh008);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.a087);
			imageView05.setImageResource(R.drawable.a085);
			imageView06.setImageResource(R.drawable.a08a);
			imageView07.setImageResource(R.drawable.a083);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("zhugeliang.xml");
			
			strong = new Double(19);
			agile = new Double(16);
			intelligence = new Double(25);
			attacklow = 18;
			attackhigh = 24;
			herotype = 3; //
			
			updateView();
			break;
		case 2: //张飞
			imageView01.setImageResource(R.drawable.o0021);
			imageView02.setImageResource(R.drawable.o002);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.a04w);
			imageView05.setImageResource(R.drawable.a009);
			imageView06.setImageResource(R.drawable.aamgr);
			imageView07.setImageResource(R.drawable.a006);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("zhangfei.xml");
			
			strong = new Double(25);
			agile = new Double(17);
			intelligence = new Double(15);
			attacklow = 22;
			attackhigh = 32;
			herotype = 1; //
			
			updateView();
			break;
		case 3: //关羽
			imageView01.setImageResource(R.drawable.o003);
			imageView02.setImageResource(R.drawable.ooo003	);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.a011);
			imageView05.setImageResource(R.drawable.a00r);
			imageView06.setImageResource(R.drawable.a00c);
			imageView07.setImageResource(R.drawable.a00a);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("guanyu.xml");
			
			strong = new Double(25);
			agile = new Double(20);
			intelligence = new Double(15);
			attacklow = 27;
			attackhigh = 37;
			herotype = 1; //
			
			updateView();
			break;
		case 4: //赵云
			imageView01.setImageResource(R.drawable.ee000);
			imageView02.setImageResource(R.drawable.e000);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.a06k);
			imageView05.setImageResource(R.drawable.aa01b);
			imageView06.setImageResource(R.drawable.a019);
			imageView07.setImageResource(R.drawable.a01v);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("zhaoyun.xml");
			
			strong = new Double(22);
			agile = new Double(22);
			intelligence = new Double(16);
			attacklow = 27;
			attackhigh = 37;
			herotype = 2; //
			
			updateView();
			break;
			
		case 5: //魏延
			imageView01.setImageResource(R.drawable.wy1);
			imageView02.setImageResource(R.drawable.wy3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.wys1);
			imageView05.setImageResource(R.drawable.aa01b);
			imageView06.setImageResource(R.drawable.wys3);
			imageView07.setImageResource(R.drawable.wys4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("weiyan.xml");
			
			strong = new Double(23);
			agile = new Double(20);
			intelligence = new Double(17);
			attacklow = 25;
			attackhigh = 35;
			herotype = 1; //
			
			updateView();
			break;
			
		case 6: //刘备
			imageView01.setImageResource(R.drawable.liubei);
			imageView02.setImageResource(R.drawable.lb3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.lbs1);
			imageView05.setImageResource(R.drawable.lbs2);
			imageView06.setImageResource(R.drawable.lbs3);
			imageView07.setImageResource(R.drawable.lbs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("liubei.xml");
			
			strong = new Double(20);
			agile = new Double(20);
			intelligence = new Double(20);
			attacklow = 25;
			attackhigh = 35;
			herotype = 2; //
			
			updateView();
			break;
		case 7: //黄忠
			imageView01.setImageResource(R.drawable.hz1);
			imageView02.setImageResource(R.drawable.hz3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.hzs1);
			imageView05.setImageResource(R.drawable.hzs2);
			imageView06.setImageResource(R.drawable.hzs3);
			imageView07.setImageResource(R.drawable.hzs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("huangzhong.xml");
			
			strong = new Double(18);
			agile = new Double(25);
			intelligence = new Double(17);
			attacklow = 20;
			attackhigh = 30;
			herotype = 2; //
			
			updateView();
			break;
		case 8: //马超
			imageView01.setImageResource(R.drawable.mc1);
			imageView02.setImageResource(R.drawable.mc3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.mcs1);
			imageView05.setImageResource(R.drawable.mcs2);
			imageView06.setImageResource(R.drawable.mcs3);
			imageView07.setImageResource(R.drawable.mcs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("machao.xml");
			
			strong = new Double(22);
			agile = new Double(23);
			intelligence = new Double(15);
			attacklow = 20;
			attackhigh = 30;
			herotype = 2; //
			
			updateView();
			break;
		case 9: //黄月英
			imageView01.setImageResource(R.drawable.hyy1);
			imageView02.setImageResource(R.drawable.hyy3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.hyys1);
			imageView05.setImageResource(R.drawable.hyys2);
			imageView06.setImageResource(R.drawable.hyys3);
			imageView07.setImageResource(R.drawable.hyys4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("huangyueyin.xml");
			
			strong = new Double(19);
			agile = new Double(22);
			intelligence = new Double(19);
			attacklow = 16;
			attackhigh = 30;
			herotype = 2; //
			
			updateView();
			break;
		case 10: //庞统
			imageView01.setImageResource(R.drawable.pt1);
			imageView02.setImageResource(R.drawable.pt3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.pts1);
			imageView05.setImageResource(R.drawable.pts2);
			imageView06.setImageResource(R.drawable.pts3);
			imageView07.setImageResource(R.drawable.pts4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("pangtong.xml");
			
			strong = new Double(18);
			agile = new Double(17);
			intelligence = new Double(25);
			attacklow = 17;
			attackhigh = 23;
			herotype = 3; //
			
			updateView();
			break;
		case 11: //孟获
			imageView01.setImageResource(R.drawable.mh1);
			imageView02.setImageResource(R.drawable.mh3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.mhs1);
			imageView05.setImageResource(R.drawable.mhs2);
			imageView06.setImageResource(R.drawable.mhs3);
			imageView07.setImageResource(R.drawable.mhs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("menghuo.xml");
			
			strong = new Double(28);
			agile = new Double(16);
			intelligence = new Double(16);
			attacklow = 20;
			attackhigh = 30;
			herotype = 1; //
			
			updateView();
			break;
		case 12: //祝融夫人
			imageView01.setImageResource(R.drawable.zr1);
			imageView02.setImageResource(R.drawable.zrfr3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.zrfrs1);
			imageView05.setImageResource(R.drawable.zrfrs2);
			imageView06.setImageResource(R.drawable.zrfrs3);
			imageView07.setImageResource(R.drawable.zrfrs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("zhurongfuren.xml");
			
			strong = new Double(21);
			agile = new Double(22);
			intelligence = new Double(17);
			attacklow = 16;
			attackhigh = 26;
			herotype = 2; //
			
			updateView();
			break;
		case 13: //徐庶
			imageView01.setImageResource(R.drawable.xs1);
			imageView02.setImageResource(R.drawable.xs3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xss1);
			imageView05.setImageResource(R.drawable.xss2);
			imageView06.setImageResource(R.drawable.xss3);
			imageView07.setImageResource(R.drawable.xss4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xushu.xml");
			
			strong = new Double(21);
			agile = new Double(17);
			intelligence = new Double(24);
			attacklow = 12;
			attackhigh = 18;
			herotype = 3; //
			
			updateView();
			break;
		case 14: //马良
			imageView01.setImageResource(R.drawable.ml1);
			imageView02.setImageResource(R.drawable.ml3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.mls1);
			imageView05.setImageResource(R.drawable.mls2);
			imageView06.setImageResource(R.drawable.mls3);
			imageView07.setImageResource(R.drawable.mls4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("maliang.xml");
			
			strong = new Double(17);
			agile = new Double(20);
			intelligence = new Double(23);
			attacklow = 17;
			attackhigh = 23;
			herotype = 3; //
			
			updateView();
			break;
		case 15: //糜竺
			imageView01.setImageResource(R.drawable.mz1);
			imageView02.setImageResource(R.drawable.mz3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.mzs1);
			imageView05.setImageResource(R.drawable.mzs2);
			imageView06.setImageResource(R.drawable.mzs3);
			imageView07.setImageResource(R.drawable.mzs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("mizhu.xml");
			
			strong = new Double(16);
			agile = new Double(18);
			intelligence = new Double(26);
			attacklow = 12;
			attackhigh = 18;
			herotype = 3; //
			
			updateView();
			break;
		case 16: //马岱
			imageView01.setImageResource(R.drawable.md1);
			imageView02.setImageResource(R.drawable.md3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.mds1);
			imageView05.setImageResource(R.drawable.mds2);
			imageView06.setImageResource(R.drawable.mds3);
			imageView07.setImageResource(R.drawable.mds4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("madai.xml");
			
			strong = new Double(18);
			agile = new Double(25);
			intelligence = new Double(17);
			attacklow = 16;
			attackhigh = 26;
			herotype = 2; //
			
			updateView();
			break;
		case 17: //大地
			imageView01.setImageResource(R.drawable.dd1);
			imageView02.setImageResource(R.drawable.dd3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.dds1);
			imageView05.setImageResource(R.drawable.dds2);
			imageView06.setImageResource(R.drawable.dds3);
			imageView07.setImageResource(R.drawable.dds4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("dadi.xml");
			
			strong = new Double(23);
			agile = new Double(18);
			intelligence = new Double(19);
			attacklow = 15;
			attackhigh = 25;
			herotype = 1; //
			
			updateView();
			break;
		case 18: //暴风
			imageView01.setImageResource(R.drawable.bf1);
			imageView02.setImageResource(R.drawable.bf3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.bfs1);
			imageView05.setImageResource(R.drawable.bfs2);
			imageView06.setImageResource(R.drawable.bfs3);
			imageView07.setImageResource(R.drawable.bfs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("baofeng.xml");
			
			strong = new Double(19);
			agile = new Double(19);
			intelligence = new Double(24);
			attacklow = 	12;
			attackhigh = 18;
			herotype = 3; //
			
			updateView();
			break;
		case 19: //熊猫人
			imageView01.setImageResource(R.drawable.xmr1);
			imageView02.setImageResource(R.drawable.xmr3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xmrs1);
			imageView05.setImageResource(R.drawable.xmrs2);
			imageView06.setImageResource(R.drawable.xmrs3);
			imageView07.setImageResource(R.drawable.xmrs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xiongmaoren.xml");
			
			strong = new Double(23);
			agile = new Double(20);
			intelligence = new Double(16);
			attacklow = 27;
			attackhigh = 37;
			herotype = 1; //
			
			updateView();
			break;
		
		case 20: //司马懿
			imageView01.setImageResource(R.drawable.smy1);
			imageView02.setImageResource(R.drawable.smy3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.smys1);
			imageView05.setImageResource(R.drawable.smys2);
			imageView06.setImageResource(R.drawable.smys3);
			imageView07.setImageResource(R.drawable.smys4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("simayi.xml");
			
			strong = new Double(18);
			agile = new Double(16);
			intelligence = new Double(26);
			attacklow = 19;
			attackhigh = 25;
			herotype = 3; //
			
			updateView();
			break;
		
		case 21: //典韦
			imageView01.setImageResource(R.drawable.dw1);
			imageView02.setImageResource(R.drawable.dw3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.dws1);
			imageView05.setImageResource(R.drawable.dws2);
			imageView06.setImageResource(R.drawable.dws3);
			imageView07.setImageResource(R.drawable.dws4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("dianwei.xml");
			
			strong = new Double(23);
			agile = new Double(20);
			intelligence = new Double(17);
			attacklow = 26;
			attackhigh = 36;
			herotype = 1; //
			
			updateView();
			break;
		
		case 22: //荀彧
			imageView01.setImageResource(R.drawable.xy1);
			imageView02.setImageResource(R.drawable.xy3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xys1);
			imageView05.setImageResource(R.drawable.xys2);
			imageView06.setImageResource(R.drawable.xys3);
			imageView07.setImageResource(R.drawable.xys4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xunyu.xml");
			
			strong = new Double(18);
			agile = new Double(18);
			intelligence = new Double(24);
			attacklow = 17;
			attackhigh = 23;
			herotype = 3; //
			
			updateView();
			break;
		
		case 23: //郭嘉
			imageView01.setImageResource(R.drawable.gj1);
			imageView02.setImageResource(R.drawable.gj3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.gjs1);
			imageView05.setImageResource(R.drawable.gjs2);
			imageView06.setImageResource(R.drawable.gjs3);
			imageView07.setImageResource(R.drawable.gjs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("guojia.xml");
			
			strong = new Double(18);
			agile = new Double(18);
			intelligence = new Double(24);
			attacklow = 17;
			attackhigh = 23;
			herotype = 3; //
			
			updateView();
			break;
		
		case 24: //曹仁
			imageView01.setImageResource(R.drawable.cr1);
			imageView02.setImageResource(R.drawable.cr3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.crs1);
			imageView05.setImageResource(R.drawable.crs2);
			imageView06.setImageResource(R.drawable.crs3);
			imageView07.setImageResource(R.drawable.crs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("caoren.xml");
			
			strong = new Double(24);
			agile = new Double(19);
			intelligence = new Double(17);
			attacklow = 22;
			attackhigh = 32;
			herotype = 1; //
			
			updateView();
			break;
		
		case 25: //曹操
			imageView01.setImageResource(R.drawable.cc1);
			imageView02.setImageResource(R.drawable.cc3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.ccs1);
			imageView05.setImageResource(R.drawable.ccs2);
			imageView06.setImageResource(R.drawable.ccs3);
			imageView07.setImageResource(R.drawable.ccs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("caocao.xml");
			
			strong = new Double(19);
			agile = new Double(21);
			intelligence = new Double(20);
			attacklow = 25;
			attackhigh = 31;
			herotype = 2; //
			
			updateView();
			break;
		
		case 26: //夏侯敦
			imageView01.setImageResource(R.drawable.xhd1);
			imageView02.setImageResource(R.drawable.xhd3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xhds1);
			imageView05.setImageResource(R.drawable.xhds2);
			imageView06.setImageResource(R.drawable.xhds3);
			imageView07.setImageResource(R.drawable.xhds4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xiahoudun.xml");
			
			strong = new Double(24);
			agile = new Double(20);
			intelligence = new Double(16);
			attacklow = 19;
			attackhigh = 41;
			herotype = 1; //
			
			updateView();
			break;
		
		case 27: //夏侯渊
			imageView01.setImageResource(R.drawable.xhy1);
			imageView02.setImageResource(R.drawable.xhy3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xhys1);
			imageView05.setImageResource(R.drawable.xhys2);
			imageView06.setImageResource(R.drawable.xhys3);
			imageView07.setImageResource(R.drawable.xhys4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xiahouyuan.xml");
			
			strong = new Double(21);
			agile = new Double(23);
			intelligence = new Double(16);
			attacklow = 17;
			attackhigh = 39;
			herotype = 2; //
			
			updateView();
			break;
		
		case 28: //服部半藏
			imageView01.setImageResource(R.drawable.fbbz1);
			imageView02.setImageResource(R.drawable.fbbz3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.fbbzs1);
			imageView05.setImageResource(R.drawable.fbbzs2);
			imageView06.setImageResource(R.drawable.fbbzs3);
			imageView07.setImageResource(R.drawable.fbbzs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("fububanzang.xml");
			
			strong = new Double(17);
			agile = new Double(28);
			intelligence = new Double(15);
			attacklow = 14;
			attackhigh = 34;
			herotype = 2; //
			
			updateView();
			break;
		
		case 29: //甄姬
			imageView01.setImageResource(R.drawable.zj1);
			imageView02.setImageResource(R.drawable.zj3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.zjs1);
			imageView05.setImageResource(R.drawable.zjs2);
			imageView06.setImageResource(R.drawable.zjs3);
			imageView07.setImageResource(R.drawable.zjs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("zhenji.xml");
			
			strong = new Double(20);
			agile = new Double(25);
			intelligence = new Double(15);
			attacklow = 15;
			attackhigh = 33;
			herotype = 2; //
			
			updateView();
			break;
		
		case 30: //许褚
			imageView01.setImageResource(R.drawable.xc1);
			imageView02.setImageResource(R.drawable.xc3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xcs1);
			imageView05.setImageResource(R.drawable.xcs2);
			imageView06.setImageResource(R.drawable.xcs3);
			imageView07.setImageResource(R.drawable.xcs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xuchu.xml");
			
			strong = new Double(22);
			agile = new Double(20);
			intelligence = new Double(15);
			attacklow = 20;
			attackhigh = 30;
			herotype = 1; //
			
			updateView();
			break;
		
		case 31: //张辽
			imageView01.setImageResource(R.drawable.zl1);
			imageView02.setImageResource(R.drawable.zl3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.zls1);
			imageView05.setImageResource(R.drawable.zls2);
			imageView06.setImageResource(R.drawable.zls3);
			imageView07.setImageResource(R.drawable.zls4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("zhangliao.xml");
			
			strong = new Double(22);
			agile = new Double(21);
			intelligence = new Double(17);
			attacklow = 27;
			attackhigh = 37;
			herotype = 1; //
			
			updateView();
			break;
		
		case 32: //张颌
			imageView01.setImageResource(R.drawable.zh1);
			imageView02.setImageResource(R.drawable.zh3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.zhs1);
			imageView05.setImageResource(R.drawable.zhs2);
			imageView06.setImageResource(R.drawable.zhs3);
			imageView07.setImageResource(R.drawable.zhs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("zhanghe.xml");
			
			strong = new Double(20);
			agile = new Double(22);
			intelligence = new Double(18);
			attacklow = 17;
			attackhigh = 39;
			herotype = 2; //
			
			updateView();
			break;
		
		case 33: //于禁
			imageView01.setImageResource(R.drawable.yj1);
			imageView02.setImageResource(R.drawable.yj3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.yjs1);
			imageView05.setImageResource(R.drawable.yjs2);
			imageView06.setImageResource(R.drawable.yjs3);
			imageView07.setImageResource(R.drawable.yjs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("yujing.xml");
			
			strong = new Double(17);
			agile = new Double(23);
			intelligence = new Double(20);
			attacklow = 15;
			attackhigh = 40;
			herotype = 2; //
			
			updateView();
			break;
		
		case 34: //曹洪
			imageView01.setImageResource(R.drawable.ch1);
			imageView02.setImageResource(R.drawable.ch3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.chs1);
			imageView05.setImageResource(R.drawable.chs2);
			imageView06.setImageResource(R.drawable.chs3);
			imageView07.setImageResource(R.drawable.chs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("caohong.xml");
			
			strong = new Double(24);
			agile = new Double(20);
			intelligence = new Double(16);
			attacklow = 12;
			attackhigh = 18;
			herotype = 1; //
			
			updateView();
			break;
		
		case 35: //贾诩
			imageView01.setImageResource(R.drawable.jx1);
			imageView02.setImageResource(R.drawable.jx3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.jxs1);
			imageView05.setImageResource(R.drawable.jxs2);
			imageView06.setImageResource(R.drawable.jxs3);
			imageView07.setImageResource(R.drawable.jxs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("jiaxu.xml");
			
			strong = new Double(18);
			agile = new Double(15);
			intelligence = new Double(27);
			attacklow = 17;
			attackhigh = 23;
			herotype = 3; //
			
			updateView();
			break;
		
		case 36: //徐晃
			imageView01.setImageResource(R.drawable.xh1);
			imageView02.setImageResource(R.drawable.xh3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xhs1);
			imageView05.setImageResource(R.drawable.xhs2);
			imageView06.setImageResource(R.drawable.xhs3);
			imageView07.setImageResource(R.drawable.xhs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xuhuang.xml");
			
			strong = new Double(27);
			agile = new Double(15);
			intelligence = new Double(12);
			attacklow = 22;
			attackhigh = 32;
			herotype = 1; //
			
			updateView();
			break;
		
		case 37: //貂蝉
			imageView01.setImageResource(R.drawable.dc1);
			imageView02.setImageResource(R.drawable.dc3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.dcs1);
			imageView05.setImageResource(R.drawable.dcs2);
			imageView06.setImageResource(R.drawable.dcs3);
			imageView07.setImageResource(R.drawable.dcs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("diaochan.xml");
			
			strong = new Double(17);
			agile = new Double(23);
			intelligence = new Double(20);
			attacklow = 18;
			attackhigh = 26;
			herotype = 2; //
			
			updateView();
			break;
		
		case 38: //华佗
			imageView01.setImageResource(R.drawable.ht1);
			imageView02.setImageResource(R.drawable.ht3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.hts1);
			imageView05.setImageResource(R.drawable.hts2);
			imageView06.setImageResource(R.drawable.hts3);
			imageView07.setImageResource(R.drawable.hts4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("huatuo.xml");
			
			strong = new Double(20);
			agile = new Double(18);
			intelligence = new Double(24);
			attacklow = 13;
			attackhigh = 40;
			herotype = 3; //
			
			updateView();
			break;
		
		case 39: //阿速达
			imageView01.setImageResource(R.drawable.asd1);
			imageView02.setImageResource(R.drawable.asd3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.asds1);
			imageView05.setImageResource(R.drawable.asds2);
			imageView06.setImageResource(R.drawable.asds3);
			imageView07.setImageResource(R.drawable.asds4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("asuda.xml");
			
			strong = new Double(20);
			agile = new Double(25);
			intelligence = new Double(15);
			attacklow = 18;
			attackhigh = 28;
			herotype = 2; //
			
			updateView();
			break;
		
		case 40: //大乔
			imageView01.setImageResource(R.drawable.dq1);
			imageView02.setImageResource(R.drawable.dq3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.dqs1);
			imageView05.setImageResource(R.drawable.dqs2);
			imageView06.setImageResource(R.drawable.dqs3);
			imageView07.setImageResource(R.drawable.dqs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("daqiao.xml");
			
			strong = new Double(18);
			agile = new Double(22);
			intelligence = new Double(20);
			attacklow = 19;
			attackhigh = 29;
			herotype = 2; //
			
			updateView();
			break;
		
		case 41: //太史慈
			imageView01.setImageResource(R.drawable.tsc1);
			imageView02.setImageResource(R.drawable.tsc3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.tscs1);
			imageView05.setImageResource(R.drawable.tscs2);
			imageView06.setImageResource(R.drawable.tscs3);
			imageView07.setImageResource(R.drawable.tscs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("taishici.xml");
			
			strong = new Double(22);
			agile = new Double(22);
			intelligence = new Double(16);
			attacklow = 25;
			attackhigh = 47;
			herotype = 2; //
			
			updateView();
			break;
		
		case 42: //小乔
			imageView01.setImageResource(R.drawable.xq1);
			imageView02.setImageResource(R.drawable.xq3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.xqs1);
			imageView05.setImageResource(R.drawable.xqs2);
			imageView06.setImageResource(R.drawable.xqs3);
			imageView07.setImageResource(R.drawable.xqs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("xiaoqiao.xml");
			
			strong = new Double(20);
			agile = new Double(23);
			intelligence = new Double(17);
			attacklow = 20;
			attackhigh = 26;
			herotype = 2; //
			
			updateView();
			break;
		
		case 43: //孙权
			imageView01.setImageResource(R.drawable.sq1);
			imageView02.setImageResource(R.drawable.sq3);
			imageView03.setImageResource(R.drawable.aamk);
			imageView04.setImageResource(R.drawable.sqs1);
			imageView05.setImageResource(R.drawable.sqs2);
			imageView06.setImageResource(R.drawable.sqs3);
			imageView07.setImageResource(R.drawable.sqs4);
			textView02.setText(databaseUtil.queryData(index,2));
			textView04.setText(databaseUtil.queryData(index,3));
			textView45.setText(databaseUtil.queryData(index,4));
			
			setSkill("sunquan.xml");
			
			strong = new Double(23);
			agile = new Double(23);
			intelligence = new Double(14);
			attacklow = 22;
			attackhigh = 32;
			herotype = 1; //
			
			updateView();
			break;
		
		default:
			break;
		}
	}
	class myOnclickListenerL implements OnClickListener
	{
		@Override
		public void onClick(View v) {
			if(level != 1)
			{
				level -=1;
				textView08.setText("等级 "+level);
				strong -= NameValueUtil.getSAI(index+"_s_u");
				agile -= NameValueUtil.getSAI(index+"_a_u");
				intelligence -= NameValueUtil.getSAI(index+"_i_u");
				
				updateView();
			}	
		}
	}
	class myOnclickListenerR implements OnClickListener
	{
		@Override
		public void onClick(View v) {
			if(level != 25)
			{
				level +=1;
				textView08.setText("等级 "+level);
				strong += NameValueUtil.getSAI(index+"_s_u");
				agile += NameValueUtil.getSAI(index+"_a_u");
				intelligence += NameValueUtil.getSAI(index+"_i_u");
				
				updateView();
			}		
		}
	}
	
	//更新属性数据
	private void updateView()
	{
		textView05.setText((life+strong.intValue()*19)+"/"+(life+strong.intValue()*19));
		textView06.setText((magic+(int)(intelligence.intValue()*14.05))+"/"+(magic+(int)(intelligence.intValue()*14.05)));
		textView08.setText("等级 "+level);
		switch ( herotype)
		{
			case 1:
				textView10.setText((int)(attacklow+strong)+"-"+(int)(attackhigh+strong));
				break;
			case 2:
				textView10.setText((int)(attacklow+agile)+"-"+(int)(attackhigh+agile));
				break;
			case 3:
				textView10.setText((int)(attacklow+intelligence)+"-"+(int)(attackhigh+intelligence));
				break;
			default:
				textView10.setText((int)(attacklow+strong)+"-"+(int)(attackhigh+strong));
				break;
		}
		textView12.setText(NameValueUtil.getArmor(agile.intValue())+"");
		textView13.setText(new Integer(strong.intValue()).toString());
		textView14.setText(new Integer(agile.intValue()).toString());
		textView15.setText(new Integer(intelligence.intValue()).toString());
	}
	
	//设置英雄技能
	private void setSkill(String heroXmlName)
	{
		try {
			heroskill = XmlUtil.ParseSkill(getAssets().open(heroXmlName));
			textView16.setText(heroskill.SkillName_1);
			textView17.setText(heroskill.SkillInfo_1);
			textView18.setText(heroskill.SkillInfo_1_1);
			textView19.setText(heroskill.SkillInfo_1_2);
			textView20.setText(heroskill.SkillInfo_1_3);
			textView21.setText(heroskill.SkillInfo_1_4);
			
			textView22.setText(heroskill.SkillName_2);
			textView23.setText(heroskill.SkillInfo_2);
			textView24.setText(heroskill.SkillInfo_2_1);
			textView25.setText(heroskill.SkillInfo_2_2);
			textView26.setText(heroskill.SkillInfo_2_3);
			textView27.setText(heroskill.SkillInfo_2_4);
			
			textView28.setText(heroskill.SkillName_3);
			textView29.setText(heroskill.SkillInfo_3);
			textView30.setText(heroskill.SkillInfo_3_1);
			textView31.setText(heroskill.SkillInfo_3_2);
			textView32.setText(heroskill.SkillInfo_3_3);
			textView33.setText(heroskill.SkillInfo_3_4);
			
			textView34.setText(heroskill.SkillName_4);
			textView35.setText(heroskill.SkillInfo_4);
			textView36.setText(heroskill.SkillInfo_4_1);
			textView37.setText(heroskill.SkillInfo_4_2);
			textView38.setText(heroskill.SkillInfo_4_3);
			textView39.setText(heroskill.SkillInfo_4_4);
			
			textView40.setText(heroskill.SkillName_5);
			textView41.setText(heroskill.SkillInfo_5);
			textView42.setText(heroskill.SkillInfo_5_1);
			textView43.setText(heroskill.SkillInfo_5_2);
			textView44.setText(heroskill.SkillInfo_5_3);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
