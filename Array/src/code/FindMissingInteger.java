package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Find missing number from an array of 1.... 100

// If array is sorted - > find compare adjancent elements to see if they differ by 1

// If array not sorted -> find sum of all the numbers in array and subtract it from N*(N+1) /2 that is sum of this range 1...N
// toh difference se mil jayga number.

// If array unsorted and duplicates present? 
// use 0 based array as hashtable, and mark numbers in the given array as 1 in that range
// numbers with 0 in hashtable are never seen so answer.

public class FindMissingInteger {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String[] inputString = br.readLine().split(" ");
		
		int[] input = new int[inputString.length];
		
		int range = 10;
		int[] hashtable = new int[range+1];
		
		for(int i = 0 ; i<inputString.length; i++) 
		{
			input[i] = Integer.parseInt(inputString[i]);
			hashtable[input[i]] = 1;
		}
		
		for(int i = 1; i < range; i++) {
			
			if( hashtable[i] == 0 ) {
				System.out.println(i);
			}
		}
	}
}
