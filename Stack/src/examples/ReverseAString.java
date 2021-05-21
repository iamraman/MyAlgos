package examples;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.Stack;

public class ReverseAString {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String source = br.readLine();
		
		Stack stack = new Stack();
		
		char[] alphabets = source.toCharArray();
		
		for(int i = 0; i<alphabets.length; i++ ) {
			
			stack.push(Character.valueOf(alphabets[i]));
		}
		
		Character ch = (Character) stack.pop();
		
		while( ch != null ) {
			System.out.print(ch);
			ch = (Character) stack.pop();
		}
	}
}
