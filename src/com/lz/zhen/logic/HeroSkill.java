package com.lz.zhen.logic;

public class HeroSkill {
	public String SkillName_1;
	public String SkillName_2;
	public String SkillName_3;
	public String SkillName_4;
	public String SkillName_5;
	public String SkillInfo_1;
	public String SkillInfo_2;
	public String SkillInfo_3;
	public String SkillInfo_4;
	public String SkillInfo_5;
	public String SkillInfo_1_1;
	public String SkillInfo_1_2;
	public String SkillInfo_1_3;
	public String SkillInfo_1_4;
	public String SkillInfo_2_1;
	public String SkillInfo_2_2;
	public String SkillInfo_2_3;
	public String SkillInfo_2_4;
	public String SkillInfo_3_1;
	public String SkillInfo_3_2;
	public String SkillInfo_3_3;
	public String SkillInfo_3_4;
	public String SkillInfo_4_1;
	public String SkillInfo_4_2;
	public String SkillInfo_4_3;
	public String SkillInfo_4_4;
	public String SkillInfo_5_1;
	public String SkillInfo_5_2;
	public String SkillInfo_5_3;
	
	public void setValue(String value,int flag,int skillIndex,int skillLevel)
	{
		if(1 == flag)  //技能名字
		{
			if(1 == skillIndex)
				SkillName_1 = value;
			else if(2 == skillIndex)
				SkillName_2 = value;
			else if(3 == skillIndex)
				SkillName_3 = value;
			else if(4 == skillIndex)
				SkillName_4 = value;
			else if(5 == skillIndex)
				SkillName_5 = value;
		}
		else if(2 == flag)  //技能具体说明
		{
			if(1 == skillIndex)
				SkillInfo_1 = value;
			else if(2 == skillIndex)
				SkillInfo_2 = value;
			else if(3 == skillIndex)
				SkillInfo_3 = value;
			else if(4 == skillIndex)
				SkillInfo_4 = value;
			else if(5 == skillIndex)
				SkillInfo_5 = value;
		}
		else if(3 == flag)  //技能不同等级具体说明
		{
			if(1 == skillIndex)
			{	
				if(1 == skillLevel)
					SkillInfo_1_1 = value;
				else if(2 == skillLevel)
					SkillInfo_1_2 = value;
				else if(3 == skillLevel)
					SkillInfo_1_3 = value;
				else if(4 == skillLevel)
					SkillInfo_1_4 = value;
			}
			else if(2 == skillIndex)
			{	
				if(1 == skillLevel)
					SkillInfo_2_1 = value;
				else if(2 == skillLevel)
					SkillInfo_2_2 = value;
				else if(3 == skillLevel)
					SkillInfo_2_3 = value;
				else if(4 == skillLevel)
					SkillInfo_2_4 = value;
			}
			else if(3 == skillIndex)
			{	
				if(1 == skillLevel)
					SkillInfo_3_1 = value;
				else if(2 == skillLevel)
					SkillInfo_3_2 = value;
				else if(3 == skillLevel)
					SkillInfo_3_3 = value;
				else if(4 == skillLevel)
					SkillInfo_3_4 = value;
			}
			else if(4 == skillIndex)
			{	
				if(1 == skillLevel)
					SkillInfo_4_1 = value;
				else if(2 == skillLevel)
					SkillInfo_4_2 = value;
				else if(3 == skillLevel)
					SkillInfo_4_3 = value;
				else if(4 == skillLevel)
					SkillInfo_4_4 = value;
			}
			else if(5 == skillIndex)
			{	
				if(1 == skillLevel)
					SkillInfo_5_1 = value;
				else if(2 == skillLevel)
					SkillInfo_5_2 = value;
				else if(3 == skillLevel)
					SkillInfo_5_3 = value;
			}
		}
	}
	
}
