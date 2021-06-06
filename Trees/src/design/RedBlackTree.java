package design;


// LLRB Tree properties that shouldn't be violated:
// 1) No red node on right side.
// 2) No two consecutive red nodes on left side.
// 3) Number of black nodes on all the paths from root->leaf nodes should be equal

// Above conditions will result in a perfectly balanced search tree and hence are better for searching/inserting.

// Imp :
//		new node inserted into the tree will always be colored red.
//		While rotating left, x ( root coming up ) will always have same color as h ( root going down) and h will always be red.
//		vice versa for rotating right
public class RedBlackTree {
	
	public Node root;
	
	public Node insert(Node current, int value) {
		
		if(current == null) {
			Node newNode = new Node(value,Node.RED);
			if( root == null ) {
				root = newNode;
				root.color = false;	
			}
			return newNode;
		}
		
		if( value < current.key ) {
			current.left = insert(current.left,value);
		} else if( value > current.key ) {
			current.right = insert(current.right,value);
		} else {
			current.key = value;
			return current;
		}
		
		if( isRed(current.right) && !isRed(current.left))  				//Right is red, left is not => rotate left
			current = rotateLeft(current);
		
		if( isRed(current.left) && isRed(current.left.left))			//Right is red, left is red, => rotate right
			current = rotateRight(current);
		
		if( isRed(current.left) && isRed(current.right) )				// Both left and right are red => split color
			splitColor(current);
		
		return current;
	}
	
	public Node search(int item, Node current) {
		if( null == current)
			return null;
		
		if( current.key < item)
			return search(item, current.left);
		else if(current.key > item)
			return search(item, current.right);
		else
			return current;
	}
	
	
	
	public Node rotateLeft(Node h) {
		
		Node x = h.right;
		
		if( root == h ) {
			root = x;
		}
		
		h.right = x.left;
		
		x.left = h;
		
		x.color = h.color;					//put the right node color as the same as the parent cz it will replace it
		h.color = Node.RED;					// paint the (now) left side of the node as red;
		
		return x;
	}
	
	public Node rotateRight(Node h) {
		
		Node x = h.left;
		
		if( root == h ) {
			root = x;
		}
		
		h.left = x.right;
		x.right = h;
		x.color = h.color;
		h.color = Node.RED;
		
		return x;
	}
	
	public Node splitColor(Node h) {
		h.left.color = Node.BLACK;
		h.right.color = Node.BLACK;
		h.color = Node.RED;
		
		return h;
	}
	
	public void preOrderTraversal(Node current) {
		if(null == current)
			return;
		System.out.print(current.key+" ");
		preOrderTraversal(current.left);
		preOrderTraversal(current.right);
	}
	
	public void inorderTraversal(Node current) {
		if(null == current)
			return;
		
		inorderTraversal(current.left);
		System.out.print(current.key+" ");
		inorderTraversal(current.right);
	}
	
	public void postOrderTraversal(Node current) {
		if(null == current)
			return;
		postOrderTraversal(current.left);
		postOrderTraversal(current.right);
		System.out.print(current.key+" ");
	}
	public boolean isRed(Node current) {
		return current != null ? current.color : false;
	}
	
	@Override
	public String toString() {
		
		inorderTraversal(root);
		return null;
	}
}
