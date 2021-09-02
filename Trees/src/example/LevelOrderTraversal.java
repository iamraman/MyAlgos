package example;

import java.util.ArrayList;
import java.util.List;


// call dfs with level parameter... create an array list for this level
// add elements to arraylist = mainList.get(level) 
// 1 list for every level, SO, no. of lists = no. of levels, So check if(level == size)
// if true then add new list
public class LevelOrderTraversal {
	
	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		new Solution().levelOrder(root);
	}
}
class Solution {

	List<List<Integer>> answer = new ArrayList<List<Integer>>();

	public List<List<Integer>> levelOrder(TreeNode root) {

		if (null == root)
			return answer;
		
		computeLevelOrder(root,0,0);
    
		return answer;

	}
	
	public int computeLevelOrder(TreeNode current, int level, int size) {
		if(null == current)
			return size;
    
		if(level == size ){
      answer.add(new ArrayList<Integer>());
      size++;
    }
      
    List<Integer> currList = answer.get(level);
		currList.add(current.val);
		
		size = computeLevelOrder(current.left, level+1,size);
		size = computeLevelOrder(current.right, level+1,size);
		
    return size;
	}
}