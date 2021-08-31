package shortestpath.design;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class EdgeWeightedGraph {
	public int V;
	HashMap<Integer,List<Edge>> mapping;
	
	public EdgeWeightedGraph(int vertices) {
		this.V = vertices;
		mapping = new HashMap<Integer,List<Edge>>();
	}
	
	public void addEdge(Edge e) {
		int u = e.from();
		int v = e.to();
		
		List<Edge> one = adj(u);
		List<Edge> two = adj(v);
		
		if(null == one)
			one = new ArrayList<Edge>();
		if(null == two)
			two = new ArrayList<Edge>();
		
		one.add(e);
		two.add(e);
		
		this.mapping.put(u, one);
		this.mapping.put(v, two);
	}
	
	public List<Edge> adj(int source){
		return this.mapping.get(source);
	}
	
	List<Edge> safe(List<Edge> list){
		return null == list ? Collections.emptyList() : list;
	}
}
