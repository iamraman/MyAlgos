package code;

public class Palindrome {
	
	public static void main(String[] args) {
		
		String source = "raman";
		
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
		
		return reverseString(arg.substring(1))+arg.charAt(0);
	}

}
