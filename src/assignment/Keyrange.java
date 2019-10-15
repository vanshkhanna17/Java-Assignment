package assignment;

import java.util.Scanner;
import java.util.TreeMap;

public class Keyrange {
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
		System.out.println("Enter lower key limit");
		int lk = s.nextInt();
		System.out.println("Enter upper key limit");
		int uk = s.nextInt();
		System.out.println("The element with keys ranging between "+lk+" and "+uk+" are "+tr.subMap(lk, uk));
	}
}
