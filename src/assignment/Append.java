package assignment;

import java.util.*;

public class Append {
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
	System.out.println("Enter colour to be added at the last position of the list.");
	array.add(array.size(),s.next());
	System.out.println("Updated List: "+array );
	}
}
