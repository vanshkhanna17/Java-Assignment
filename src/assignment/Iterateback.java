package assignment;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Iterateback {
	public static void main(String[] args) {
	List<String> array = new LinkedList<String>();
	
	array.add("Violet");
	array.add("Indigo");
	array.add("Blue");
	array.add("Green");
	array.add("Yellow");
	array.add("Orange");
	array.add("Red");
	System.out.println("Original list: "+array);
	Scanner s = new Scanner(System.in);
	ListIterator i = array.listIterator(array.size());
	while(i.hasPrevious()) {
	System.out.println(i.previous());
		}
	}
}
