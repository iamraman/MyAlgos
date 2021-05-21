package design;

public class Node<Type>{
	
	private Type data;
	private Node next;
	
	public Node( Type data, Node next ) {
		this.data = data;
		this.next = next;
	}
	
	public Type getData() {
		return data;
	}
	public void setData(Type data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(data);
	}
}
