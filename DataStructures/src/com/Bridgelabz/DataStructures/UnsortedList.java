package com.Bridgelabz.DataStructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class UnsortedList {
	public static void main(String[] args) throws IOException {
			
		FileReader file=new FileReader("/home/bridgelabz/Desktop/sample.txt"); 
		BufferedReader br=new BufferedReader(file);
		String r="";  
		while((r=br.readLine())!=null)  
		{  
			String[] currencies = r.split(" "); 
		
		LinkedList<String> list=new LinkedList<String>();
		for(String str: list)
	      {
	    	  System.out.println(str);
	      }
		list.addAll(Arrays.asList(currencies));
		System.out.println(list);
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a word");
		String a=s.next();
		 boolean ans = list.contains(a); 
		 if(ans) {
			
			 list.remove(a);
		       System.out.print(list);      
		 }
		 else {
			 list.add(a);
			System.out.println(list);
	           

		 }
		
		      }
			
	       
		
		 
			br.close();
		 
}
			
}
