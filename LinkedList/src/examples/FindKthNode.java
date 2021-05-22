package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.LinkedList;
import design.Node;
import util.InputList;

public class FindKthNode {
	
	public static void main(String[] args) throws IOException {
		
		String[] inputList = InputList.getList();
		
		LinkedList myList = new LinkedList<String>();
		
		for(String current: inputList) {
			myList.insert(current);
		}
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int k = Integer.valueOf(br.readLine());
		
		printKthNode(myList, k); 
	}
	
	public static void printKthNode(LinkedList<String> myList, int k ) {
		
		Node temp = myList.getFirst();

		while( temp!= null && k > 0) {
			temp = temp.getNext();
			--k;
		}
		
		if( k > 0 ) {
			System.out.println("Length of list is too short! Aborting..");
			return;
		}
		
		Node result = myList.getFirst();
		
		while( temp != null ) {
			
			result = result.getNext();
			temp = temp.getNext();
		}
		
		System.out.println(result);
	}
}
