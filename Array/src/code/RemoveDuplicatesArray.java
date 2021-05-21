package code;

import java.util.Arrays;

public class RemoveDuplicatesArray {
	
	public static void main(String[] args) {
		
		int arr[] = {3,3,2,1};
		
		int[] result = removeDuplicates(arr);
		
		for(int i = 0 ; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	static int[] removeDuplicates(int[] sourceArray) {
		
		Arrays.sort(sourceArray);							//1,2,3,3,4,4,4,6,6,7,8
		
		int[] result = new int[sourceArray.length];
		int resultIndex = 0;
		result[resultIndex] = sourceArray[0];
		
		for( int i = 1; i<sourceArray.length; i++ ) {
			
			if( sourceArray[i] != result[resultIndex] ) {
				result[++resultIndex] = sourceArray[i];
			}
		}
		
		return result;
	}
}