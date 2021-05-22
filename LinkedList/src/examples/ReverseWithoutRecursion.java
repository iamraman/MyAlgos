package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.LinkedList;
import design.Node;

public class ReverseWithoutRecursion {

	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		String input[] = br.readLine().split(" ");
		
		LinkedList myList = new LinkedList<String>();
		
		for(String currentWord : input) {
			myList.insert(currentWord);
		}
		
		System.out.println(myList);
		
		reverseList(myList);
		
		System.out.println(myList);
	}
	
	public static void reverseList(LinkedList myList) {
		
		Node past = null, present, future;
		
		present = future = myList.getFirst();
		
		while( future != null ) {
			
			future = future.getNext();
			
			present.setNext(past);
			past = present;
			present = future;
		}
		
		myList.setFirst(past);
	}
}
