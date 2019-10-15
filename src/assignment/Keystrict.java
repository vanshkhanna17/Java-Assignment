package assignment;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Keystrict {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tr= new TreeMap<>();
		tr.put(1,"Violet");
		tr.put(2,"Indigo");
		tr.put(3,"Blue");
		tr.put(4,"Green");
		tr.put(5,"Yellow");
		tr.put(6,"Orange");
		tr.put(7,"Red");
		System.out.println("The tree map 1: "+tr);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Key to check for smaller keys");
		int k = s.nextInt();
		System.out.println("The element with keys smaller than "+k+" are "+tr.headMap(k));
	}
}
