package examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import undirected.Graph;

public class BasicExample {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		System.out.println("Enter the number of vertices in the Graph:");
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		int v = Integer.parseInt(br.readLine());
		
		Graph myGraph = new Graph(v);
		
		System.out.println("Enter number of edges:");
		
		int e = Integer.parseInt(br.readLine());
		
		System.out.println("Input all the edges int the form u - w");
		
		int u, w;
		String[] input;
		
		for(int i = 1; i <= e; i++) {
			input = br.readLine().split(" ");
			u = Integer.parseInt(input[0]);
			w = Integer.parseInt(input[1]);
			myGraph.addEdge(u, w);
		}
		
//		myGraph.printGraph();
		myGraph.dfs(3);
		System.out.println();
		myGraph.reset();
		myGraph.bfs(3);
	}
}
