package assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RemoveAndReturn {
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
		System.out.println("The Linked List before removing element: "+ll);
		System.out.println("The element "+ll.get(0)+" was removed from the first place" );
		ll.remove(0);
		System.out.println("The Linked List after removing element: "+ll);
	}
}
