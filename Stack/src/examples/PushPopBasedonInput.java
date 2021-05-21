package examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.Stack;


// Take input from the user in a line
// Add all the words from the input to a stack
// Pop when "-" is encountered.
// Display at the end.

public class PushPopBasedonInput {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String[] command = br.readLine().split(" ");
		
		//Initialize stack
		Stack stack = new Stack();
		
		for(int i = 0; i<command.length; i++ ) {
			
			if (command[i].equals("-")) {
				stack.pop();
			} else {
				stack.push(command[i]);
			}
		}
		
		stack.display();
	}
}
