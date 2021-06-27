package examples;

import java.io.*;
import java.util.*;

public class PrintAllPaths {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input[] = br.readLine().split(" ");
		
		int n = Integer.parseInt(input[0]);
		int edges = Integer.parseInt(input[1]);
		
		Graph myGraph = new Graph(n);
		
		for(int i = 1; i <= edges; i++) {
			input = br.readLine().split(" ");
			myGraph.addEdge(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}
		
		List<Integer> sourceList = new ArrayList<Integer>();
		sourceList.add(1);
		myGraph.dfs(1, n, sourceList);
		
		System.out.println(myGraph);
	}
}

class Graph {
	int V;
	HashMap<Integer,ArrayList<Integer>> mapping;
	
	boolean[] marked;
	List<List<Integer>> allPaths;
	
	public Graph(int nodes) {
		this.V = nodes;
		marked = new boolean[V+1];
		allPaths = new ArrayList();
		mapping = new HashMap<Integer,ArrayList<Integer>>();
	}
	
	public void dfs(int current, int target, List<Integer> currentPath) {
		marked[current] = true;
		
		if(target == current) {
			allPaths.add(new ArrayList<Integer>(currentPath));
			return;
		}
		
		List<Integer> currList = this.mapping.get(current);
		for(int nextNode : safe(currList)) {
			if(!marked[nextNode]) {
				currentPath.add(nextNode);
				dfs(nextNode,target,currentPath);
				currentPath.remove(currentPath.size()-1);
				marked[nextNode] = false;
			}
		}
	}
	
	public void addEdge(int u, int v) {

		if(! this.mapping.containsKey(u)) {
			this.mapping.put(u, new ArrayList<Integer>());
		}
		if(! this.mapping.containsKey(v)) {
			this.mapping.put(v, new ArrayList<Integer>());
		}
		
		this.mapping.get(u).add(v);
		this.mapping.get(v).add(u);
	}
	
	private List<Integer> safe(List<Integer> arg){
		return null == arg ? Collections.EMPTY_LIST : arg;
	}
}