import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibonacci {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.valueOf(br.readLine());
		
		System.out.println( printFibonacci(n));
	}
	
	public static int printFibonacci(int n) {
		
		if( n == 1 || n == 2 ) 
			return 1;
		
		return printFibonacci(n-1)+printFibonacci(n-2);
	}
}
