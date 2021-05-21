package code;

import java.util.regex.Pattern;

public class StringContainsOnlyDigits {
	
	public static void main(String[] args) {
		
		String source1 = "abcd123";
		String source2 = "12345";
		String source3 = "123.45";
		
		checkDigitsUsingAscii(source1);
		checkDigitsUsingAscii(source2);
		checkDigitsUsingAscii(source3);
		System.out.println();
		checkDigitsUsingRegularExpression(source1);
		checkDigitsUsingRegularExpression(source2);
		checkDigitsUsingRegularExpression(source3);
	}
	
	// Loop over the string and match the integer range 0...9 ( 48 - 57 )
	static void checkDigitsUsingAscii(String arg) {
		
		char[] sourceArray = arg.toCharArray();
		boolean isGoodString = true;
		
		for(char current: sourceArray) {
			
			if(current < 48 || current > 57 ) {
				System.out.println("Bad String!! ");
				return;
			}
		}
		
		System.out.println("Good String!");
	}
	
	// Use regular expression to find out the string
	//regular expression for all digits - \d
	//for non-digit - \D
	
	static void checkDigitsUsingRegularExpression(String arg) {
		
		Pattern pattern = Pattern.compile(".*\\D.*");
		
		System.out.println( pattern.matcher(arg).matches() ? "Bad String" : "Good String");
		
	}
}
