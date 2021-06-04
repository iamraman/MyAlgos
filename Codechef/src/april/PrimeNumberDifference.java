package april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberDifference {
	
	private static int[] primeArray;
	private static int n = 1000001;
	
	//store the results permanently in static field so that all the queries can be answered over it.
	static {
		primeArray = new int[n+1];
		for (int i = 0; i <= n; i++)
			primeArray[i] = 1;

		for (int p = 2; p * p <= n; p++) {
			// If prime[p] is not changed, then it is a prime
			if (primeArray[p] == 1) {
				// Update all multiples of p
				for (int i = p * p; i <= n; i += p)
					primeArray[i] = 0;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		int t = Integer.parseInt(br.readLine());
		
		while( t-- > 0 ) {
			
			String input[] = br.readLine().split(" ");
			int L = Integer.parseInt(input[0]);
			int R = Integer.parseInt(input[1]);
			
			boolean found = false;
			int max = -1, min = -1;
			
			for(int i = L; i <= R; i++ ) {
				
				if (primeArray[i] == 1) {
					if (found) 
						max = i;
					else {
						found = true;
						max = i;
						min = i;
					}
				}
			}
			
			if( found ) {
				if(min > -1)
					System.out.println(max-min);
				else
					System.out.println(0);
			}
			else
				System.out.println(-1);
		}
	}
}
