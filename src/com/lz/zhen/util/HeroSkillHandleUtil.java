package com.lz.zhen.util;

import java.util.Arrays;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.lz.zhen.logic.HeroSkill;

class HeroSkillHandleUtil extends DefaultHandler {
	HeroSkill heroSkill;
	private int skillorder; // ¼¼ÄÜ´ÎÐò
	private int flag; // 1:name 2:info 3:skill1 4:skill2 5:skill3 6:skill4
						// 7:skill5

	public HeroSkillHandleUtil() {
		heroSkill = new HeroSkill();
		skillorder = 0;
		flag = 0;
	}
	
	public HeroSkill backResult()
	{
		return heroSkill;
	}

	@Override
	public void startDocument() throws SAXException {
		// TODO Auto-generated method stub
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		skillorder = 0;
		flag = 0;
		super.endDocument();
	}

	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		if (localName.equals("jineng")) {
			flag = 0;
			skillorder++;
		} else if (localName.equals("name")) {
			flag = 1;
		} else if (localName.equals("shuoming")) {
			flag = 2;
		} else if (localName.equals("jineng_1")) {
			flag = 3;
		} else if (localName.equals("jineng_2")) {
			flag = 4;
		} else if (localName.equals("jineng_3")) {
			flag = 5;
		} else if (localName.equals("jineng_4")) {
			flag = 6;
		}
		else
		{
			flag = 0;
		}
		super.startElement(uri, localName, qName, attributes);
	}

	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		super.endElement(uri, localName, qName);
	}

	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		if(!"\n".equals(String.valueOf(ch[0])))
		{
			if (1 == skillorder) {
				if (flag == 1)
					heroSkill.SkillName_1 = StringUtil.changeCharArraytoString(ch,length);// Arrays.toString(ch);
				else if (flag == 2)
					heroSkill.SkillInfo_1 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 3)
					heroSkill.SkillInfo_1_1 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 4)
					heroSkill.SkillInfo_1_2 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 5)
					heroSkill.SkillInfo_1_3 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 6)
					heroSkill.SkillInfo_1_4 = StringUtil.changeCharArraytoString(ch,length);
			} else if (2 == skillorder) {
				if (flag == 1)
					heroSkill.SkillName_2 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 2)
					heroSkill.SkillInfo_2 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 3)
					heroSkill.SkillInfo_2_1 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 4)
					heroSkill.SkillInfo_2_2 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 5)
					heroSkill.SkillInfo_2_3 = StringUtil.changeCharArraytoString(ch,length);
				else if (flag == 6)
					heroSkill.SkillInfo_2_4 = StringUtil.changeCharArraytoString(ch,length);
			}
			 else if (3 == skillorder) {
					if (flag == 1)
						heroSkill.SkillName_3 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 2)
						heroSkill.SkillInfo_3 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 3)
						heroSkill.SkillInfo_3_1 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 4)
						heroSkill.SkillInfo_3_2 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 5)
						heroSkill.SkillInfo_3_3 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 6)
						heroSkill.SkillInfo_3_4 = StringUtil.changeCharArraytoString(ch,length);
				}
			 else if (4 == skillorder) {
					if (flag == 1)
						heroSkill.SkillName_4 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 2)
						heroSkill.SkillInfo_4 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 3)
						heroSkill.SkillInfo_4_1 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 4)
						heroSkill.SkillInfo_4_2 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 5)
						heroSkill.SkillInfo_4_3 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 6)
						heroSkill.SkillInfo_4_4 = StringUtil.changeCharArraytoString(ch,length);
				}
			 else if (5 == skillorder) {
					if (flag == 1)
						heroSkill.SkillName_5 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 2)
						heroSkill.SkillInfo_5 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 3)
						heroSkill.SkillInfo_5_1 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 4)
						heroSkill.SkillInfo_5_2 = StringUtil.changeCharArraytoString(ch,length);
					else if (flag == 5)
						heroSkill.SkillInfo_5_3 = StringUtil.changeCharArraytoString(ch,length);
				}
		}
		
		super.characters(ch, start, length);
	}

}
