import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		
		int arr[] = {4,2,15,6,3,2,5,7,5,44,32,1,23};
		
		sort(arr,0,arr.length-1);
		
		for(int ele: arr) {
			System.out.print(ele+" ");
		}
	}

	static void sort(int[] arr, int low, int high) {
		
		if (low < high) {
			int pivot = arr[getPivot(low, high)];
			int lt = low;
			int gt = high;

			int i = low;

			while (i <= gt) {

				if (arr[i] < pivot) {
					exchange(i, lt, arr);
					i++;
					lt++;
				}

				else if (arr[i] > pivot) {
					exchange(i, gt, arr);
					gt--;
				} else
					i++;
			}

			sort(arr, low, lt - 1);
			sort(arr, gt + 1, high);
		}
	}

	static int getPivot(int low, int high) {
		
		Random rand = new Random();
		int pivot = rand.nextInt(high-low)+low;
		
		return pivot;
	}
	
	static void exchange(int one, int two, int[] arr) {
		
		if(one == two)
			return;
		
		arr[one] = arr[one] + arr[two];
		arr[two] = arr[one] - arr[two];
		arr[one] = arr[one] - arr[two];
		
	}
}
