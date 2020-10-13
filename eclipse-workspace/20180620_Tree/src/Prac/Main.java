package Prac;

public class Main {
	
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		
		Node node4=tree.makeTree(null, 4, null);
		Node node5=tree.makeTree(null, 5, null);
		Node node2=tree.makeTree(node4, 2,node5);
		Node node3=tree.makeTree(null, 3, null);
		Node node1=tree.makeTree(node2, 1, node3);
		
		tree.setRoot(node1);
				
		tree.inorder(tree.getRoot());
		System.out.println();
		tree.preorder(tree.getRoot());
		System.out.println();
		tree.postorder(tree.getRoot());
		
		
		
		
	}

}
