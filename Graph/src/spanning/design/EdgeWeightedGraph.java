package spanning.design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EdgeWeightedGraph {
	private int V;
	public HashMap<Integer,List<Edge>> mapping;
	
	public EdgeWeightedGraph(int n) {
		this.V = n;
		mapping = new HashMap<Integer,List<Edge>>();
	}
	
	public void addEdge(Edge e) {
		int v = e.either();
		int w = e.other(v);
		
		List<Edge> one = mapping.get(v);
		List<Edge> two = mapping.get(w);
		
		if(null == one)
			one = new ArrayList<Edge>();
		if(null == two)
			two = new ArrayList<Edge>();
		
		one.add(e);
		two.add(e);
		
		mapping.put(v, one);
		mapping.put(w, two);
	}
	
	public int V() {
		return this.V;
	}
}
