package Prac;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;



//[ [0,1], [0,6], [0,8], [1,4], [1,6], [1,9], [2,4], [2,6], [3,4], [3,5],  
//  [3,8], [4,5], [4,9], [7,8], [7,9] ]

public class Graph_Prac {
	
	
	Node[] nodes;
	
	public Graph_Prac() {

		nodes = new Node[10];
		
		for(int i=0; i<nodes.length; i++) {
			nodes[i] = new Node(i);
		}
		
		
	}
	
	public void addAdjacent(int a , int b) {
		
		Node n1 = nodes[a];
		Node n2 = nodes[b];
		
		if(!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		
		if(!n2.adjacent.contains(n1)) {
			n2.adjacent.add(n1);
		}
		
	}
	
	public void findAdjacent(int a, int b) {
		

		Node n1 = nodes[a];
		Node n2 = nodes[b];
		
		if(n1.adjacent.contains(n2)) {
			System.out.println("["+a+","+b+"]");
		}else {
			System.out.println("없는 좌표 입니다.");
		}
				
		
	}
	
	public void DFS(int index) {
		
		Node root = nodes[index];

		Stack<Node> stack  = new Stack<>();
		stack.push(root);
		root.marked=true;
		
		while(!stack.isEmpty()) {
			
			Node visitedNode = stack.pop();
			for(Node n : visitedNode.adjacent) {
				if(n.marked==false) {
					n.marked=true;
					stack.push(n);
				}
			}
			System.out.print(visitedNode.data);			
		}
	
	
	}
	
	public void BFS(int index) {
		
		
		Node root = nodes[index];
		
		Queue<Node> queue = new Queue<Node>();
		
		queue.add(root);
		
		root.marked = true;
		
		while(!queue.isEmpty()) {
			
			Node visitedNode =queue.remove();
			
			for(Node n : visitedNode.adjacent) {
				
				if(n.marked==false) {
					n.marked=true;
					queue.add(n);
				}
								
			}
			System.out.print(visitedNode.data);
		}
		
		
		
	}
	
	public void dfsR(Node r) {
		
		if(r==null) return;
		r.marked = true;
		System.out.println(r.data);
		
		for(Node n: r.adjacent) {
			if(n.marked==false) {
				
				dfsR(n);
			}
		}
		
		
	}
	
	void dfsr(int index) {
		Node root = nodes[index];
		dfsR(root);
	}
	
	
	

}

class Node{
	
	
	int data;
	LinkedList<Node> adjacent; 
	boolean marked;
	
	public Node(int data) {
		
		this.data = data;
		adjacent = new LinkedList<Node>();
		marked=false;
	}
	
}

class Queue<T>{
	
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data =data;
		}
	}
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if(last !=null) {
			last.next = t;
		}
		
		last = t;
		
		if(first ==null) {
			first = last;		
		}
		
		
	}
	
	public T remove() {
		if(first ==null) {
			throw new NoSuchElementException();
		}
			
		T data = first.data;
		first = first.next;
	
		
		if(first == null) {
			last= null;
			
		}
		return data;
		
	}
	public T peek() {
		
		if(first ==null) {
			throw new NoSuchElementException();
		}
		
		return first.data;
		
	}
	
	public boolean isEmpty() {
		
		return first == null;
	}
	
}
