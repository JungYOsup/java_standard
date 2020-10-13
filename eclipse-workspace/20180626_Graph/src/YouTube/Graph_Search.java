package YouTube;

import java.util.NoSuchElementException;


public class Graph_Search {
	
	//검색 방법에는 2가지가 있다. 
	//(1)Depth_First Search(DFS) : inorder(왼,자기자신,오) , preorder(자기자신,왼,오) , postorder(왼,오,자기자신)

	//(2)Breadth_First Search(BFS)
	//:자식들을 다 방문하고 그 자식들을 방문한다. 
	
	//깊이 우선검색은 Stack을 이용해 검색하고
	//자식 우선검색은 Queue를 이용해 검색한다.
	
	//그래프는 트리가 아니기 때문에 시작 순서가 고정되어있지 않다.
	
	//(3)DFS with Recursion (재귀함수를 이용한 DFS 그래프 검색)
	
	
	public static void main(String[] args) {
		
		Graph g = new Graph(9);
				
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		
		
//		g.dfs();    //0,1,3,5,7,6,8,4,2
		g.dfsR();	//0,1,2,4,3,5,6,8,7
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
