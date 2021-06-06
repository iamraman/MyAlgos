package design;

public class Node {
	
	public static final boolean RED = true;
	public static final boolean BLACK = false;
	
	
	public int key;
	public Node left;
	public Node right;
	boolean color;
	
	public Node(int key, boolean color) {
		this.key = key;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return String.valueOf(key);
	}
}
