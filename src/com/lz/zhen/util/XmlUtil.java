package com.lz.zhen.util;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import com.lz.zhen.logic.HeroSkill;

public class XmlUtil {
	
	public static HeroSkill ParseSkill(InputStream is)
	{
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		HeroSkill back = null;
		try {
			SAXParser saxparser =  saxParserFactory.newSAXParser();
			HeroSkillHandleUtil heroSkillHandleUtil = new HeroSkillHandleUtil();
			try {
				InputSource isource = new InputSource(is);
				isource.setEncoding("UTF-8");
				saxparser.parse(is, heroSkillHandleUtil);
				back = heroSkillHandleUtil.backResult();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return back;
	}
}
