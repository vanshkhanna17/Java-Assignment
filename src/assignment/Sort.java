package assignment;

import java.util.*;

public class Sort {

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
		System.out.println("Original list: "+array);
		Collections.sort(array);
		System.out.println("Sorted List: "+array );
	}

}
