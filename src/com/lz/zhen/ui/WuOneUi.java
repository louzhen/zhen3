package com.lz.zhen.ui;

import com.lz.zhen.logic.NameValueUtil;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class WuOneUi extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		 requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.wuone);
		setGoodContent();
	}
	
	private void setGoodContent()
	{
		int index = 0;
		index = NameValueUtil.getGoodIndex(getIntent().getStringExtra("name"));
		TextView textView01 = (TextView)findViewById(R.id.textview_wuone_1);
		TextView textView02 = (TextView)findViewById(R.id.textview_wuone_2);
		TextView textView03 = (TextView)findViewById(R.id.textview_wuone_3);
		TextView textView04 = (TextView)findViewById(R.id.textview_wuone_4);
		ImageView imageview01 = (ImageView)findViewById(R.id.image_wuone_1);
		switch(index)
		{
			case 1://医疗剂
				imageview01.setImageResource(R.drawable.ylj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:55");
				textView03.setText("恢复目标生命点数，使用后12秒内恢复400点");
			break;
			case 2://净化药水
				imageview01.setImageResource(R.drawable.jhys);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:45");
				textView03.setText("在15秒内恢复英雄100点魔法值");
			break;
			case 3://治疗守卫
				imageview01.setImageResource(R.drawable.zlsw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:320");
				textView03.setText("治好附近的友方部队，并持续30秒。可以使用２次，守卫有300生命");
			break;
			case 4://岗哨守卫
				imageview01.setImageResource(R.drawable.gssw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:325");
				textView03.setText("放下一個监视结界可以监看這个区域300秒。可以使用3次");
			break;
			case 5://神农本草
				imageview01.setImageResource(R.drawable.snbc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2100");
				textView03.setText("智慧+6。 (恢復350生命，冷却30秒)");
			break;
			case 6://青囊书
				imageview01.setImageResource(R.drawable.qns);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1100");
				textView03.setText("智慧 +4。(恢復附近友軍100生命， 2裝甲，冷却35秒)");
			break;
			case 7://遁甲天书
				imageview01.setImageResource(R.drawable.djts);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1300");
				textView03.setText("智慧 6。(附近友軍 6裝甲，持续20秒，冷却60秒)");
			break;
			case 8://孙子兵法
				imageview01.setImageResource(R.drawable.szbf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2100");
				textView03.setText("智慧 10。(附近友軍移动速度变成2倍，持续10秒，消耗140法力，冷却60秒）");
			break;
			case 9://太平要术
				imageview01.setImageResource(R.drawable.tpys);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2000");
				textView03.setText("智慧 6。(让远距离攻击无效，持续25秒，消耗100法力,冷却60秒)");
			break;
			case 10://孟德新书
				imageview01.setImageResource(R.drawable.mdxs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3000");
				textView03.setText("智慧 10。(400伤害，冷却40秒)");
			break;
			case 11://铁木树枝
				imageview01.setImageResource(R.drawable.tmsz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:50");
				textView03.setText("全能力 +1");
			break;
			case 12://力量手套
				imageview01.setImageResource(R.drawable.llst);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:150");
				textView03.setText("力量 +3");
			break;
			case 13://智力斗篷
				imageview01.setImageResource(R.drawable.zldp);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:150");
				textView03.setText("智慧 +3");
			break;
			case 14://皮鞋
				imageview01.setImageResource(R.drawable.px);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:150");
				textView03.setText("敏捷 +3");
			break;
			case 15://饰环
				imageview01.setImageResource(R.drawable.sh);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:170");
				textView03.setText("全能力+2");
			break;
			case 16://护腕
				imageview01.setImageResource(R.drawable.hw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:150");
				textView03.setText("防御+2");
			break;
			case 17://加速手套
				imageview01.setImageResource(R.drawable.jsst);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:650");
				textView03.setText("攻速 +15%");
			break;
			case 18://艺人面罩
				imageview01.setImageResource(R.drawable.yrmz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:400");
				textView03.setText("魔法恢复速度+50%");
			break;
			case 19://速度之靴
				imageview01.setImageResource(R.drawable.sdzx);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:500");
				textView03.setText("移动速度 +50");
			break;
			case 20://恢复指环
				imageview01.setImageResource(R.drawable.hfzh);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:200");
				textView03.setText("回复HP +2");
			break;
			case 21://法师长袍 
				imageview01.setImageResource(R.drawable.fscp);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:450");
				textView03.setText("智慧 +6");
			break;
			case 22://耐力头盔
				imageview01.setImageResource(R.drawable.nltk);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:950");
				textView03.setText("装甲 +5，回復HP +2");
			break;
			case 23://玄武甲
				imageview01.setImageResource(R.drawable.xwj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1550");
				textView03.setText("裝甲 +10");
			break;
			case 24://朱雀翼
				imageview01.setImageResource(R.drawable.zqy);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1700");
				textView03.setText("生命上限 +350");
			break;
			case 25://青龙胆
				imageview01.setImageResource(R.drawable.qld);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1400");
				textView03.setText("法力上限 +300");
			break;
			case 26://钻石
				imageview01.setImageResource(R.drawable.zs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1100");
				textView03.setText("生命上限 +150，法力上限 +100");
			break;
			case 27://百草丸
				imageview01.setImageResource(R.drawable.bcw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:870");
				textView03.setText("每秒回复HP 4");
			break;
			case 28://活丹 
				imageview01.setImageResource(R.drawable.hd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:950");
				textView03.setText("法力再生100%");
			break;
			case 29://夜明珠
				imageview01.setImageResource(R.drawable.ymz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2400");
				textView03.setText("全能力 +10");
			break;
			case 30://显形宝石 
				imageview01.setImageResource(R.drawable.xxbs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:650");
				textView03.setText("能看到隐形单位。#不可贩卖，死亡掉落#");
			break;
			case 31://冰玉
				imageview01.setImageResource(R.drawable.by);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1600");
				textView03.setText("(可重叠合成 最高3级)\n LV1:全能力 +5。攻击時有15%几率冰冻敌人2秒\n LV2:全能力 +10。全能力 10。攻击時有25%几率冰冻敌人2秒 \n LV3:全能力 +15。每次攻击时会降低敌人攻击速度和移动速度，持续1.5秒");
			break;
			case 32://烈玉
				imageview01.setImageResource(R.drawable.ly);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1400");
				textView03.setText("(可重叠合成 最高3级)\n LV1:每次攻击-3敌人装甲，持续两秒\n LV2:攻击 15。每次攻击-5敌人裝甲，持续２秒\n LV3:攻击 30。每次攻击-8敌人裝甲，持续２秒");
			break;
			case 33://雷玉
				imageview01.setImageResource(R.drawable.ly1);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1500");
				textView03.setText("(可重叠合成 最高3级)\n LV1:攻击+ 15。每次攻击時，有10%几率召唤攻击力70弹跳3次的连锁闪电\n LV2:攻击 15，敏捷 5。每次攻击時，有10%几率召喚攻击力120弹跳3次的连锁闪电\n LV3:攻击 25，敏捷 10。每次攻击時，有10%几率召喚攻击力200弹跳3次的连锁闪电");
			break;
			case 34://炎玉
				imageview01.setImageResource(R.drawable.yy);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1500");
				textView03.setText("(可重叠合成 最高3级)\n LV1:攻击 +20。攻击时威力会扩散到附近敌人身上\n LV2:攻击 40。攻击時威力会扩散到附近敌人身上\n LV3:攻击 60。攻击時威力会扩散到附近敌人身上");
			break;
			case 35://毒玉
				imageview01.setImageResource(R.drawable.dy);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:750");
				textView03.setText("(可重叠合成 最高3级)\n LV1:每一次攻击都会使目标中毒，每秒9点傷害，持续时间5秒\n LV2:每一次攻击都会使目标中毒，每秒18点傷害，持续时间5秒\n LV3:每一次攻击都会使目标中毒，每秒27点傷害，持续时间5秒");
			break;
			case 36://铸造用槌
				imageview01.setImageResource(R.drawable.zzyc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1500");
				textView03.setText("攻击 +5");
			break;
			case 37://盗贼短剑
				imageview01.setImageResource(R.drawable.dzdj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1000");
				textView03.setText("敏捷 +10");
			break;
			case 38://力量之斧
				imageview01.setImageResource(R.drawable.llzf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1000");
				textView03.setText("力量 +10");
			break;
			case 39://否决之杖
				imageview01.setImageResource(R.drawable.fjzz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1050");
				textView03.setText("智力 +10");
			break;
			case 40://匕首
				imageview01.setImageResource(R.drawable.bs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:650");
				textView03.setText("攻击 +9");
			break;
			case 41://铁剑
				imageview01.setImageResource(R.drawable.tj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1150");
				textView03.setText("攻击 15");
			break;
			case 42://铁戟
				imageview01.setImageResource(R.drawable.tj1);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1500");
				textView03.setText("攻击 20");
			break;
			case 43://钢铁之鎚
				imageview01.setImageResource(R.drawable.gtzc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1650");
				textView03.setText("攻击 24");
			break;
			case 44://月光枪 
				imageview01.setImageResource(R.drawable.ygq);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2300");
				textView03.setText("攻击 +28，攻速 +15%");
			break;
			case 45://铁枪
				imageview01.setImageResource(R.drawable.tq);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1200");
				textView03.setText("攻击 +10，攻速 +15%");
			break;
			case 46://吸血匕首
				imageview01.setImageResource(R.drawable.xxbs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1600");
				textView03.setText("攻击 +12，+5%吸血");
			break;
			case 47://玄铁匕首
				imageview01.setImageResource(R.drawable.xtbs);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1500");
				textView03.setText("攻击 +15，裝甲 +2");
			break;
			case 48://大斧
				imageview01.setImageResource(R.drawable.df);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3200");
				textView03.setText("力量 +24");
			break;
			case 49://黄忠弓
				imageview01.setImageResource(R.drawable.hzg);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3600");
				textView03.setText("敏捷 +24");
			break;
			case 50://史记
				imageview01.setImageResource(R.drawable.sj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2800");
				textView03.setText("智力 +24");
			break;
			case 51://银枪 
				imageview01.setImageResource(R.drawable.yq);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2800");
				textView03.setText("攻击 +40");
			break;
			case 52://青虹剑
				imageview01.setImageResource(R.drawable.qhj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3000");
				textView03.setText("攻击 +35，全能力+5。");
			break;
			case 53://银剑
				imageview01.setImageResource(R.drawable.yj3);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2600");
				textView03.setText("攻击 +36");
			break;
			case 54://力量护腕
				imageview01.setImageResource(R.drawable.llhw);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:500");
				textView03.setText("力量 +6防御 +3");
				textView04.setText("需要：力量拳套(150)+防御戒指(175)+力量护腕制作书(175)");
			break;
			case 55://护身符
				imageview01.setImageResource(R.drawable.hsf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:495");
				textView03.setText("全能力 3，智慧 6");
				textView04.setText("需要：饰环(170)+智慧的披风(150) +不值钱的护身符(175)");
			break;
			case 56://仙丹
				imageview01.setImageResource(R.drawable.xd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1820");
				textView03.setText("回復HP +4，法力再生 +100%　全属性 +３");
				textView04.setText("需要：百草丸(870) +活丹(950)");
			break;
			case 57://麒麟心
				imageview01.setImageResource(R.drawable.qlx);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3100");
				textView03.setText("生命上限 +400，法力上限+ 400，法力再生+ 40%，回復HP +1");
				textView04.setText("需要：朱雀翼(1700) +青龙胆(1400)");
			break;
			case 58://神速符
				imageview01.setImageResource(R.drawable.ssf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:1350");
				textView03.setText("移动速度 50，攻速 30%");
				textView04.setText("需要：速度之靴(500) +快速手套(650)+ 神速符制作书(200)");
			break;
			case 59://狂战士之斧
				imageview01.setImageResource(R.drawable.kzszf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2000");
				textView03.setText("力量 10，使用后攻速 80%，移速 20%，額外承受30%傷害，持续12秒，冷却时间30秒，消耗法力50");
				textView04.setText("需要：力量之斧(1000)+ 狂战士之斧制作书(1000)");
			break;
			case 60://护卫心得
				imageview01.setImageResource(R.drawable.hwxd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:880");
				textView03.setText("周围士兵裝甲 +3");
				textView04.setText("需要：再生之戒(380) +护卫心得制作书(500)");
			break;
			case 61://藤甲铠
				imageview01.setImageResource(R.drawable.tjk);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2400");
				textView03.setText("裝甲 +5，減少远距离伤害+30%");
				textView04.setText("需要：耐力头盔(950)+ 藤甲制作书(1450)");
			break;
			case 62://风暴之杖
				imageview01.setImageResource(R.drawable.fbzz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2450");
				textView03.setText("智慧 +20，法力再生 100%，可以使用旋风书，使用5次");
				textView04.setText("需要：破魔之杖(1050) +活丹(950)+ 风暴之杖制作书(450)");
			break;
			case 63://退魔刀
				imageview01.setImageResource(R.drawable.tmd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2950");
				textView03.setText("每次攻击毁掉目标20法力，敏捷 +10，智慧 +6，可使用淨化10次可通过购买制作书来补充次数");
				textView04.setText("需要：盜賊短劍(1000)+ 魔法之袍(450)+ 退魔刀制作书(1500)");
			break;
			case 64://玄武斧
				imageview01.setImageResource(R.drawable.xwf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3600");
				textView03.setText("攻击 +15，力量 +12，使用后魔法免疫，持续17秒，冷却时间90秒，消耗法力100");
				textView04.setText("需要：力量之斧(1000)+ 铁劍(1150) +玄武斧制作书(1450)");
			break;
			case 65://恶鬼鎚 
				imageview01.setImageResource(R.drawable.egc);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3150");
				textView03.setText("攻击 +30，近距离+13%、远距离+5%几率眩晕1秒");
				textView04.setText("需要：钢铁之槌(1650) +力量手套(150)+ 恶鬼锤制作书(1350)");
			break;
			case 66://武士刀
				imageview01.setImageResource(R.drawable.wsd);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3300");
				textView03.setText("攻擊 +35，13%几率造成目标2倍傷害");
				textView04.setText("需要：铁劍(1150) 匕首(650) 武士刀制作书(1400)");
			break;
			case 67://翔靴
				imageview01.setImageResource(R.drawable.xx);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2850");
				textView03.setText("移动速度 +50，可传送到距离1000的地方，冷却时间45秒");
				textView04.setText("需要：速度之靴(500) +翔靴制作书(2350)");
			break;
			case 68://风行刃
				imageview01.setImageResource(R.drawable.fxr);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3550");
				textView03.setText("攻击 +15，敏捷 +10，使用后隐形，持续12秒，冷却时间30秒，消耗法力100");
				textView04.setText("需要：盜賊短劍(1000) +铁劍(1150) +风行刃制作书(1400)");
			break;
			case 69://巫术杖
				imageview01.setImageResource(R.drawable.wsz);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:5600");
				textView03.setText("智慧 +25，法力再生 +200%，可以使用邪法，消耗法力110，冷却时间35秒");
				textView04.setText("需要：风暴之仗(2450) +活丹(950) +钻石（1100)+ 巫术魔杖制作书(900)");
			break;
			case 70://黄龙剑
				imageview01.setImageResource(R.drawable.hlj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:2650");
				textView03.setText("攻击 +55，10%几率造成2.5倍伤害");
				textView04.setText("需要：铁剑(1050) +龍之心 +黃龙剑制作书(1600)");
			break;
			case 71://源式之铠
				imageview01.setImageResource(R.drawable.yszk);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:3170");
				textView03.setText("裝甲 +8，60%几率減少60伤害");
				textView04.setText("需要：玄武甲(1550) +百草丸(870) +源式之铠制作书(750)");
			break;
			case 72://七星剑
				imageview01.setImageResource(R.drawable.qxj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:6650");
				textView03.setText("攻击 +60，全能力 +10，每50秒抵挡一次法术");
				textView04.setText("需要：夜明珠(2400) +银剑(2600) +七星剑制作书(1650)");
			break;
			case 73://倚天剑
				imageview01.setImageResource(R.drawable.ytj);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:5050");
				textView03.setText("攻击 +50，+15%吸血");
				textView04.setText("需要：吸血匕首(1600) +银剑(2600) +倚天剑制作书(850)");
			break;
			case 74://大地斧 
				imageview01.setImageResource(R.drawable.ddf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:6250");
				textView03.setText("力量 +30，生命上限 +350，回復HP +10");
				textView04.setText("需要：朱雀翼(1700) +大斧(3200) +大地斧制作书(1350)");
			break;
			case 75://血斧
				imageview01.setImageResource(R.drawable.xf);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:5450");
				textView03.setText("攻擊 +75，攻速 +15%，+25%几率100伤害");
				textView04.setText("需要：銀剑(2600) +铁枪(1200) +血斧制作书(1650)");
			break;
			case 76://月下美人
				imageview01.setImageResource(R.drawable.yxmr);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText("价格:6300");
				textView03.setText("敏捷 +25，攻速 +30%，+25%回避");
				textView04.setText("需要：黃忠弓(3600) +铁枪(1200)+ 锻造用锤(1500)");
			break;
			case 77://物品合成（蜀国专属）
				imageview01.setImageResource(R.drawable.wphc1);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText(null);
				textView03.setText(null);
				textView04.setText("青龙偃月刀(关羽专用)=龍之心+月光枪(2300) +青虹剑(3000)\n"+
												"功能：攻击 +60，全能力 +10，习得龙卷旋风斩\n\n"+
												"丈八蛇矛(张飞专用用)=铁戟(1500) +玄铁匕首(1500) +锻造用锤(1500)\n"+
												"功能：攻击 +60，+50%扩散伤害\n\n"+
												"豪龙胆(赵云专用)=銀枪(2600)+ 龙之心+ 烈玉(1400)\n"+
												"功能：攻击 +57，每次攻击-5敌人裝甲，习得杀剧舞荒剑\n\n"+
												"凤凰仗(庞統专用)=风暴之仗(2450) +百草丸(870) +史記(2800)\n"+
												"功能：回复HP +10，法力上限 +400，智慧 +25。使用后召唤一只凤凰，消耗法力250　持续80秒，冷却时间180秒");
			break;
			case 78://物品合成（魏国专属）
				imageview01.setImageResource(R.drawable.wphc2);
				textView01.setText(getIntent().getStringExtra("name"));
				textView02.setText(null);
				textView03.setText(null);
				textView04.setText("倚天之奸剑(曹操专用)=倚天剑 +龙之血\n"+
												"功能：攻击 +40，+25%吸血，攻速 +30%\n\n"+
												"金刚九天断(夏侯渊专用)=铁戟(1500) +玄铁匕首(1500) +锻造用锤(1500)\n"+
												"功能：攻击 +60，+50%扩散伤害\n\n"+
												"黃龙钩鐮刀(张辽专用)=银剑(2600)+ 烈玉(1400) +锻造用锤(1500) +龍之血\n"+
												"功能：攻击 +50，攻速 +30%，每次攻击-5敌人裝甲\n\n"+
												"冰晶羽扇(郭嘉专用)=麒麟心(3100)+ 风暴之仗(2450) +青龍丹(1400)\n"+
												"功能：生命上限 +400，法力上限 +400，智慧 +25。使用后所有技能跳过冷却时间，消耗法力300，冷却时间180秒\n\n"+
												"酸雨羽扇(司馬懿专用)=麒麟心(3100) +史记(2800)\n"+
												"功能：生命上限 +400，法力上限 +400，智慧 +25。裝备时技能\"星落\"的威力提升200");
			break;
			
			
		}
	}
}
