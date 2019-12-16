package com.Bridgelabz.Basic;

public class Replace {

public static Object replacestr(String b) {
		
		String a="Hello <<username>>,How are you?";
		String r=a.replace("<<username>>",b);
		return r;
	}
}
