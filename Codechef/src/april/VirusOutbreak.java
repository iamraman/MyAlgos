package april;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class VirusOutbreak {
	
	public static void main(String[] args) throws IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String virus = br.readLine();
		
		int n = Integer.parseInt(br.readLine());
		
		String blood = "";
		for(int i = 1; i <=n ; i++) {
			blood = br.readLine();
			System.out.println( isSubsequence(virus, blood) ? "POSITIVE" : "NEGATIVE"  );
		}
	}
	
	private static boolean isSubsequence(String virus, String blood) {
		
		int virusLength = virus.length();
		int bloodLength = blood.length();
		
		if(virusLength < bloodLength)
			return false;
		
		int bloodIndex = 0;
		int virusIndex = 0;
		
		while( virusIndex < virusLength) {
			
			if( virus.charAt(virusIndex) == blood.charAt(bloodIndex) ) {
				++bloodIndex;
			}
			
			if(bloodIndex == bloodLength)
				return true;
			virusIndex++;
		}
		return false;
	}

}
