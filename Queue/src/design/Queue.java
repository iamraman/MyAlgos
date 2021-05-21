package design;

public class Queue<Type> {
	
	Node oldFirst;
	Node oldLast;
	
	public boolean isEmpty() {
		
		return null == oldFirst;
	}
	
	public void enqueue(Type value) {
		
		Node newNode = new Node<Type>(value,null);
		
		if( !isEmpty() ) {
			oldLast.setNext(newNode);
			oldLast = newNode;
		}
		else {
			oldFirst = oldLast = newNode;
		}
	}
	
	public Type dequeue() {
		
		Type retValue = (Type) oldFirst.getData();
		
		oldFirst = oldFirst.getNext();
		
		return retValue;
	}
	
	public void display() {
		
		Node tempNode = oldFirst;
		
		while( tempNode != null ) {
			
			System.out.print( tempNode.getData()+" ");
			tempNode = tempNode.getNext();
		}
	}
}
