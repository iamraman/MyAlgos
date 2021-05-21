package code;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String source = "naman";
		
		if( source.equals( reverseString(source)) ) {
			System.out.println("Palindrome!");
		} 
		else {
			System.out.println("Not a Palindrome!!");
		}
		
	}
	
	private static String reverseString(String arg) {
		
		if( arg.length() == 1 ) {
			return arg;
		}
		
		return arg.charAt(arg.length()-1) + reverseString(arg.substring(0, arg.length()-1));
	}

}
