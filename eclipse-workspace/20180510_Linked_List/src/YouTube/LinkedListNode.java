package YouTube;

//여기 LinkedListNode는 
public class LinkedListNode {

	Node header;

	public static class Node {

		int data;
		Node next = null;
		
		public Node() {

		}
		
		public Node(int data) {
			
			this.data =data;
			
		}

	}

	LinkedListNode(){
		header = new Node();
	}

	void append(int d) {
		Node end = new Node(); //새로운노드 생성
		end.data=d;
		Node n = header;

		while(n.next !=null) { //n.next가 null이 아니라는 말은 기존의 노드가 존재한다는의미

			n=n.next; //n.next==null일떄까지 노드를 이동시킴

		}
		n.next=end; // n.next==null일때 즉 마지막 노드까지 갔을때 마지막노드에 새로운 노드를 연결시켜준다.

	}

	//노드 next가 null 맨 마지막 노드까지 호출하는 메서드
	void retrieve() {

		Node n = header.next;
		while(n.next != null) {
			System.out.print(n.data + "->");
			n= n.next;

		}
		System.out.println(n.data);

	}

	//이 delete의 특징은 내가 처음에 배웠던 delete와 다르게 값으로 삭제한다는것이다. 내가 처음 배웠던 delete는 값이 아닌 index로 값을 지웠음
	void delete(int d) {
		Node n = header; //제일처음 노드

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
	
	//값으로 지움 
	Node get(int num) {
		Node n = header; //제일처음 노드를 가리킴
		
		while(n.data!=num) {
			
			n=n.next;
		}
			
		
		return n;
	}
	//index로 지움
	Node get2(int num) {
		Node n = header; //제일처음 노드를 가리킴
		
		for(int i=0; i<num; i++) {
			n= n.next;
		}
			
		
		return n;
	}

}


