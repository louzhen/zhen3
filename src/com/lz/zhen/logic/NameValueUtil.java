package com.lz.zhen.logic;

import java.util.HashMap;


public class NameValueUtil {
	static HashMap<String, Integer> myherohash;
	static HashMap<String, Double> myherohash1;
	static HashMap<String, Integer> mygoodhash;
	static
	{
		myherohash = new HashMap<String, Integer>();
		myherohash1 = new HashMap<String, Double>();
		mygoodhash = new HashMap<String, Integer>(100);
		
		myherohash.put("诸葛亮", 1);
		myherohash.put("张飞", 2);
		myherohash.put("关羽", 3);
		myherohash.put("赵云", 4);
		myherohash.put("魏延", 5);
		myherohash.put("刘备", 6);
		myherohash.put("黄忠", 7);
		myherohash.put("马超", 8);
		myherohash.put("黄月英", 9);
		myherohash.put("庞统", 10);
		myherohash.put("孟获", 11);
		myherohash.put("祝融夫人", 12);
		myherohash.put("徐庶", 13);
		myherohash.put("马良", 14);
		myherohash.put("糜竺", 15);
		myherohash.put("马岱", 16);
		myherohash.put("大地", 17);
		myherohash.put("暴风", 18);
		myherohash.put("熊猫人", 19);
		
		myherohash.put("司马懿", 20);
		myherohash.put("典韦", 21);
		myherohash.put("荀彧", 22);
		myherohash.put("郭嘉", 23);
		myherohash.put("曹仁", 24);
		myherohash.put("曹操", 25);
		myherohash.put("夏侯敦", 26);
		myherohash.put("夏侯渊", 27);
		myherohash.put("服部半藏", 28);
		myherohash.put("甄姬", 29);
		myherohash.put("许褚", 30);
		myherohash.put("张辽", 31);
		myherohash.put("张颌", 32);
		myherohash.put("于禁", 33);
		myherohash.put("曹洪", 34);
		myherohash.put("贾诩", 35);
		myherohash.put("徐晃", 36);
		
		//中立
		myherohash.put("貂蝉", 37);
		myherohash.put("华佗", 38);
		myherohash.put("阿速达", 39);
		myherohash.put("大乔", 40);
		myherohash.put("太史慈", 41);
		myherohash.put("小乔", 42);
		myherohash.put("孙权", 43);
		
		//蜀国
		myherohash1.put("1_s_u", 1.6);
		myherohash1.put("1_a_u", 1.0);
		myherohash1.put("1_i_u", 3.4);	
		
		myherohash1.put("2_s_u", 2.8);
		myherohash1.put("2_a_u", 1.7);
		myherohash1.put("2_i_u", 1.5);
		
		myherohash1.put("3_s_u", 2.4);
		myherohash1.put("3_a_u", 2.5);
		myherohash1.put("3_i_u", 1.5);
		
		myherohash1.put("4_s_u", 2.3);
		myherohash1.put("4_a_u", 2.6);
		myherohash1.put("4_i_u", 1.5);
		
		myherohash1.put("5_s_u", 2.65);
		myherohash1.put("5_a_u", 1.75);
		myherohash1.put("5_i_u", 1.5);
		
		myherohash1.put("6_s_u", 2.00);
		myherohash1.put("6_a_u", 2.3);
		myherohash1.put("6_i_u", 2.00);
		
		myherohash1.put("7_s_u", 1.7);
		myherohash1.put("7_a_u", 3.0);
		myherohash1.put("7_i_u", 1.3);
		
		myherohash1.put("8_s_u", 2.1);
		myherohash1.put("8_a_u",3.0);
		myherohash1.put("8_i_u", 1.5);
		
		myherohash1.put("9_s_u", 1.8);
		myherohash1.put("9_a_u", 2.0);
		myherohash1.put("9_i_u", 1.7);
		
		myherohash1.put("10_s_u", 1.8);
		myherohash1.put("10_a_u", 1.5);
		myherohash1.put("10_i_u", 2.9);
		
		myherohash1.put("11_s_u", 2.65);
		myherohash1.put("11_a_u", 1.7);
		myherohash1.put("11_i_u", 1.1);
		
		myherohash1.put("12_s_u", 1.8);
		myherohash1.put("12_a_u", 2.5);
		myherohash1.put("12_i_u", 1.7);
		
		myherohash1.put("13_s_u", 1.9);
		myherohash1.put("13_a_u", 1.3);
		myherohash1.put("13_i_u", 2.8);
		
		myherohash1.put("14_s_u", 2.0);
		myherohash1.put("14_a_u", 1.2);
		myherohash1.put("14_i_u", 2.8);
		
		myherohash1.put("15_s_u", 1.7);
		myherohash1.put("15_a_u", 1.2);
		myherohash1.put("15_i_u", 3.1);
		
		myherohash1.put("16_s_u", 1.7);
		myherohash1.put("16_a_u", 2.8);
		myherohash1.put("16_i_u", 1.5);
		
		myherohash1.put("17_s_u", 2.6);
		myherohash1.put("17_a_u", 1.5);
		myherohash1.put("17_i_u", 1.4);
		
		myherohash1.put("18_s_u", 1.9);
		myherohash1.put("18_a_u", 1.9);
		myherohash1.put("18_i_u", 2.2);
		
		myherohash1.put("19_s_u", 2.6);
		myherohash1.put("19_a_u", 1.7);
		myherohash1.put("19_i_u", 1.3);
		
		//魏国
		myherohash1.put("20_s_u", 1.8);
		myherohash1.put("20_a_u", 1.0);
		myherohash1.put("20_i_u", 3.2);
		
		myherohash1.put("21_s_u", 2.8);
		myherohash1.put("21_a_u", 1.6);
		myherohash1.put("21_i_u", 1.45);
		
		myherohash1.put("22_s_u", 1.6);
		myherohash1.put("22_a_u", 1.4);
		myherohash1.put("22_i_u", 3.0);
		
		myherohash1.put("23_s_u", 1.8);
		myherohash1.put("23_a_u", 1.0);
		myherohash1.put("23_i_u", 3.2);
		
		myherohash1.put("24_s_u", 2.4);
		myherohash1.put("24_a_u", 1.8);
		myherohash1.put("24_i_u", 1.7);
		
		myherohash1.put("25_s_u", 2.0);
		myherohash1.put("25_a_u", 2.3);
		myherohash1.put("25_i_u", 2.0);
		
		myherohash1.put("26_s_u", 2.2);
		myherohash1.put("26_a_u", 2.3);
		myherohash1.put("26_i_u", 1.5);
		
		myherohash1.put("27_s_u", 2.0);
		myherohash1.put("27_a_u", 2.5);
		myherohash1.put("27_i_u", 1.5);
		
		myherohash1.put("28_s_u", 1.7);
		myherohash1.put("28_a_u", 3.0);
		myherohash1.put("28_i_u", 1.3);
		
		myherohash1.put("29_s_u", 1.9);
		myherohash1.put("29_a_u", 3.0);
		myherohash1.put("29_i_u", 1.3);
		
		myherohash1.put("30_s_u", 2.9);
		myherohash1.put("30_a_u", 1.9);
		myherohash1.put("30_i_u", 1.2);
		
		myherohash1.put("31_s_u", 2.8);
		myherohash1.put("31_a_u", 1.7);
		myherohash1.put("31_i_u", 1.7);
		
		myherohash1.put("32_s_u", 1.6);
		myherohash1.put("32_a_u", 2.9);
		myherohash1.put("32_i_u", 1.5);
		
		myherohash1.put("33_s_u", 2.0);
		myherohash1.put("33_a_u", 2.0);
		myherohash1.put("33_i_u", 2.0);
		
		myherohash1.put("34_s_u", 2.5);
		myherohash1.put("34_a_u", 1.9);
		myherohash1.put("34_i_u", 1.6);
		
		myherohash1.put("35_s_u", 1.9);
		myherohash1.put("35_a_u", 1.1);
		myherohash1.put("35_i_u", 3.0);
		
		myherohash1.put("36_s_u", 3.2);
		myherohash1.put("36_a_u", 1.5);
		myherohash1.put("36_i_u", 1.3);
		
		//中立
		myherohash1.put("37_s_u", 1.9);
		myherohash1.put("37_a_u", 3.05);
		myherohash1.put("37_i_u", 1.55);
		
		myherohash1.put("38_s_u", 2.0);
		myherohash1.put("38_a_u", 1.9);
		myherohash1.put("38_i_u", 2.1);
		
		myherohash1.put("39_s_u", 2.0);
		myherohash1.put("39_a_u", 2.6);
		myherohash1.put("39_i_u", 1.4);
		
		myherohash1.put("40_s_u", 1.9);
		myherohash1.put("40_a_u", 3.0);
		myherohash1.put("40_i_u", 1.6);
		
		myherohash1.put("41_s_u", 2.0);
		myherohash1.put("41_a_u", 2.5);
		myherohash1.put("41_i_u", 1.7);
		
		myherohash1.put("42_s_u", 2.1);
		myherohash1.put("42_a_u", 3.0);
		myherohash1.put("42_i_u", 1.55);
		
		myherohash1.put("43_s_u", 2.7);
		myherohash1.put("43_a_u", 2.2);
		myherohash1.put("43_i_u", 1.2);
		
		mygoodhash.put("医疗剂",1);
		mygoodhash.put("净化药水",2);
		mygoodhash.put("治疗守卫",3);
		mygoodhash.put("岗哨守卫",4);
		mygoodhash.put("神农本草",5);
		mygoodhash.put("青囊书",6);
		mygoodhash.put("遁甲天书",7);
		mygoodhash.put("孙子兵法",8);
		mygoodhash.put("太平要术",9);
		mygoodhash.put("孟德新书",10);
		mygoodhash.put("铁木树枝",11);
		mygoodhash.put("力量手套",12);
		mygoodhash.put("智力斗篷",13);
		mygoodhash.put("皮鞋",14);
		mygoodhash.put("饰环",15);
		mygoodhash.put("护腕",16);
		mygoodhash.put("加速手套",17);
		mygoodhash.put("艺人面罩",18);
		mygoodhash.put("速度之靴",19);
		mygoodhash.put("恢复指环",20);
		mygoodhash.put("法师长袍",21);
		mygoodhash.put("耐力头盔",22);
		mygoodhash.put("玄武甲",23);
		mygoodhash.put("朱雀翼",24);
		mygoodhash.put("青龙胆",25);
		mygoodhash.put("钻石",26);
		mygoodhash.put("百草丸",27);
		mygoodhash.put("活丹",28);
		mygoodhash.put("夜明珠",29);
		mygoodhash.put("显形宝石",30);
		mygoodhash.put("冰玉",31);
		mygoodhash.put("烈玉",32);
		mygoodhash.put("雷玉",33);
		mygoodhash.put("炎玉",34);
		mygoodhash.put("毒玉",35);
		mygoodhash.put("铸造用槌",36);
		mygoodhash.put("盗贼短剑",37);
		mygoodhash.put("力量之斧",38);
		mygoodhash.put("否决之杖",39);
		mygoodhash.put("匕首",40);
		mygoodhash.put("铁剑",41);
		mygoodhash.put("铁戟",42);
		mygoodhash.put("钢铁之鎚",43);
		mygoodhash.put("月光枪",44);
		mygoodhash.put("铁枪",45);
		mygoodhash.put("吸血匕首",46);
		mygoodhash.put("玄铁匕首",47);
		mygoodhash.put("大斧",48);
		mygoodhash.put("黄忠弓",49);
		mygoodhash.put("史记",50);
		mygoodhash.put("银枪",51);
		mygoodhash.put("青虹剑",52);
		mygoodhash.put("银剑",53);
		mygoodhash.put("力量护腕",54);
		mygoodhash.put("护身符",55);
		mygoodhash.put("仙丹",56);
		mygoodhash.put("麒麟心",57);
		mygoodhash.put("神速符",58);
		mygoodhash.put("狂战士之斧",59);
		mygoodhash.put("护卫心得",60);
		mygoodhash.put("藤甲铠",61);
		mygoodhash.put("风暴之杖",62);
		mygoodhash.put("退魔刀",63);
		mygoodhash.put("玄武斧",64);
		mygoodhash.put("恶鬼鎚",65);
		mygoodhash.put("武士刀",66);
		mygoodhash.put("翔靴",67);
		mygoodhash.put("风行刃",68);
		mygoodhash.put("巫术杖",69);
		mygoodhash.put("黄龙剑",70);
		mygoodhash.put("源式之铠",71);
		mygoodhash.put("七星剑",72);
		mygoodhash.put("倚天剑",73);
		mygoodhash.put("大地斧",74);
		mygoodhash.put("血斧",75);
		mygoodhash.put("月下美人",76);
		mygoodhash.put("物品合成(蜀国专属)",77);
		mygoodhash.put("物品合成(魏国专属)",78);


		
		
	}
	static public int getValue(String name)
	{
		return myherohash.get(name);
	}
	
