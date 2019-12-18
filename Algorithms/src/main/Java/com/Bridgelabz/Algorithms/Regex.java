package com.Bridgelabz.Algorithms;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Regex {
	
	

	 public String replaceWithPattern(String str,String replace){
         
	        Pattern ptn = Pattern.compile("\\s+");
	        Matcher mtch = ptn.matcher(str);
	        return mtch.replaceAll(replace);
	    }
	     
	    public static void main(String a[]){
	        String str = "Hello <<name>>, We have your full\n" + 
	        		"name as <<full name>> in our system. your contact number is 91-xxxxxxxxxx.\n" + 
	        		"Please,let us know in case of any clarification Thank you BridgeLabz 01/01/2016.  ";
	       Regex mpr = new Regex();
	        System.out.println(mpr.replaceWithPattern(str, " "));
	    }
	}