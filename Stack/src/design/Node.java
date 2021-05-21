package design;

public class Node {

	private Object word;
	private Node next;
	
	public Node( Object item, Node next ) {
		this.word = item;
		this.next = next;
	}
	
	public Object getWord() {
		return word;
	}
	public void setWord(Object word) {
		this.word = word;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
