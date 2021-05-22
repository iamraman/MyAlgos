package examples;

import java.io.IOException;

import design.LinkedList;
import design.Node;
import util.InputList;


// Sum of two Linked Lists
// Write general method that adds to linked lists of same length
// When length is not equal
// 		iterate bigger list till both are of same length
//		call method to add lists of same size
//      trim the bigger list excluding nodes already added 
//		add carry from the previous method to this list.

//	Print result linkedList as answer.

// 1 2 3
// 2 3 
// => 1 4 6

// 1 3 5 7 8 9 10 4 12 13
//			   4 54 32 11
// => 1 3 5 7 9 1 0 2 6 4

public class SumOfTwoLists {
	
	public static LinkedList resultList = new LinkedList<Integer>();
	public static void main(String[] args) throws IOException {
		
		String[] input1 = InputList.getList();
		String[] input2 = InputList.getList();
		
		int oneSize = input1.length;
		int twoSize = input2.length;
		
		LinkedList<Integer> listOne = new LinkedList<Integer>();
		LinkedList<Integer> listTwo = new LinkedList<Integer>();
		
		for(String current : input1 ) {
			listOne.insert( Integer.valueOf(current) );
		}
		
		for(String current : input2 ) {
			listTwo.insert( Integer.valueOf(current) );
		}
		
		printSumOfTwoLists(listOne, listTwo, oneSize, twoSize);
		
		System.out.println(resultList);
	}
	
	public static void printSumOfTwoLists(LinkedList listOne, LinkedList listTwo, int sizeOne, int sizeTwo ) {
		
		// 2 different cases here
		// Case: Lists can be of same size
		
		if(sizeOne == sizeTwo) {
			int carry = sumOfTwoEqualLists(listOne.getFirst(), listTwo.getFirst());
			
			addToResult(carry);
			return;
		}
		
		// Case: Lists are of different size
		// Calculate the difference in length, iterate longer list till the difference to make the two Lists of equal size
		// peform sumOfTwoLists, add carry to the rest of the list.
		
		if( sizeOne > sizeTwo ) {
			
			trimAndAdd(listOne, listTwo, sizeOne - sizeTwo);
		}
		else {
			trimAndAdd(listTwo, listOne, sizeTwo - sizeOne);
		}
		
		
	}
	
	// it returns int ( carry ) so that carry from current two nodes can be returned to previous nodes.
	public static int sumOfTwoEqualLists(Node one, Node two) {
		
		if( one == null ) {
			return 0;
		}
		
		int carry = sumOfTwoEqualLists(one.getNext(), two.getNext());
		
		return calculateNewCarry((Integer)one.getItem(), (Integer)two.getItem(), carry );
	}
	
	public static void trimAndAdd(LinkedList bigger, LinkedList shorter, int diff) {
		
		Node bigHead = bigger.getFirst();
		Node shortHead = shorter.getFirst();
		
		// Making the two lists equal by iterating forward till their difference 
		int length = diff;
		
		while( length > 0 ) {
			bigHead = bigHead.getNext();
			length--;
		}
		
		int carry = sumOfTwoEqualLists(bigHead, shortHead);
		
		trimList(bigger, diff-1);
		
		propagateCarry(bigger, carry);
	}
	
	// Add carry to an entire list.
	public static void propagateCarry(LinkedList<Integer> myList, int carry) {
						
		addCarryToList(myList.getFirst(),carry);
	}
	
	// recursively go to the end of the list and add carry just like in sum of two lists method.
	public static int  addCarryToList(Node lastNode, int carry) {
		
		if( null == lastNode )
			return carry;
		
		carry = addCarryToList(lastNode.getNext(), carry);
		
		return calculateNewCarry((Integer)lastNode.getItem(), 0, carry);
	}
	
	public static int calculateNewCarry(int one, int two, int carry) {
		
		int sum = one + two + carry;
		carry = sum / 10;
		int result = sum % 10;
		
		addToResult(result);
		return carry;
	}
	
	public static void addToResult(int value) {

		Node newNode = new Node(value,null);
		
	
		newNode.setNext(resultList.getFirst());
		resultList.setFirst(newNode);
	}
	
	public static void trimList(LinkedList myList, int length) {
		
		Node head = myList.getFirst();
		
		while( length > 0 ) {
			head = head.getNext();
			length--;
		}
		
		head.setNext(null);
	}
}
