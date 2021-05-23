
public class InsertionSort {
	
	public static void main(String[] args) {
		
		int[] arr = {4,53,2,3,1,7,6,2};
		
		insertionSort(arr);
		
		for(int ele : arr) {
			System.out.print(ele+" ");
		}
	}
	
	static void insertionSort(int[] arr) {
		
		int length = arr.length;
		
		for(int i = 0; i < length-1; i++ ) {
			for(int j = i+1; j > 0; j-- ) {
				
				if( arr[j] > arr[j-1] ) {
					break;
				}
				//exhange when current is smaller than previous
				arr[j] = arr[j-1] + arr[j];
				arr[j-1] = arr[j] - arr[j-1];
				arr[j] = arr[j] - arr[j-1];
			}
		}
	}
}
