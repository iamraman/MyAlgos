import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int arr[] = {3, 2, 1, 10, 5, 4, 11, 15, 21, 7};
		Arrays.sort(arr);
		
		System.out.println("Enter the number to be searched:");
		
		int x = Integer.valueOf(br.readLine());
		
		boolean found = binarySearch(x, arr, 0, arr.length-1);
		
		System.out.println( found == true ? "Found!" : "Not Found!");
	}
	
	static boolean binarySearch(int element, int[] arr, int lo, int hi) {

		if (lo <= hi) {
			int mid = lo + (hi - lo) / 2;

			if (element == arr[mid]) {
				return true;
			} else if (element < arr[mid]) {
				return binarySearch(element, arr, lo, mid - 1);
			} else
				return binarySearch(element, arr, mid + 1, hi);
		}
		return false;
	}
}
