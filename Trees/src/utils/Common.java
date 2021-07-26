package utils;

public class Common {
	public static TreeNode getRoot() {
		TreeNode root = new TreeNode(1);
		
		root.left = new TreeNode(2);
		root.right = new TreeNode(2);
		
		root.left.left = new TreeNode(3);
		root.right.right = new TreeNode(3);
		
		root.left.left.left = new TreeNode(4);
		root.right.right.right = new TreeNode(4);
		
		return root;
	}
}
