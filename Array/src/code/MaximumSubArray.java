package code;

public class MaximumSubArray {
	public static void main(String[] args) {
		System.out.println( maxSubArrayONKadaneAlgorithm(new int[] {-3,-2,-1,-5,-1}));
	}
	
	//Idea is, maximum subarray at ith pos will be S(i-1) + A[i] ie; maximum sum till the previous index + ith ele OR
	// A[i] - the ith element itself.
	
	//So keep a track of max value from start and at current pos, see that whether adding the current value is increasing our subarray sum
	// if it is not, cmp which is higher - sum(i-1) or A[i].
	public static int maxSubArrayONKadaneAlgorithm(int[] arr) {
		
		int maxCurrent = 0, max = Integer.MIN_VALUE;
		int n = arr.length;
		
		for(int i = 0; i < n; i++ ) {
			maxCurrent = Math.max(arr[i], maxCurrent+arr[i]);
			
			max = Math.max(maxCurrent, max);
		}
		return max;
	}
	
	// pay attention to inner loop, size of subarray is increasing for same index i
	// so sum_of_all elements till i = sum of all elements till i-1 + current element at i
	//
	public static int maxSubArrayON2(int[] arr) {
		int ans = 0;
		int n = arr.length;
		
		for(int i = 0 ; i<n; i++) {
			int sum = 0;
			for(int size_of_subarray = 0; i+size_of_subarray < n; size_of_subarray++) {
				
				sum += arr[i+size_of_subarray];
				ans = Math.max(sum, ans);
			}
		}
		
		return ans;
	}
	public static int maxSubArrayON3(int[] arr) {
		int ans = 0;
		int n = arr.length;
		
		for(int sub_array_size = 0; sub_array_size < n; sub_array_size++) {
			for(int i = 0; i+sub_array_size < n; i++) {
				int sum = 0;
				for(int j = i; j<=sub_array_size; j++) {
					sum+=arr[j];
					ans = Math.max(sum, ans);
				}
			}
		}
		return ans;
	}
	
}
