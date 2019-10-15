package assignment;

import java.util.*;

public class Hashinsert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		HashSet<String> array = new HashSet<String>();
		
		array.add("Violet");
		array.add("Indigo");
		array.add("Blue");
		array.add("Green");
		array.add("Yellow");
		array.add("Orange");
		array.add("Red");
		System.out.println("Original list: "+array);
		Scanner s = new Scanner(System.in);
		System.out.println("Enter colour to be added at the first position of the list.");
		array.add(0,s.next());
		System.out.println("Updated array: "+array);

	}
}
