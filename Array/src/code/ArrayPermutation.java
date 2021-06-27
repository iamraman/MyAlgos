package code;

import java.util.ArrayList;
import java.util.List;

public class ArrayPermutation {

	public static void main(String[] args) {
		System.out.println(new Solution().permute(new int[]{0,1,2,3,4,5}));
	}
}
class Solution {
	List<List<Integer>> answer = new ArrayList();
	int total = 0;
    public List<List<Integer>> permute(int[] nums) {
      answer.clear();
      
      permute(new ArrayList(), nums);
      System.out.println(total);
      return answer;  
    }
    
    public void permute(ArrayList<Integer> prefix, int[] remaining) {
    	if(remaining.length == 1) {
    		prefix.add(remaining[0]);
    		answer.add(prefix);
    		total++;
    		return;
    	}
    	
    	for(int i = 0; i < remaining.length; i++) {
    		ArrayList newPrefix = getClone(prefix);
    		newPrefix.add(remaining[i]);
    		
    		permute(newPrefix, getArray(0, i-1, i+1, remaining.length, remaining) );
    	}
    }
    
    public ArrayList<Integer> getClone(ArrayList<Integer> source){
    	return (ArrayList<Integer>) source.clone();
    }
    
    public int[] getArray(int left, int leftHi, int right, int rightHi, int[] source) {
    	int[] result = new int[rightHi-1];
    	
    	int i = 0;
    	
    	int l = left;
    	int r = right;
    	
    	while(l <= leftHi)
    		result[i++] = source[l++];
    	
    	while(r <= rightHi-1)
    		result[i++] = source[r++];
    	
    	return result;
    }
}