package code;

public class ReverseWithoutRecursion {
	
	public static void main(String[] args) {
		String source = "raman";
		StringBuilder result = new StringBuilder();
		
		for(int i = 0; i < source.length(); i++ ) {
			result.append( source.charAt(source.length() - 1 - i));
		}
		
		System.out.println(result.toString());
	}
}
