package example;

public class MirrorCheck {
	public boolean isSymmetric(TreeNode root) {
	      if(null == root)
	        return true;
	      
	      return checkMirror(root.left, root.right);
	    }
	  
	    public boolean checkMirror(TreeNode left, TreeNode right){
	      if(null == left || null == right)
	        return left == right;
	      
	      return left.val == right.val && checkMirror(left.left,right.right) && checkMirror(left.right,right.left);
	    }
	    
}
