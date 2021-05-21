package code;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {

		String source = "HelloHe";

		checkNonRepeatingCharacter(source);
	}

	// Insert the count of each character of string in linkedHashmap ( so that same
	// order is retained )
	// Iterate the hashmap to find the character whose value is 1, and break ( it
	// will be the first character in string.

	static void checkNonRepeatingCharacter(String source) {
		LinkedHashMap<Character, Integer> stringInfo = new LinkedHashMap<>();

		char[] sourceArray = source.toCharArray();
		Integer currValue = 0;

		for (char current : sourceArray) {

			currValue = stringInfo.get(current);

			if (null == currValue) {
				currValue = 0;
			}
			stringInfo.put(current, currValue + 1);
		}

		for (Map.Entry<Character, Integer> currentEntry : stringInfo.entrySet()) {

			if (currentEntry.getValue() == 1) {
				System.out.println("First non repeating character is: " + currentEntry.getKey());
				break;
			}
		}
	}
}