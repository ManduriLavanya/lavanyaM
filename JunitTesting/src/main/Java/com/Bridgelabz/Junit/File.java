package com.Bridgelabz.Junit;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File {
     
	public static void main(String args[]) throws IOException 
	{  
	try  
	{  
	//constructor of file class having file as argument  
	FileReader file=new FileReader("/home/bridgelabz/Desktop/sample.txt"); 
	BufferedReader br=new BufferedReader(file);

	//FileInputStream fis=new FileInputStream(file);     //opens a connection to an actual file  
	System.out.println("file content: ");  
	String r="";  
	while((r=br.readLine())!=null)  
	{  
	System.out.print(r);      //prints the content of the file  
	}  
	br.close();
	}  
	
	catch(Exception e)  
	{  
	e.printStackTrace();  
	}  
	}  
	}  

