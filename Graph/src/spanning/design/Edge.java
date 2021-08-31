package weight;

public class Edge implements Comparable<Edge>{
	private int v,w;
	private int weight;
	
	public Edge(int v, int w, int weight) {
		this.v = v;
		this.w = w;
		this.weight = weight;
	}
	
	public Edge(int v, int w) {
		this(v, w, 0);
	}
	
	public int either() {
		return v;
	}
	
	public int other(int vertex) {
		
		if(vertex == v)
			return w;
		
		return v;
	}

	@Override
	public int compareTo(Edge o) {
		return this.weight - o.weight;
	}
}
