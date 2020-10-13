package Prac2;

//노드를 생성하고
//트리를 만들고
//그 트리에서 내가 원하는값을 찾는것을 호출해주는 메서드를 만든다.

public class Binart_Tree_Parc2 {
	
	Node root;
	int count=0;
	public Binart_Tree_Parc2(int[] array) {

		root = makeTree(array,0,array.length-1);
	}
	
	public Node makeTree(int[] array , int first ,int last) {
		
		
		if(first>last) {
			
			return null;
		}
		
		int mid = (last+first)/2;
		
		Node left = makeTree(array, first, mid-1);
		Node right = makeTree(array, mid+1, last);
		
		Node newNode = new Node(array[mid], left, right);
		
		return newNode;
		
	}
	
	public void String_Prac(Node n , int num) {
		
		
		if(n.data<num) {
			
			System.out.println("내가 입력한 값이 더 큽니다."+n.data);
			count++;
			String_Prac(n.right, num);
		}else if(n.data>num){
			
			System.out.println("내가 입력한 값이 더 작습니다."+n.data);
			count++;
			String_Prac(n.left, num);
			
		}else {
			System.out.println("내가 입력한 값과 같습니다."+n.data);
			System.out.println("총 걸린 횟수 "+count);
		}
	}
	
	
	

}

class Node{
	
	int data;
	Node left;
	Node right;
	
	public Node(int data, Node left, Node right) {
		super();
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	
	
	
	
	
	
}
