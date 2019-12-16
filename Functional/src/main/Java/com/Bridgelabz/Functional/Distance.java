package com.Bridgelabz.Functional;

public class Distance {

	public static double Dis(int a,int b) {
		int a1=a*a;
		int b1=b*b;
		double dist = Math.sqrt(a1 + b1);
		long i=Math.round(dist);
		
		return i;
		}
	
	
}
