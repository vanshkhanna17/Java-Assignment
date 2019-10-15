package assignment;

import java.util.*;

public class GreatestLowestKey {
	public static void main(String[] args) {
	TreeMap<Integer,String> tr= new TreeMap<>();
	tr.put(1,"Violet");
	tr.put(2,"Indigo");
	tr.put(3,"Blue");
	tr.put(4,"Green");
	tr.put(5,"Yellow");
	tr.put(6,"Orange");
	tr.put(7,"Red");
	System.out.println("The element with lowest key is "+tr.get(tr.firstKey()));
	System.out.println("The element with highest key is "+tr.get(tr.lastKey()));
	}
}