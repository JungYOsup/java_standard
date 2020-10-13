package YouTube;

import java.util.LinkedList;
import java.util.Stack;


//tree는 Graph의 한 형태이다. 
//tree는 루트가 있고 들어오는 곳이 한개이고 사이클이 없는 아래로만 흐르는 그래프이다.
//그러나 그래프는 그러한 제약이 없다.
//그래프는 방향이 있을수도 있고 없을수도 있다.
//방향이 잇는 그래프 : Directed graph
//방향이 없는 그래프 : Undirected graph
//하나 이상 사이클이 잇는 그래프 : Cyclic graph
//사이클이 없는 그래프 : Acyclic graph 

// Graph를 표현하는 방법 : (1) adjacency Matrix (2차원 배열(표)에 표현하는방법) 
				//   (2) adjacency list (배열의 노드들을 나열하고 관계들을 Linked_List로 나열)   

public class Graph {
	
	
	class Node{
		
		int data;
		LinkedList<Node> adjacent;
		boolean marked; //방문했는지 안했는지를 판단함
		
		Node(int data){
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
		
		
		
	}
	
	Node[] nodes;
	
	//편의를 위해 사이즈를 미리 정해줌
	//size만큼의 노드를 생성하여 배열에 담아줌
	public Graph(int size) {
		nodes = new Node[size];
		
		for(int i=0; i<size; i++) {
			nodes[i] = new Node(i);
		}
		
	}
	//두 노드의 관계를 저장하는 함수
	//편리하게 하기 위해 받은 데이터와 index는 같다고 정의함
	//adjacency list (배열의 노드들을 나열하고 관계들을 Linked_List로 나열) 했음
	void addEdge(int i1, int i2) {
		
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
		
	}
	
	void dfs() {
		dfs(0);
	}
	void dfs(int index) {
		
		Node root = nodes[index]; //nodes[0] => 
		Stack<Node> stack = new Stack<Node>();
		
		stack.push(root);
		root.marked = true;
		
		while(!stack.isEmpty()) {
			Node r = stack.pop();
			
			for(Node n : r.adjacent) {
				if(n.marked ==false) {
					n.marked=true;
					stack.push(n);
				}
			}
			visit(r);
		}
		
		
		
	}
	
	void bfs() {
		bfs(0);
	}
	void bfs(int index) {
		Node root = nodes[index];
		Queue<Node> queue = new Queue<Node>();
		queue.add(root);
		root.marked = true;
		
		while(!queue.isEmpty()) {
			Node r = queue.remove();
			for(Node n : r.adjacent) {
				if(n.marked ==false) {
					n.marked =true;
					queue.add(n);
				}
				
			}
			visit(r);
		}
		
	}
	
	//stack과 queue를 쓸필요 없다
	void dfsR(Node r) {
		
		if(r==null) return;
		r.marked = true;
		visit(r);
		for(Node n : r.adjacent) {
			if(n.marked == false) {
				dfsR(n);//재귀함수
			}
		}
	}
	
	void dfsR(int index) {
		Node r = nodes[index];
		dfsR(r); //노드 r이 들어감
	}
	
	void dfsR() {
		dfsR(0);
	}
	
	void visit(Node n) {
		System.out.println(n.data+" ");
	}

}


