package design;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Graph {
	
	HashMap< Integer, ArrayList<Integer>  > mapping;
	final int V;
	boolean[] marked;
	int[] edgeTo;
	int[] distance;
	
	public Graph(int vertices) {
		this.V = vertices;
		mapping = new HashMap< Integer, ArrayList<Integer>>(this.V);
		marked = new boolean[V+1];
		edgeTo = new int[V+1];
		distance = new int[V+1];
	}
	
	public void dfs(int parentVertex) {
		
		marked[parentVertex] = true;
		ArrayList<Integer> currList = this.mapping.get(parentVertex);
		System.out.print(parentVertex + " ");
		for (int nextNode : currList) {
			if (!marked[nextNode]) {
				edgeTo[nextNode] = parentVertex;
				dfs(nextNode);
			}
		}
	}
	
	public void bfs(int vertex) {
		Queue<Integer> myQueue = new LinkedList<Integer>();
		marked[vertex] = true;

		int dist = 0;
		distance[vertex] = 0;
		myQueue.add(vertex);
		
		while(! myQueue.isEmpty()) {
			int currVertex = myQueue.remove();
			ArrayList<Integer> connected = this.mapping.get(currVertex);
			for(int nextVertex : safe(connected)) {
				
				if(!marked[nextVertex]) {
					
					distance[nextVertex] = distance[currVertex]+1;
					edgeTo[nextVertex] = currVertex;
					myQueue.add(nextVertex);
				}
			}
		}
	}
	
	private List<Integer> safe(ArrayList<Integer> arg){
		return null == arg ? Collections.EMPTY_LIST : arg;
	}
	public void addEdge(int u, int w) {
		if( ! this.mapping.containsKey(u)) {
			this.mapping.put(u, new ArrayList<Integer>());
		}
		if( ! this.mapping.containsKey(w)) {
			this.mapping.put(w, new ArrayList<Integer>());
		}
		
		this.mapping.get(u).add(w);
		this.mapping.get(w).add(u);
	}
	
	
	
	public int getV() {
		return this.V;
	}
	
	public int getDegree(int vertex) {
		return this.mapping.get(vertex).size();
	}
	
	
	public void printGraph() {
		
		for(Map.Entry<Integer, ArrayList<Integer>> currEntry : this.mapping.entrySet()) {
			System.out.print(currEntry.getKey()+" => ");
			for(Integer node : currEntry.getValue()) {
				System.out.print(node+" ");
			}
			System.out.println();
		}
	}
	
	public void reset() {
		Arrays.fill(edgeTo, 0);
		Arrays.fill(distance, 0);
		Arrays.fill(marked, false);
	}
}
