package spanning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

import weight.Edge;
import weight.EdgeWeightedGraph;

//Prim's Algorithm
//Start with one vertex, say 0
//Greedily add edges to MS tree that has only one edge in the MST ( so that no cycle is there ) and has minimun weight ( e.g 0-6, 0-5, 0-2)

//( goal is to select the minimum everytime, so..
//we can also search for minimum everytime = O(n) operation and we do it for all V vertices, complexity will be - V*N ~ O(N2)
//so to improve it and make it O(NLogN), we will use min heap so as to find min in log N time.


// maintain a PQ (minPQ) to identify next edge that'll be added to MST 
// after every addition, put all the vertices connected to the vertex that just got added ( if 1 was added, add 1-4, 1-5, 1-3 to MinPQ)
// if the current edge retrieved from MinPQ has both it's ends marked, ignore it ( cz it'll create cycle).

public class MST {
	
	private boolean marked[];
	PriorityQueue<Edge> minPQ = new PriorityQueue<>();
	List<Edge> spanningTree;
	public MST(EdgeWeightedGraph gh) {
		marked = new boolean[gh.V()];
		minPQ = new PriorityQueue<Edge>();
		spanningTree = new ArrayList<Edge>();
		
		buildMST(gh);
	}
	
	private void buildMST(EdgeWeightedGraph gh) {
		
		visit(gh, 0);
		while( ! minPQ.isEmpty()) {
			
			Edge currEdge = minPQ.remove();
			int u = currEdge.either();
			int v = currEdge.other(u);
			
			if(marked[u] && marked[v]) continue;
			
			visit(gh, u);

			visit(gh, v);

			spanningTree.add(currEdge);
		}
	}
	
	public List<Edge> edges() {
		return spanningTree;
	}
	
	private void visit(EdgeWeightedGraph gh, int v) {

		marked[v] = true;
		
		for(Edge e : safe(gh.mapping.get(v))) {
			if(! marked[e.other(v)]) {
				minPQ.add(e);
			}
		}
	}
	
	private List<Edge> safe(List<Edge> arg){
		return null == arg ? Collections.EMPTY_LIST : arg;
	}
}
