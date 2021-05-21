package code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Permutation {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String source = br.readLine();
		
		Utility.printPermutation(source);
	}
}

class Utility {
	
	public static void printPermutation( String source ) {
		permute("", source);
	}
	
	private static void permute( String seenAlready, String possible ) {
		
		if( possible.length() == 0 ) {
			System.out.println( seenAlready );
		}
		
		for(int i = 0; i < possible.length(); i++) {
			permute( seenAlready + possible.charAt(i), possible.substring(0,i)+possible.substring(i+1, possible.length()));
		}
	}
}
