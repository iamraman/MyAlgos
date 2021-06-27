package example;

// Lowest Common Ancestor = Node for which height of left or right subtree is maximum.
// if two subtrees have same height, then the parent node is the LCA


// E.g :

// [3,5,1,6,2,0,8,null,null,7,4]    => LCA = 2
// [3,5,1,6,2,0,8,null,null,7,4,9]  => LCA = root


//Approach -> Recursively check left subtree and right subtree and return their height
// if height l > r -> return node Left
// if height r > l -> return node right
// else return currentNode but with height of its children, since this height will be used at the parent level comparison.
public class LowestCommonAncestorofDeepestLeaves {
	public static void main(String[] args) {
		
	}
}


class Solution {
    public TreeNode lcaDeepestLeaves(TreeNode root) {
      MyNode answer = maxDepth(root,0);
      
      return answer.node;
    }
    
    MyNode maxDepth(TreeNode currentNode, int height){
      if(null == currentNode)
        return null;
      
      MyNode left = maxDepth(currentNode.left, height+1);
      MyNode right = maxDepth(currentNode.right,height+1);
      
      if(null == left && null == right)
        return new MyNode(currentNode,height);
      
      if(null == left || null == right){
        return null == left ? right : left;
      }
      
      if( left.height > right.height )
        return left;
      else if(right.height > left.height)
        return right;
      else
        return new MyNode(currentNode,left.height);
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

class MyNode{
  TreeNode node;
  int height;
  
  public MyNode(TreeNode node, int ht){
    this.node = node;
    height = ht;
  }
}