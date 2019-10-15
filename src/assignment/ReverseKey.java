package assignment;

import java.util.*;

public class ReverseKey {
	public static void main(String[] args) {
	TreeMap<Integer,String> tr= new TreeMap<>();
	tr.put(1,"Violet");
	tr.put(2,"Indigo");
	tr.put(3,"Blue");
	tr.put(4,"Green");
	tr.put(5,"Yellow");
	tr.put(6,"Orange");
	tr.put(7,"Red");
	
	System.out.println("The tree is "+tr);
	System.out.println("The reverse tree is "+tr.descendingKeySet());
	}
}
