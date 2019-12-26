package com.Bridgelabz.Generics;
import com.Bridgelabz.Generics.Stack;

import java.util.Scanner;

public class Balanced {
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string:");
		String a=s.next();
		Balanced b=new Balanced();
		Balanced.check(a);
		System.out.println(a+" = "+check(a));
		
		 }
		 public static boolean check(String a)
		 {
		 if (a.isEmpty())
		 return true;
		 
		 Stack stack = new Stack();
		 for (int i = 0; i < a.length(); i++)
		 {
		 char current = a.charAt(i);
		 if (current == '{' || current == '(' || current == '[')
		 {
		 stack.push(current);
		 }
		 if (current == '}' || current == ')' || current == ']')
		 {
		 if (stack.isEmpty())
		 return false;
		 char last = (char) stack.peek();
		 if (current == '}' && last == '{' || current == ')' && last == '(' || current == ']' && last == '[')
		 stack.pop();
		 else 
		 return false;
		 }
		 }
		 return stack.isEmpty()?true:false;
		 }
		 
}
