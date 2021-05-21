package april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StrongLanguage {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int t = Integer.parseInt(br.readLine());
		
		while( t-- > 0 ) {
			
			String[] input = br.readLine().split(" ");
			
			int n = Integer.parseInt(input[0]);
			int k = Integer.parseInt(input[1]);
			
			String s = br.readLine();
			
			char[] word = s.toCharArray();
			boolean isStrongWord = false;
			int currCount = 0;
			
			for(int i = 0; i<n; i++ ) {
				
				
				if( word[i] == '*') {
					currCount++;
					
					if(currCount == k ) {
						isStrongWord = true;
						break;
					}
				} else {
					currCount = 0;
				}
			}
			
			System.out.println( isStrongWord ? "YES" : "NO" );
		}
	}
}
