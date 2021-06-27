package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import design.Digraph;

public class DiGraphExample {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int v = Integer.parseInt(br.readLine());
		
		Digraph graph = new Digraph(v);
		
		graph.addEdge(1,0)
			 .addEdge(0,5)
			 .addEdge(5,4)
			 .addEdge(4,3)
			 .addEdge(3,2);
		
		graph.bfs(0);
		graph.printPath(2);
//		System.out.println(graph.pathTo(5));
//		graph.topologicalSort(0);
	}
	
	
}
