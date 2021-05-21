package april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ValidPair {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String[] input = br.readLine().split(" ");
		
		boolean[] checkColor = new boolean[11];
		
		checkColor[ Integer.parseInt(input[0]) ] = true;
		
		if( checkColor[ Integer.parseInt(input[1]) ] == true ) {
			System.out.println("YES");
			return;
		}
		
		checkColor[ Integer.parseInt(input[1]) ] = true;
		
		if( checkColor[ Integer.parseInt(input[2]) ] == true ) {
			System.out.println("YES");
			return;
		}
		
		System.out.println("NO");
	}
}
