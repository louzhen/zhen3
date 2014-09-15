package com.lz.zhen.util;

public class StringUtil {
	static public String changeCharArraytoString(char[] a,int length)
	{
		StringBuffer stringBuffer = new StringBuffer();
	//	for(char b:a)
		for(int i = 0;i<length;i++)
		{
			stringBuffer.append(a[i]);
		}
		return stringBuffer.toString();
	}
}
