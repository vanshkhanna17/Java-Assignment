package assignment;

import java.util.*;

public class LLtoAL {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ll = new LinkedList<String>();
		
		ll.add("Violet");
		ll.add("Indigo");
		ll.add("Blue");
		ll.add("Green");
		ll.add("Yellow");
		ll.add("Orange");
		ll.add("Red");
		Collections.shuffle(ll);
		List<String> al = new ArrayList<String>(ll);
		System.out.println("The Linked List is: "+ll);
		System.out.println("The Array List is: "+al);
	}
}
