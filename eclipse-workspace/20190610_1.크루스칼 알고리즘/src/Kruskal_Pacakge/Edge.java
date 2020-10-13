package Kruskal_Pacakge;

public class Edge {
	
	int[] node= new int[2];
	int distance;
	
	public Edge(int a , int b, int distance) {
		this.node[0]=a;
		this.node[1]=b;
		this.distance = distance;
	}
	
	public boolean operator(Edge edge) {
		return this.distance< edge.distance;
	}
	
	
	
}
