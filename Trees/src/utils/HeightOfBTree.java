package utils;

public class HeightOfBTree {
	
	public static void main(String args[]) {
		TreeNode root = Common.getRoot();
		
		int height = getHeight(root);
		System.out.println(height);
	}
	public static int getHeight(TreeNode root) {
		if (null == root)
			return 0;

		int left = getHeight(root.left);
		int right = getHeight(root.right);

		return 1 + Math.max(left, right);
	}
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}



