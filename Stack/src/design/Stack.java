package design;

// For array implementation - Keep adding element to grow the stack to the right ->
// Push at arr[ N ]
// Pop from arr[ N-1 ]

public class Stack<Type> {										// Why use <Type> generic? 
																// someone can do : stack.push(Orange) stack.push(Apple) then
	Node oldFirst;											    // Orange obj = (Orange) stack.pop() 		//ClassCast exception.

	public boolean isEmpty() {
		return null == oldFirst;
	}

	public void push(Type value) {

		Node newNode = new Node(value, null);

		newNode.setNext(oldFirst);

		oldFirst = newNode;
	}

	public Type pop() {

		if (!isEmpty()) {

			Type retValue = (Type) oldFirst.getWord();
			oldFirst = oldFirst.getNext();

			return retValue;
		}

		return null;
	}
	
	public void display() {
		
		Node tempNode = oldFirst;
		
		while( tempNode != null ) {
			System.out.print(tempNode.getWord()+" ");
			tempNode = tempNode.getNext();
		}
	}
}
