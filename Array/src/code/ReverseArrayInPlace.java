package code;

public class ReverseArrayInPlace {
	
	public static void main(String[] args) {
		
		int arr[] = {7,2,6,4};
		int length = arr.length-1;
		int limit = length/2;
		
		if(arr.length%2 == 1) {
			limit--;
		}
		
		for(int i = 0; i<=limit; i++) {
			
			arr[i] = arr[i]+arr[length-i];
			arr[length-i] = arr[i] - arr[length-i];
			arr[i] = arr[i] - arr[length-i];
		}
		
		
		for(int i = 0 ; i<= length; i++) {
			System.out.println(arr[i]);
		}
	}
}
