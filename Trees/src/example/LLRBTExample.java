package example;

import design.RedBlackTree;

public class LLRBTExample {
	public static void main(String[] args) {
		
		int[] arr = {2,1,4,3,5,7};
		
		RedBlackTree tree = new RedBlackTree();
		
		for(int item : arr) {
			tree.insert(tree.root, item);
		}
		
		tree.inorderTraversal(tree.root);
	}
}
