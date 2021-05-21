package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.LinkedList;
import design.Node;

public class MiddleElement {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String stringList[] = br.readLine().split(" ");
		
		LinkedList myList = new LinkedList<String>();
		
		for(String current: stringList) {
			myList.insert(current);
		}
		
		displayMiddleElement(myList);
	}
	
	public static void displayMiddleElement(LinkedList myList) {
		
		Node slow,fast;
		
		slow = myList.getFirst();
		fast = slow.getNext();
		
		while( fast != null && fast.getNext() != null ) {
			
			slow = slow.getNext();
			fast = fast.getNext().getNext();
		}
		
		System.out.println(slow);
	}
}
