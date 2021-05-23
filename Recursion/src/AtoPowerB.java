import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtoPowerB {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		
		System.out.println( printPower(a,b) );
	
	}
	
	public static int printPower(int a, int b) {
		
		if( b == 0) 
			return 1;
		
		return printPower(a,b-1)*a;
	}
}
