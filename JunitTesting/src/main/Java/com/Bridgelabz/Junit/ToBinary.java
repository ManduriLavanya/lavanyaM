package com.Bridgelabz.Junit;


public class ToBinary {
	
	public static int Bin(int n) {
		
		int rem,b=0,i=1;
		while(n>0) {
		rem=n%2;
		n/=2;
		b+=rem*i;
		i*=10;
		//return b;
		
		}
		
		//System.out.println("Ans:"+b);
		return b;
	}
}