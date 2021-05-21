package examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.LinkedList;
import design.Node;

// Find whether first list is present in second list
// E.g :

// 2 -> 10 -> 4							L1
// 1 -> 4 -> 2 -> 10 -> 4 -> 5  		L2

//So above is true


// Start iterating List 2 
// compare each element with list1 and keep incrementing till list1 becomes null ( ie complete )
// if an unmatch is found, break the loop, start with the next element of list2 from where your started previously

// 2 loop lagenge .. Outer will iterate list2 eles one by one
// inner loop will compare list1 elements from that current element.

public class SubListSearch {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader( isr );
		
		String[] input1 = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		
		LinkedList list1 = new LinkedList();
		LinkedList list2 = new LinkedList();
		
		for (int i = 0; i < input1.length; i++) {

			list1.insert(input1[i]);
		}
		
		for (int i = 0; i < input2.length; i++) {

			list2.insert(input2[i]);
		}
		
		list1.display();
		list2.display();
		boolean answer = checkSublist(list1, list2);
		
		System.out.println(answer);
	}
	
	static boolean checkSublist(LinkedList list1, LinkedList list2) {
		
		Node ptr1 = list1.getFirst();
		Node ptr2 = list2.getFirst();
		Node current2 = ptr2;
		
		if( null == ptr1 && null == ptr2 )
			return false;
		
		
		if( null == ptr1 || ( null != ptr1 && null == ptr2 ))
			return false;
		
		while( null != ptr2 ) {
			
			current2 = ptr2;
			
			while( null != ptr1 ) {
				
				if( null != current2 && ptr1.getItem().equals(current2.getItem())) {
					ptr1 = ptr1.getNext();
					current2 = current2.getNext();
				}
				else
					break;
			}
			
			if( ptr1 == null ) {
				return true;
			}
			
			ptr1 = list1.getFirst();
			ptr2 = ptr2.getNext();
		}
		
		return false;
	}
	
}
