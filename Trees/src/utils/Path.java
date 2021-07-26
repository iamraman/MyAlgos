package utils;

import java.util.ArrayList;

public class Path {
	private static boolean found = false;

	public static void main(String[] args) {
		TreeNode root = Common.getRoot();

		ArrayList<TreeNode> pathOne = getPath(root, 4, new ArrayList<TreeNode>());

		for (TreeNode curr : pathOne)
			System.out.print(curr.val + " ");
	}
	static ArrayList<TreeNode> getPath(TreeNode current, int target, ArrayList<TreeNode> path){
	      if(null == current)
	          return path;
	        
	        path.add(current);
	        if(current.val == target){
	          found = true;
	          return path;
	        }
	        
	        if(null != current.left)
	          path = getPath(current.left,target,path);
	        
	        if( ! found && null != current.right ){
	          path.remove(path.size()-1);
	          path = getPath(current.right,target,path);
	          
	          if(!found)
	            path.remove(path.size()-1);
	        }
	        
	        return path;
	      }
}
