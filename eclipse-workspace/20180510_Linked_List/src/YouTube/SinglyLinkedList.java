package YouTube;

public class SinglyLinkedList {

	//LinkedList의 1번
	//중간에 삽입이 불가, 맨마지막에만 삽입이 됨, head랑 tail을 구현을 안해줬기 때문에 그럼
	
	public static void main(String[] args) {
		
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.delete(1);
		head.retrieve(); //맨 앞이 삭제가 안된다.
	}
	
	


}

class Node {
	
	int data;
	Node next =null;
	
	public Node(int d) {
		this.data = d;
	}
	
	void append(int d) {
		Node end = new Node(d); //새로운노드 생성
		Node n = this; // n은 기존에 노드
		
		while(n.next !=null) { //n.next가 null이 아니라는 말은 기존의 노드가 존재한다는의미
			
			n=n.next; //n.next==null일떄까지 노드를 이동시킴
			
		}
		n.next=end; // n.next==null일때 즉 마지막 노드까지 갔을때 마지막노드에 새로운 노드를 연결시켜준다.
		
	}
	
	//노드 next가 null 맨 마지막 노드까지 호출하는 메서드
	void retrieve() {
		
		Node n = this;
		while(n.next != null) {
			System.out.print(n.data + "->");
			n= n.next;
			
		}
		System.out.println(n.data);
		
	}
	
	//이 delete의 특징은 내가 처음에 배웠던 delete와 다르게 값으로 삭제한다는것이다. 내가 처음 배웠던 delete는 값이 아닌 index로 값을 지웠음
	void delete(int d) {
		Node n = this; //제일처음 노드
		
		while(n.next!=null) { //맨 마지막 노드가 null이 아닐떄까지 
			if(n.next.data ==d) { //만약 처음노드의 다음노드의 데이터가 d랑 같을경우 
				n.next = n.next.next; //***처음노드와 , 3번째 노드를 연결시킴(여기가 잘 이해가 안됨.. 맨 마지막 노드를 지우면 우째되는겨?) 
			}else {
				n=n.next;//만약 다르면 노드를 이동함
			}
		}
		
		//내가 지울 데이터와 노드가 일치할때까지 노드를 이동하다가 내가 원하는 값과 노드의 값이 같을경우 노드를 지음
		//그런데 이 delete는 첫번째 노드가 무조건 존재한다는 가정하에 있다 왜냐하면 노드가 아예존재하지 않을경우 n.next자체가 실행될수 없기 때문이다.
	}
}