// 데이터의 탐색 속도 증진을 위해 사용하는 구조
// 실제로 트리를 제대로 구현하기 위해서는 포인터를 사용해야 합니다.
// 포인터를 이용해 특정한 루트에서 자식 노드로 접근할 수 있기 때문입니다.

// 힙 정렬을 배웠을때 그 조건은 
// 힙 구조 조건 
// 1. 완전 이진트리를 기반으로한다.
// 2. 최대힙 구조이어야한다(부모노드가 자식노드보다 커야함)
// 3. 최대힙이 아닐경우 힙 생성알고리즘(Heapify Algorithm)을 통해 최대힙 구조형태로 만들어준다.
// 이것이였다. 그러나 일반적인 트리는 완전 이진트리를 전재로 하지 않는다.

// 따라서 실제로 트리를 제대로 구현하기 위해서는 **포인터를 사용해야한다.
// 시간 봅잡도 O(logN);

// 왜 그러면 포인터를 사용할까?
// 포인터를 사용함으로써 시간과 공간의 절약을 할수 있다.
// 예를들어 오른쪽으로 이어지는 4개의 공간을 만드려고 하는데 
// 하지만 힙 같은 경우 4개의 공간을 만들기 위해서는 
//   	      0
// 		  1        2 
//	   3   4     5    6
// 완전이진트리를 기반으로 하므로 오른쪽으로 이어지는 4개의 공간을 만들기 위해서는 14개의 공간을 필요로 하기 때문이다.
// 즉 포인터를 사용함으로써 데이터의 낭비를 막을수 있다!!

// 순회 방법
// 1. 전위 순회  0-1-3-4-2-5-6 (자기방문 -> 왼쪽 -> 오른쪽)
// 2. 중위 순회  3-1-4-0-5-2-6 (왼쪽->자기->오른쪽)
// 3. 후위 순회  3-4-1-5-6-2-0 (왼쪽->오른쪽->자기)


public class Binary_Tree {

	public static void main(String[] args) {

		Tree tree = new Tree();
		
		Node node6 = tree.makeTree(null, 6, null);
		Node node5 = tree.makeTree(null, 5, null);
		Node node2 = tree.makeTree(node5, 2, node6);
		Node node4 = tree.makeTree(null, 4, null);
		Node node3 = tree.makeTree(null, 3, null);
		Node node1 = tree.makeTree(node3, 1, node4);
		Node node0 = tree.makeTree(node1, 0, node2);
		
		tree.setRoot(node0);
		
		tree.inorder(tree.getRoot());
		System.out.println();
		tree.preorder(tree.getRoot());
		System.out.println();
		tree.postorder(tree.getRoot());
	}

}

class Tree{

	Node root; //포인터 

	public Tree() {
		root = null;

	}

	public Node getRoot() {
		return root;

	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node makeTree(Node left , Object data , Node right) {

		Node NewNode = new Node(left, data, right);

		return NewNode;
	}

	public void inorder(Node node) {

		if(node != null) {
			inorder(node.left);
			System.out.print(node.data);
			inorder(node.right);
		}
	}

	public void preorder(Node node) {

		if(node != null) {
			System.out.print(node.data);
			preorder(node.left);
			preorder(node.right);
		}
	}
	
	public void postorder(Node node) {

		if(node != null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data);
		}
	}
	
	


}

class Node {
	public Object data;
	public Node left;
	public Node right;

	public Node(Node left, Object data , Node right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}
}
