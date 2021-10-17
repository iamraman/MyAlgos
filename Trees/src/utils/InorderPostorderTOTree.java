package utils;

import java.util.HashMap;

//Given inorder and postOrder of a tree
//construct a tree from it

//Solution
//Post order mean => Root Left Right
// so first element will give us the root, keep a ptr for postOrder array and keep incrementing it to find new root

//Inorder means => Left ROOT Right
//so from previous step we know the root, now search for this root in inorder array
//all elements from left of this root will be Left Tree
//all element from right of this root will be on the right side of this root

public class InorderPostorderTOTree {
	
	HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    int preIdx = 0;
    
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i = 0; i < inorder.length; i++)						//store node => index mapping in a hashmap to search a particular node's index
          map.put(inorder[i],i);									// in the inorder array in constant time
        
        return buildTree(preorder,0,preorder.length-1);
    }
    
    public TreeNode buildTree(int[] preorder, int left, int right) {
      if(left > right)
        return null;
      
      int ele = preorder[preIdx++];									//get the current element from postorder array
      int inIdx = map.get(ele);										//get the inorder index
      
      TreeNode root = new TreeNode(ele);							//make new root from this info
      
      root.left = buildTree(preorder,left,inIdx-1);					// assign root.left = all elements to the left of inorder index
      root.right = buildTree(preorder,inIdx+1,right);				//assign root.right = all elements to the right inorder index
      
      return root;
    }
}

