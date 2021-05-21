package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.Queue;

public class EnqueueDequeue {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader( System.in );
		BufferedReader br = new BufferedReader( isr );
		
		String[] input = br.readLine().split(" ");
		
		Queue myQueue = new Queue<String>();
		
		for(String current : input ) {
			
			myQueue.enqueue( current );
		}
		
		myQueue.display();
		
		
		myQueue.dequeue();
		
		myQueue.display();
		
		myQueue.enqueue("HEHE");
		
		myQueue.dequeue();
		
		myQueue.display();
	}
}
