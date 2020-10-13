package Prac;



public class Main {
	
	public static void main(String[] args) {
		
		Graph_Prac g = new Graph_Prac();
		g.addAdjacent(0, 1);
		g.addAdjacent(1, 2);
		g.addAdjacent(1, 3);
		g.addAdjacent(2, 4);
		g.addAdjacent(2, 3);
		g.addAdjacent(3, 4);
		g.addAdjacent(3, 5);
		g.addAdjacent(5, 6);
		g.addAdjacent(5, 7);
		g.addAdjacent(6, 8);
		
		
		
		g.BFS(0);
		
	}

}


