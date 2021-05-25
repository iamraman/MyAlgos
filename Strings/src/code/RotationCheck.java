package code;

// S1 - abcd, S2 - dabc
//Check if S2 is a rotation of S1

// => Do s1+s1 ( concat s1 to itself ), check if s2 is a substring of new concatenated string.
// s2.indexOf(temp) != -1 or manually check for substring ( remember linked list contains sublist problem?)


public class RotationCheck {
	public static void main(String[] args) {
		
		String s1 = "abcdef";
		String s2 = "defabc";
		
		String temp = s1.concat(s1);
		
		System.out.println(checkForRotation(temp,s2));
	}

	private static boolean checkForRotation(String bigger, String s2) {
		
		int tempI = 0, j =0;
		for(int i = 0; i < bigger.length(); i++) {
			
			tempI = i;
			for(j = 0; j < s2.length(); j++ ) {
				if( bigger.charAt(tempI) == s2.charAt(j)) {
					tempI++;
					
					if(tempI == bigger.length())
						break;
				}
				else
					break;
			}
			
			if( j == s2.length() )
				return true;
		}
		
		return false;
	}
}
