package design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Digraph {
	final int V;
	HashMap<Integer,ArrayList<Integer>> mapping;
	boolean marked[];
	int[] edgeTo;
	int[] distance;
	boolean[] onStack;									//to detect cycles
	Stack<Integer> myStack;
	public Digraph(int v){
		this.V = v;
		mapping = new HashMap<Integer,ArrayList<Integer>>();
		marked = new boolean[V];
		distance = new int[V];
		onStack= new boolean[V];
		myStack = new Stack<Integer>();
		edgeTo = new int[V];
		Arrays.fill(edgeTo, -1);
	}
	public void topologicalSort(int parentVertex) {
		for(int i = 0; i<marked.length;i++) {
			if(!marked[i])
				topoSort(i);
		}
		
		int size = myStack.size();
		
		for(int i = 0 ; i<size; i++)
			System.out.print(myStack.pop()+" ");
	}
	private void topoSort(int parentVertex) {
		marked[parentVertex] = true;
		ArrayList<Integer> children = mapping.get(parentVertex);
		for(int nextVertex : safe(children)) {
			if(!marked[nextVertex]) {
				topoSort(nextVertex);
			}
		}
		myStack.push(parentVertex);
	}
	public void dfs(int parentVertex) {
		marked[parentVertex] = true;
		onStack[parentVertex] = true;
		System.out.print(parentVertex+"->");
		ArrayList<Integer> children = mapping.get(parentVertex);
		for(int nextVertex : safe(children)) {
			if(!marked[nextVertex]) {
				dfs(nextVertex);
			}
			else if(onStack[nextVertex]) {
				System.out.println("Cycle detected!!");
				break;
			}
		}
	}
	
	public void printPath(int dest) {
		if(dest == -1)
			return;
		printPath(edgeTo[dest]);
		System.out.print(dest+" ");
	}
	public void bfs(int vertex) {
		Queue<Integer> myQueue = new LinkedList<Integer>();
		int dist = 0;
		marked[vertex] = true;
		
		myQueue.add(vertex);
		
		while(! myQueue.isEmpty()) {
			int currVertex = myQueue.remove();
			dist++;															//increment distance as we're going to the next level everytime we remove from queue.
			ArrayList<Integer> connected = this.mapping.get(currVertex);
			for(int nextVertex : safe(connected)) {
				
				if(!marked[nextVertex]) {
					
					distance[nextVertex] = dist;
					edgeTo[nextVertex] = currVertex;
					myQueue.add(nextVertex);
				}
			}
		}
	}
	
	private List<Integer> safe(ArrayList<Integer> arg){
		return null == arg ? Collections.EMPTY_LIST : arg;
	}
	public Digraph addEdge(int u, int w) {
		ArrayList<Integer> neighbours = mapping.get(u);
		
		if(null != neighbours) {
			neighbours.add(w);
		}else {
			neighbours = new ArrayList<Integer>();
			neighbours.add(w);
			mapping.put(u, neighbours);
		}
		
		return this;
	}
	
	public int pathTo(int v) {
		return this.distance[v];
	}
	
	public void reset() {
		Arrays.fill(distance, 0);
		Arrays.fill(marked, false);
	}

}
