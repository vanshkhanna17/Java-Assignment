package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Retrieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array = new ArrayList<String>();
		
		array.add("Violet");
		array.add("Indigo");
		array.add("Blue");
		array.add("Green");
		array.add("Yellow");
		array.add("Orange");
		array.add("Red");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter index to retrieve that element.");
		int index = s.nextInt();
		String el = array.get(index);
		System.out.printf("The element at index %d is %s ",index,el);
	}

}
