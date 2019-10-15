package assignment;

import java.util.*;

public class RetrieveLL {
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
		Collections.shuffle(array);
		int index = array.size();
		String el = array.get(index-1);
		System.out.printf("The element at last index is %s ",el);
	}
}
