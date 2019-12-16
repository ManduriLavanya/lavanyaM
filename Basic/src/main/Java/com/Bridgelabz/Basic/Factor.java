package com.Bridgelabz.Basic;

public class Factor {

public static int factor(int n) {
		
		
		int t;
		
		t=n;
		for(int i = 2; i< n; i++) {
	         while(n%i == 0) {
	            //System.out.print(i+" ");
	            n = n/i;
	            
	         }
	      }
		
		 if(n >2) {
	       // System.out.println(n);
	      }
		if(t==n) {
			//System.out.println("same");
		}
		
		return t;
		
	}

}
