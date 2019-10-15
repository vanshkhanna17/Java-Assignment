package assignment;

import java.util.Map;
import java.util.TreeMap;

public class CopyTree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> tr= new TreeMap<>();
		Map<Integer,String> tr2= new TreeMap<>();
		tr.put(1,"Violet");
		tr.put(2,"Indigo");
		tr.put(3,"Blue");
		tr.put(4,"Green");
		tr.put(5,"Yellow");
		tr.put(6,"Orange");
		tr.put(7,"Red");
		tr2.putAll(tr);
		System.out.println("The tree map 1: "+tr);
		System.out.println("The tree map 2 (after copying): "+tr);
	}
}
