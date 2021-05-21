package code;

import java.util.Arrays;

public class RemoveDuplicates {
	
	public static void main(String[] args) {
		
		String badString = "Ramannn";
		
		char[] result = removeDuplicates( badString.toCharArray());
		
		System.out.println( new String(result) );
	}
	
	static char[] removeDuplicates( char[] dirtyArray ) {
		
		Arrays.sort(dirtyArray);							//aamnnnR
		
		int previous = 0;
		int finalLength = 1;
		
		for(int i = 1; i < dirtyArray.length ; i++ ) {
			
			if( dirtyArray[previous] != dirtyArray[i] ) {
				dirtyArray[++previous] = dirtyArray[i];
				finalLength++;
			}
		}
		return Arrays.copyOf(dirtyArray, finalLength);
	}
}
