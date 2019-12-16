package com.Bridgelabz.Basic;

public class FlipCoin {

	public static double flip(double d) {
		double h=0.0,t=0.0;
	
		for(int i=0;i<5;i++) {
			double a=Math.random();
			if(a>0.5) {
				
		    	//System.out.println("Tails");
				h=h+1;
			}
			
			else
			{
		    	//System.out.println("Heads");
		    	t=t+1;
			}
						
	}
		double ph=(h/5)*100;
		double pt=(t/5)*100;

	//	System.out.println("Head = "+ph+ "\nTail = "+pt+"\n");
		if(ph>pt) {
			//System.out.println("head = "+ph);
			return ph;
		}
		else if(pt==ph) {
		//	System.out.println("Both are same = "+pt);
			return pt;
		}
		else if(pt>ph){
		//	System.out.println("tail = "+pt);
			return pt;
		}
		return pt;	
		}
}
