package Prac;


//Tree는 뭐가 필요할까?
//일단 한 노드에는 오른쪽주소과 왼쪽주소가 필요하다.
//그리고 이런 노드들을 이어서 표현한것이 Tree
//트리에는 root가 잇다.
public class Tree {

	Node root;

	public Tree() {
		root =null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public Node makeTree(Node left, Object data, Node right) {

		Node NewNode = new Node(left, data, right);

		return NewNode;

	}

	public void inorder(Node node) {

		if(node!=null) {
			inorder(node.left);
			System.out.print(node.data);
			inorder(node.right);
		}

	}
	
	public void preorder(Node node) {

		if(node!=null) {
			System.out.print(node.data);
			preorder(node.left);
			preorder(node.right);
		}

	}
	
	public void postorder(Node node) {

		if(node!=null) {
			postorder(node.left);
			postorder(node.right);
			System.out.print(node.data);
		}

	}




}


class Node{

	public Object data;
	public Node left;
	public Node right;

	public Node(Node left, Object data ,Node right) {

		this.left=left;
		this.data=data;
		this.right=right;
	}





}
