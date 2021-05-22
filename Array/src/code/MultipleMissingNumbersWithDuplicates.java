package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


// if range of numbers is 1 - 1000, use a array[1001] = {0} as hash
// iterate thorough given numbers and mark seen numbers = 1
// numbers with 0 will be the answer.

// If collection is allowed -> use HashMap that is better.
public class MultipleMissingNumbersWithDuplicates {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String[] input = br.readLine().split(" ");
		
		ArrayList<Integer> myArray = new ArrayList<Integer>();
		
		for(String current : input) {
			myArray.add(Integer.valueOf(current));
		}
		
		int[] hashtable = new int[1001];
		
		for(Integer x : myArray) {
			hashtable[x] = 1;
		}
		
		for(int i = 1; i<11; i++) {
			if(hashtable[i] == 0) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
}
