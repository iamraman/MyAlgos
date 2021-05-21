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
		
		return arg.charAt(arg.length()-1) + reverseIt( arg.substring(0,arg.length()-1) );
	}

}
