package assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Search {

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
		System.out.println("Enter colour name to search.");
		if(array.contains(s.next()))
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}

}
