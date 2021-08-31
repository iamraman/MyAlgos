package shortestpath.design;

import java.util.Comparator;

public class Edge implements Comparator<Edge>{
	private int u;
	private int v;
	public int w;
	
	
	public Edge(int u, int v, int w) {
		this.u = u;
		this.v = v;
		this.w = w;
	}
	
	public int from() {
		return this.u;
	}
	
	public int to() {
		return this.v;
	}

	@Override
	public int compare(Edge o1, Edge o2) {
		return o1.w - o2.w;
	}
}
