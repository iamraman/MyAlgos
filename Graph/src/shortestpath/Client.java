package shortestpath;

import shortestpath.design.Edge;
import shortestpath.design.EdgeWeightedGraph;

public class Client {
	public static void main(String[] args) {
		
		EdgeWeightedGraph gh = new EdgeWeightedGraph(9);
//		
//		gh.addEdge(new Edge(0,1,5));
//		gh.addEdge(new Edge(0,4,9));
//		gh.addEdge(new Edge(0,7,8));
//		gh.addEdge(new Edge(1,2,12));
//		gh.addEdge(new Edge(1,3,15));
//		gh.addEdge(new Edge(1,7,4));
//		gh.addEdge(new Edge(2,3,3));
//		gh.addEdge(new Edge(2,6,11));
//		gh.addEdge(new Edge(3,6,9));
//		gh.addEdge(new Edge(4,5,4));
//		gh.addEdge(new Edge(4,6,20));
//		gh.addEdge(new Edge(4,7,5));
//		gh.addEdge(new Edge(5,2,1));
//		gh.addEdge(new Edge(5,6,13));
//		gh.addEdge(new Edge(7,5,6));
//		gh.addEdge(new Edge(7,2,7));
//		gh.addEdge(new Edge(0,8,1));
		gh.addEdge(new Edge(0, 7, 16));
		gh.addEdge(new Edge(2, 3, 17));
		gh.addEdge(new Edge(1, 7, 19));
		gh.addEdge(new Edge(0, 2, 26));
		gh.addEdge(new Edge(5, 7, 28));
		gh.addEdge(new Edge(1, 3, 29));
		gh.addEdge(new Edge(1, 5, 32));
		gh.addEdge(new Edge(2, 7, 34));
		gh.addEdge(new Edge(1, 2, 36));
		gh.addEdge(new Edge(4, 5, 35));
		gh.addEdge(new Edge(4, 7, 37));
		gh.addEdge(new Edge(0, 4, 38));
		gh.addEdge(new Edge(6, 2, 40));

		gh.addEdge(new Edge(3, 6, 52));

		gh.addEdge(new Edge(6, 0, 58));
		

		gh.addEdge(new Edge(6, 0, 93));
		
		ShortestPathBuilder sp = new ShortestPathBuilder(gh);
		
	}
}
