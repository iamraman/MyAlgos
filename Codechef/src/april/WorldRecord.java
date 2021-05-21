package april;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WorldRecord {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int t = Integer.parseInt(br.readLine());
		
		while( t-- > 0) {
			
			double k1,k2,k3,v;
			
			String[] input = br.readLine().split(" ");

			k1 = Double.valueOf(input[0]);
			k2 = Double.valueOf(input[1]);
			k3 = Double.valueOf(input[2]);
			v = Double.valueOf(input[3]);
			
			double speed = 100 / ( k1*k2*k3*v);
			
			double finalSpeed = Math.round(speed * 100.0) / 100.0;
			
			System.out.println( finalSpeed < 9.58 ? "YES" : "NO");
		}
		 
	}
}