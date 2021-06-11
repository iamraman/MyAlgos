package example;

import design.Node;
import design.RedBlackTree;

//        4
//   2        7
//1     3   5

public class LLRBTExample {
	public static void main(String[] args) {
		
		int[] arr = {2,1,4,3,5,7};
		
		RedBlackTree tree = new RedBlackTree();
		
		for(int item : arr) {
			tree.insert(tree.root, item);
		}
		
		tree.inorderTraversal(tree.root); System.out.println();
		System.out.println(findSuccessor(tree.root));
	}
	
	public static Node findSuccessor(Node king) {
		if( null == king || null == king.right ) {
			return null;
		}
		
		return giveMeMySuccessor(king.right);
	}
	
	private static Node giveMeMySuccessor(Node prince) {
		if(prince.left == null)
			return prince;
		
		return giveMeMySuccessor(prince.left);
	}
	
}
