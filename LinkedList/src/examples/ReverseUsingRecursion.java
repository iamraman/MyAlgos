package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.LinkedList;
import design.Node;


// https://www.hackerrank.com/challenges/reverse-a-linked-list/forum

public class ReverseUsingRecursion {
	public static void main(String[] args) throws IOException {

		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader( isr );
		
		String[] input = br.readLine().split(" ");
		
		LinkedList myList = new LinkedList();
		
		for(String word : input) {
			myList.insert(word);
		}
		
		System.out.println("Original :");
		myList.display();
		
		System.out.println("Reverse : ");
		
		myList.setFirst(reverse(myList));
		
		myList.display();
	}
	
	static Node reverse(LinkedList myList) {
		
		Node head = myList.getFirst();
		
		return reverseIt(head);
	
	}
	
	static Node reverseIt(Node node) {
		
		if( node.getNext() == null ) {
			return node;
		}
		
		Node newNode = reverseIt(node.getNext());
		
		node.getNext().setNext(node);
		node.setNext(null);
		
		return newNode;
	}
}