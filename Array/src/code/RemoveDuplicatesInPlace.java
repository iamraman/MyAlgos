package code;

import java.util.Arrays;

public class RemoveDuplicatesInPlace {
	
	public static void main(String[] args) {
		
		int arr[] = {3,3,2,1,2,4,3,2,6,7,5,6};
		
		int[] result = removeDuplicatesInPlace(arr);
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	static int[] removeDuplicatesInPlace(int[] sourceArray) {
		
		Arrays.sort(sourceArray);							//1,2,3,4,5,6,7,4,5,6,6,7
		
		int previousIndex = 0;
		
		for( int i = 1; i<sourceArray.length; i++ ) {
			
			if( sourceArray[previousIndex] != sourceArray[i] ) {
				sourceArray[++previousIndex] = sourceArray[i];
			}
		}
		
		return sourceArray;
	}
}