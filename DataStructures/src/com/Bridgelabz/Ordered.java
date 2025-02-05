package com.Bridgelabz;
import com.Bridgelabz.LinkedList;
import java.io.IOException;
import java.util.Scanner;

public class Ordered {
	
	public static void main(String[] args) {
	Utility utility = new Utility();
	LinkedList<String> list = new LinkedList<String>();
	String[] strArr =null;

	try {
		strArr = (utility.readFile(
				"C:\\Users\\Hello\\Desktop\\input.txt")
				.split(","));

	} catch (IOException e) {
		e.printStackTrace();
	}
	int[] integerArr = new int[strArr.length];
	for (int i = 0; i < strArr.length; i++) {
		integerArr[i] = Integer.parseInt(strArr[i]);
		list.add(integerArr[i]);
	}
	int size = integerArr.length;
	System.out.println(list.show());
	System.out.println("\nSorting");
	list.sort(size);
	System.out.println(list.show());
	
	System.out.println("\nEnter key to search in list:");
	Scanner scanner = new Scanner(System.in);
	int key = scanner.nextInt();
	size = list.searchNode(key, size);
	
	
	
	scanner.close();
	
	System.out.println("\nSorting");
	list.sort(size);

	System.out.println(list.show());
	String str = list.returnListInString();
	try {
		utility.writeFile(
				"C:\\Users\\Hello\\Desktop\\output.txt",
				str);
	} catch (IOException e1) {
		e1.printStackTrace();
	}
}

}
