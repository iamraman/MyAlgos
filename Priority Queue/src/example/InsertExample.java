package example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.MaxHeap;

public class InsertExample {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		
		MaxHeap myQueue = new MaxHeap(n);
		
		for(int i=0; i < n ; i++) {
			
			myQueue.insert(Integer.parseInt(input[i]));
		}
		
		System.out.println(myQueue);
	}
}
