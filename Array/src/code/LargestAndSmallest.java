package code;

public class LargestAndSmallest {
	
	public static void main(String[] args) {
		
		int arr[] = {11,33,-1,44,6,155,99,77,8};
		
		printLargestAndSmallest(arr);
	}
	
	static void printLargestAndSmallest(int[] arr) {
		
		int smallest = arr[0], largest = arr[0];
		
		for(int i = 1; i < arr.length ; i++ ) {
			
			if( arr[i] > largest ) {
				largest = arr[i];
			} else if( arr[i] < smallest ) {
				smallest = arr[i];
			}
		}
		
		System.out.println(smallest +" "+ largest);
	}

}
