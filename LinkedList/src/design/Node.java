package design;

public class Node<Type> {
	
	private Type item;
	private Node next;
	
	public Node( Type item, Node next) {
		this.item = item;
		this.next = next;
	}

	public Type getItem() {
		return item;
	}

	public void setItem(Type item) {
		this.item = item;
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
		return String.valueOf(item);
	}
	
}
