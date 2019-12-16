package com.Bridgelabz.Functional;

public class Quadratic {


	public static double quadratic(double a,double b,double c) {
		double d=((b*b) - (4*a*c));
		

		double  x= (-b + Math.sqrt(d))/(2*a);

		double  y= (-b - Math.sqrt(d))/(2*a);
		double z=Math.abs(x)+Math.abs(y);
		return z;
		
	}
}
