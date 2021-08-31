package shortestpath;

import java.util.Arrays;
import java.util.HashSet;
import java.util.PriorityQueue;

import shortestpath.design.Edge;
import shortestpath.design.EdgeWeightedGraph;
import shortestpath.design.HeapNode;

public class ShortestPathBuilder {
	
	EdgeWeightedGraph gh;
	HashSet<Integer> settled;
	PriorityQueue<HeapNode> myPriority;
	int[] distance;
	
	public ShortestPathBuilder(EdgeWeightedGraph gh) {
		this.gh = gh;
		distance = new int[gh.V];
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		settled = new HashSet<Integer>();
		myPriority = new PriorityQueue<HeapNode>();
		
		computeShortestPath(0);
	}
	
	private void computeShortestPath(int sourceVertex) {
		
		myPriority.add(new HeapNode(0,0));
		distance[0] = 0;
		
		while(! myPriority.isEmpty()) {
			
			HeapNode current = myPriority.remove();
			
			if(! settled.contains(current.vertex) ) {
				settled.add(current.vertex);				//add this vertex to final list because it's the current minimum from min heap
				addMinimunNeighbours(current.vertex);
			}
		}
	}
	
	private void addMinimunNeighbours(int source) {
		
		for(Edge currEdge : gh.adj(source)) {
			
			int w = currEdge.to();
			
			if(distance[source] + currEdge.w < distance[w]) {
				
				distance[w] = distance[source] + currEdge.w;
				
				if(settled.contains(w)) 
					myPriority.removeIf(heapNode -> heapNode.vertex == w);				//removing will ensure decrease key on next line
				
				myPriority.add(new HeapNode(w,distance[w]));						//will be invoked even if vertex wasn't visited earlier
			}	
		}
	}
	
}