	static public Double getSAI(String name)
	{
		return myherohash1.get(name);
	}
	
	static public int getGoodIndex(String name)
	{
		return mygoodhash.get(name);
	}
	
	static public double getArmor(int agile)
	{
		double armor = 0.0;
		switch(agile)
		{
		case 15:
			armor = 1.4;
			break;
		case 16:
			armor = 1.6;
			break;
		case 17:
			armor = 1.7;
			break;
		case 18:
			armor = 1.9;
			break;
		case 19:
			armor = 2;
			break;
		case 20:
			armor = 2.2;
			break;
		case 21:
			armor = 2.4;
			break;
		case 22:
			armor = 2.5;
			break;
		case 23:
			armor = 2.7;
			break;
		case 24:
			armor = 2.8;
			break;
		case 25:
			armor = 3;
			break;
		case 26:
			armor = 3.2;
			break;
		case 27:
			armor = 3.3;
			break;
		case 28:
			armor = 3.5;
			break;
		case 29:
			armor = 3.6;
			break;
		case 30:
			armor = 3.8;
			break;
		case 31:
			armor = 4;
			break;
		case 32:
			armor = 4.1;
			break;
		case 33:
			armor = 4.3;
			break;
		case 34:
			armor = 4.4;
			break;
		case 35:
			armor = 4.6;
			break;
		case 36:
			armor = 4.8;
			break;
		case 37:
			armor = 4.9;
			break;
		case 38:
			armor = 5.1;
			break;
		case 39:
			armor = 5.2;
			break;
		case 40:
			armor = 5.4;
			break;
		case 41:
			armor = 5.6;
			break;
		case 42:
			armor = 5.7;
			break;
		case 43:
			armor = 5.9;
			break;
		case 44:
			armor = 6;
			break;
		case 45:
			armor = 6.2;
			break;
		case 46:
			armor = 6.4;
			break;
		case 47:
			armor = 6.5;
			break;
		case 48:
			armor = 6.7;
			break;
		case 49:
			armor = 6.8;
			break;
		case 50:
			armor = 7;
			break;
		case 51:
			armor = 7.2;
			break;
		case 52:
			armor = 7.3;
			break;
		case 53:
			armor = 7.5;
			break;
		case 54:
			armor = 7.6;
			break;
		case 55:
			armor = 7.8;
			break;
		case 56:
			armor = 8;
			break;
		case 57:
			armor = 8.1;
			break;
		case 58:
			armor = 8.3;
			break;
		case 59:
			armor = 8.4;
			break;
		case 60:
			armor = 8.6;
			break;
		case 61:
			armor = 8.8;
			break;
		case 62:
			armor = 8.9;
			break;
		case 63:
			armor = 9.1;
			break;
		case 64:
			armor = 9.2;
			break;
		case 65:
			armor =9.4;
			break;
		case 66:
			armor = 9.6;
			break;
		case 67:
			armor = 9.7;
			break;
		case 68:
			armor = 9.9;
			break;
		case 69:
			armor = 10.0;
			break;
		case 70:
			armor = 10.2;
			break;
		case 71:
			armor = 10.4;
			break;
		case 72:
			armor = 10.5;
			break;
		case 73:
			armor = 10.7;
			break;
		case 74:
			armor = 10.8;
			break;
		case 75:
			armor = 11;
			break;
		case 76:
			armor = 11.2;
			break;
		case 77:
			armor = 11.3;
			break;
		case 78:
			armor = 11.5;
			break;
		case 79:
			armor = 11.6;
			break;
		case 80:
			armor = 11.8;
			break;
		case 81:
			armor = 12;
			break;
		case 82:
			armor = 12.1;
			break;
		case 83:
			armor = 12.3;
			break;
		case 84:
			armor = 12.4;
			break;
		case 85:
			armor = 12.6;
			break;
		case 86:
			armor = 12.8;
			break;
		case 87:
			armor = 12.9;
			break;
		case 88:
			armor = 13.1;
			break;
		case 89:
			armor = 13.2;
			break;
		case 90:
			armor = 13.4;
			break;
		case 91:
			armor = 13.6;
			break;
		case 92:
			armor = 13.7;
			break;
		case 94:
			armor = 14;
			break;
		case 95:
			armor = 14.2;
			break;
		case 97:
			armor = 14.5;
			break;
		case 100:
			armor = 15;
			break;
		default:
				break;
		}
		return armor;
	}

}
