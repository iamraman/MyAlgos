import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int n = Integer.valueOf(br.readLine());
		
		System.out.println( printSum(n));
	}
	
	public static int printSum(int n) {
		
		if( n == 1 ) 
			return 1;
		
		else return printSum(n-1)+n;
	}
}
