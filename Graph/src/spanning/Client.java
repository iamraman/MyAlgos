package spanning;

import java.util.List;

import weight.Edge;
import weight.EdgeWeightedGraph;

public class Client {
	public static void main(String[] args) {
		
		int V = 8;
		EdgeWeightedGraph gh = new EdgeWeightedGraph(V);
		
		for(int i = 1; i <= 12; i++) {
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
			
		}
		
		MST mst = new MST(gh);
		
		List<Edge> answer = mst.edges();
		
		for(Edge e : answer) {
			int v = e.either();
			int w = e.other(v);
			System.out.println(v+" "+w);
		}
	}
}
