package code;

public class ReverseStringRecursion {
	
	public static void main(String[] args) {
		
		String arg = "zyx";
		
		System.out.println(reverseIt(arg));
	}
	
	static String reverseIt(String arg) {
		
		if( arg.length() == 1) {
			
			return arg;
		}
		
		return reverseIt(arg.substring(1)) + arg.charAt(0);
	}

}
