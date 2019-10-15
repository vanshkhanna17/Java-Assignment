package assignment;

import java.util.*;

public class Iterator {
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
	System.out.println("Enter index from which iteration is to be started.");
	int ind = s.nextInt();
	ListIterator i = array.listIterator(ind);
	while(i.hasNext()) {
	System.out.println(i.next());
		}
	}
}
