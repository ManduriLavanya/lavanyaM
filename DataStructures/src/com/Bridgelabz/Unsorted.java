package com.Bridgelabz;

import java.io.IOException;
import com.Bridgelabz.LinkedList;
import java.util.Scanner;

public class Unsorted {
	public static void main(String[] args) {
		Utility utility = new Utility();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArray = null;
		try {
			strArray = utility.readFile(
					"C:\\Users\\Hello\\Desktop\\input.txt")
					.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int size = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			list.add(strArray[i]);
		}
		System.out.println(list.show());

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter key to search");
		String key = scanner.next();
		size = list.searchNode(key, size);
		System.out.println(list.show());

		try {
			utility.writeFile(
					"C:\\Users\\Hello\\Desktop\\output.txt",
					list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		scanner.close();
	}
	
	

}
