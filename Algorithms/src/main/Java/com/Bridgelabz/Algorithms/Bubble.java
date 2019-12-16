package com.Bridgelabz.Algorithms;

public class Bubble {
	public static String bubble(String [] str) {
	        String temp = null;
//Sorting the strings
for (int i = 0; i < 5; i++) 
{
    for (int j = i + 1; j < 5; j++) { 
        if (str[i].compareTo(str[j])>0) 
        {
            temp = str[i];
            str[i] = str[j];
            str[j] = temp;
        }
    }
}

//   System.out.print("Strings in Sorted Order:");
for (int i = 0; i <= 5-1; i++) //n-1
{
    System.out.print(str[i] + " ");
}
return temp;
}


}
