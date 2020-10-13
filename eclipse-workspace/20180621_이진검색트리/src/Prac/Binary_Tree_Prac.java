package Prac;

public class Binary_Tree_Prac {
	
	public Node root;
	
	//트리를 만드는 메서드
	
	public Binary_Tree_Prac(int[] array) {

		root = MakeTree(array, 0, array.length-1);
	}
		
	public Node MakeTree(int[] array,int start ,int end) {
		
		if(start>end) return null;
			
			int mid = (start+end)/2;
			Node node = new Node(array[mid]);
			
			node.left = MakeTree(array,start,mid-1);
			node.right = MakeTree(array, mid+1, end);
			
		
		
		return node; 
				
			
	}
	public void searchBTree(Node n ,int find) {
		
		if(find<n.data) {
			System.out.println("Data is smaller than"+n.data);
			searchBTree(n.left, find);
			
		}else if(find>n.data){
			System.out.println("Data is Bigger than"+n.data);
			searchBTree(n.right, find);
		}else {
			
			System.out.println("Data found"+n.data);
			
		}
	}

}

class Node{
	
	public Node right;
	public Node left;
	public int data;
	
	public Node(int data) {

		this.data = data;
		this.right=null;
		this.left=null;
	}
	
}
