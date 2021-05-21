package easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Add all non negative integers upto N

public class RecursionAddBasic {
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.valueOf(br.readLine());
		
		System.out.println( addNumbers(n));
	}
	
	public static int addNumbers(int n) {
		
		if( n == 1 )
			return n;
		
		return n + addNumbers(n-1);
	}
}
;