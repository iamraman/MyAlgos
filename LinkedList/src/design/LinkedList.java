package design;

public class LinkedList<Type> {
	
	Node first;
	
	public boolean isEmpty() {
		return null == first;
	}
	
	public void insert(Type value) 
	{
		Node newNode = new Node(value,null);
		
		if( null != first) {
			
			Node tempNode = first;
			
			while( null != tempNode.getNext()) {
				tempNode = tempNode.getNext();
			}
			
			tempNode.setNext(newNode);
		} else {
			first = newNode;
		}
	}
	
	public Type delete(Type item) 
	{
		
		Node currentNode = first;
		Node prevNode = first;
		
		while( null != currentNode ) {
			if(currentNode.getItem() == item ) {
				prevNode.setNext(currentNode.getNext());
				return (Type)currentNode.getItem();
			}
			prevNode = currentNode;
			currentNode = currentNode.getNext();
		}
		return null;
	}
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder("");
		Node tempNode = first;
		
		while( null != tempNode) {
			sb.append(tempNode.getItem()+",");
			tempNode = tempNode.getNext();
		}
		return sb.toString();
	}
	
	public Node getFirst() {
		return this.first;
	}
	
	public void setFirst(Node newFirst) {
		this.first = newFirst;
	}
}
