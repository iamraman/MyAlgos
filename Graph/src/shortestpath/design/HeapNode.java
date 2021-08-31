package shortestpath.design;

import java.util.Comparator;

public class HeapNode implements Comparable<HeapNode> {
	public int vertex;
	public int weight;
	
	public HeapNode(int v, int w) {
		vertex = v;
		weight = w;
	}
	
	@Override
	public int compareTo(HeapNode o2) {
		// TODO Auto-generated method stub
		return this.weight - o2.weight;
	}
}
