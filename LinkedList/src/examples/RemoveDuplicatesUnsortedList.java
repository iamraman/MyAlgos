package examples;

import java.io.IOException;
import java.util.HashSet;

import design.LinkedList;
import design.Node;
import util.InputList;

// Iterate through the list, keep adding items to a set, check if current item was already added.
// =? 2 1 4 3 2 1 6 1 4 
// => 2 1 4 3 6
public class RemoveDuplicatesUnsortedList {
	
	public static void main(String[] args) throws IOException {
		
		String[] input = InputList.getList();
		
		LinkedList<Integer> myList = new LinkedList<Integer>();
		
		for(String current : input) {
			
			myList.insert(Integer.valueOf(current));
		}
		
		removeDuplicates( myList );
		
		System.out.println(myList);
	}

	public static void removeDuplicates( LinkedList<Integer> myList) {
		
		HashSet<Integer> auditor = new HashSet<Integer>();
		
		Node head = myList.getFirst();
		
		auditor.add((Integer)head.getItem());
		
		Node previous = head;
		Node current = head.getNext();
		
		while( null != current ) {
			
			if( auditor.contains(current.getItem()) ) {
				
				previous.setNext(current.getNext());
			}
			else {
				auditor.add((Integer)current.getItem());
				previous = current;
			}
			current = current.getNext();
		}
	}
}
