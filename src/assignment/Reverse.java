package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse {
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
		Collections.reverse(array);
		System.out.println("Reversed List: "+array );
	}
}
