package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Occurrence {
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
		array.add("Violet");
		array.add("Indigo");
		array.add("Blue");
		array.add("Green");
		array.add("Yellow");
		array.add("Orange");
		array.add("Red");
		Collections.shuffle(array);
		System.out.println("Original list: "+array);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter colour whose first and last occurrence is to be found in the list.");
		String el=s.next();
		int fi=array.indexOf(el);
		int li= array.lastIndexOf(el);
		System.out.println("First occurrence is at index "+fi+" and the last occurrence is at index "+li);

	}
}
