package com.Bridgelabz.Junit;


public class Temperature {

		public static long fahren(double f) {
			//Fahrenheit to Celsius: (°F − 32) x 5/9 = °C 
					double e=(f-32)*5/9;
					//System.out.println("Conversion of F to C is:"+e+"degree.");
					
					long a=Math.round(e);
				//	System.out.println("a="+e);
					
					return a;
		}

		public static long celsius(double c) {
			
			//Celsius to Fahrenheit: (°C × 9/5) + 32 = °F// 37°C × 9/5) + 32 = 98.6°F

					double b=9 * (c / 5) + 32;		
				//	System.out.println("Conversion of C to F is:"+b+"degree.");
					long a=Math.round(b);
				//	System.out.println("a="+a);
					
					return a;
			
		}
		
		
	
}