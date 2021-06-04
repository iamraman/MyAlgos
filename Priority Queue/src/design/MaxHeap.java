package design;

// Max-Heap Implementation
//Convert it to min-heap with a single change, where?

public class MaxHeap {
	int[] Heap;
	int size;
	
	public MaxHeap(int n) {
		Heap = new int[n+1];
		size = 0;
	}
	
	public void insert(int item) {
		
		Heap[++size] = item;
		swim(size);
	}
	
	
	private void swim(int current ) {
		
		while( current > 1 && less( parentNode(current), current )) {
			exchange(parentNode(current), current);
			current/=2;
		}
	}
	
	private void sink(int current) {
		
		while( 2*current <= size ) {
			int j = 2*current;
			
			if( j < size && less(j,j+1)) 
				j++;
			
			if(less(current,j))
				exchange(current, j);
			
			current = j;
		}
	}

	public int removeMax() {
		int root = Heap[1];
		
		exchange(1, size--);
		
		sink(1);
		
		return root;
	}
	
	private int parentNode(int childIndex) {
		return childIndex/2;
	}
	
	private int leftChild(int parentIndex) {
		return 2*parentIndex;
	}
	
	private int rightChild(int parentIndex) {
		return 2*parentIndex+1;
	}
	
	private boolean less(int index1, int index2) {
		return Heap[index1] < Heap[index2];
	}
	
	private void exchange(int index1, int index2) {
		Heap[index1] = Heap[index1] + Heap[index2];
		Heap[index2] = Heap[index1] - Heap[index2];
		Heap[index1] = Heap[index1] - Heap[index2];
	}
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		
		for(int item: Heap) {
			sb.append(item).append(" ");
		}
		return sb.toString();
	}
}