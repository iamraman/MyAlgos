package example;

public class IdenticalCheck {
	public boolean isIdentical(TreeNode root1, TreeNode root2) {
		if(root1 == null || root2 == null)
			return root1 == root2;
		return root1.val == root2.val && isIdentical(root1.left,root2.left) && isIdentical(root1.right,root2.right);
	}
}
