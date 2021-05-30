
// Divide and Conquer implementation.

// Divide array in sets of two, finally merge them
// Copy main array into aux array, traverse left and right simultaneously
// keep adding smaller values to sorted array.

public class MergeSort {
	
	public static void main(String[] args) {
		
		int arr[] = {14,1,44,2,6,87,54,23};
		
		sort(arr, 0, arr.length-1);
		
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
	}
	
	static void sort(int[] arr, int low, int high) {
		
		if( low >= high )
			return;
		
		int mid = low + (high - low) / 2;

		sort(arr, low, mid);
		sort(arr, mid + 1, high);

		merge(arr, low, mid, high);
	}
	
	// View the array like this:
	
	//low,i		    mid   j         hi
	//  2    4   2   1    3  2   5  6
	static void merge(int[] arr, int low, int mid, int high) {
		
		int aux[] = arr.clone();
		
		int i = low, j = mid+1;
		
		for(int k = low; k <= high; k++) {
			
			if( i > mid)							//copy all elements from right into sorted array
				arr[k] = aux[j++];
			else if( j > high)						//copy all elements from left into sorted array
				arr[k] = aux[i++];
			else if ( aux[i] < aux[j] )				// copy from left array
				arr[k] = aux[i++];
			else
				arr[k] = aux[j++];					//copy from right.
		}
	}
}
