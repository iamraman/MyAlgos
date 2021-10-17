package code;

public class MaximumSubArray {
	public static void main(String[] args) {
		System.out.println( maxSubArrayON3(new int[] {-3,-2,-1,1,2,-5,-1}));
	}
	
	//Idea is, maximum subarray at ith pos will be S(i-1) + A[i] ie; maximum sum till the previous index + ith ele OR
	// A[i] - the ith element itself.
	
	//So keep a track of max value from start and at current pos, see that whether adding the current value is increasing our subarray sum
	// if it is not, cmp which is higher - sum(i-1) or A[i].
	public static int maxSubArrayONKadaneAlgorithm(int[] arr) {
		
		int maxCurrent =arr[0] , max = arr[0];
		int n = arr.length;
		
		for(int i = 1; i < n; i++ ) {
			maxCurrent = Math.max(arr[i], maxCurrent+arr[i]);
			
			max = Math.max(maxCurrent, max);
		}
		return max;
	}
	
	// pay attention to inner loop, size of subarray is increasing for same index i
	// so sum_of_all elements till i = sum of all elements till i-1 + current element at i
	//
	public static int maxSubArrayON2(int[] arr) {
		
		int ans = arr[0], maxCurr = arr[0];
		
		for(int sub_array_size = 0; sub_array_size < arr.length; sub_array_size++) {
			maxCurr = 0;
			for(int i = sub_array_size; i < arr.length; i++) {
				maxCurr += arr[i];
				ans = Math.max(ans, maxCurr);
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
				for(int j = i; j<=i+sub_array_size; j++) {
					sum+=arr[j];
					ans = Math.max(sum, ans);
				}
			}
		}
		return ans;
	}
	
}
