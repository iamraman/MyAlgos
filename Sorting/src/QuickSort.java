import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = {4,2,15,6,3,2,5,7,5,44,32,1,23};
		
		quickSort(arr,0,arr.length-1);
		
		for(int ele: arr) {
			System.out.println(ele+" ");
		}
	}
	
	static void quickSort(int[] arr, int low, int high) {
		
		if( low < high ) {
			
		}
	}

	

	static int getPivot(int low, int high) {
		
		Random rand = new Random();
		int pivot = rand.nextInt(high-low) + low;
		
		return pivot;
	}
	
	static void exchange(int one, int two, int[] arr) {
		
		arr[one] = arr[one] + arr[two];
		arr[two] = arr[one] - arr[two];
		arr[one] = arr[one] - arr[two];
		
	}
}
