package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Compare {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> array1 = new ArrayList<String>();
		List<String> array2 = new ArrayList<String>();
		List<String> array3 = new ArrayList<String>();
		
		array1.add("Violet");
		array1.add("Indigo");
		array1.add("Blue");
		array1.add("Green");
		array1.add("Yellow");
		array1.add("Orange");
		array1.add("Red");
		
		array2.add("Violet");
		//array2.add("Indigo");
		array2.add("Blue");
		array2.add("Green");
		//array2.add("Yellow");
		//array2.add("Orange");
		array2.add("Red");
		
		System.out.println("First list: "+array1);
		System.out.println("Second List: "+array2 );
		
		for(String e: array1) {
			if(array2.contains(e))
				array3.add(e);
		}
		System.out.println("Common Elements List: "+array3);
	}
}
