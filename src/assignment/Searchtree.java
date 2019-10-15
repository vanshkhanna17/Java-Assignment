package assignment;

import java.util.*;

public class Searchtree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> tr= new TreeMap<>();
		tr.put(1,"Violet");
		tr.put(2,"Indigo");
		tr.put(3,"Blue");
		tr.put(4,"Green");
		tr.put(5,"Yellow");
		tr.put(6,"Orange");
		tr.put(7,"Red");
		System.out.println("The tree map 1: "+tr);
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Key to search");
		int k = s.nextInt();
		if(tr.containsKey(k)) {
			System.out.println("The element with key "+k+" is "+tr.get(k));
		}
		else
			System.out.println("Key not found");
	}
}
