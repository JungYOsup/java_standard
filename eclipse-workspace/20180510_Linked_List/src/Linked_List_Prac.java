
public class Linked_List_Prac {

	//하나의 노드가 있음 
	//이전노드가 그 다음 노드의 주소를 가지고 있어서 
	//다음 노드를 찾기 위해서는 이전노드를 알아야함
	//노드를 추가,삭제는 추가의 경우는 노드를 하나더 생성하여 이전주소와 다음주소를 연결시켜주기만 하면됨
	//삭제는 삭제시킬 노드의 주소를 끊으면 된다.
	private Node head;
	private Node tail;
	private int size=0;
	

	public void addFirst(Object input) {

		Node Newnode = new Node(input);

		Newnode.next=head;
		
		if(head !=null) { //이미 한개노드가 존재
			
			head.prev = Newnode;
		}
		head = Newnode;
		size++;
		if(head.next==null) {

			tail = head;
		}


	}

	public void addLast(Object input) {

		Node Newnode = new Node(input);

		if(size==0) {
			addFirst(input);
		}else {

			tail.next = Newnode;
			Newnode.prev=tail;
			tail = Newnode;
			size++;
		}
	}


	public Node node(int index) {

		if(index<(size/2)) {
			
			Node x = head;
			
			for(int i=0; i<index; i++) {
				
				x = x.next;
			}
			
			return x;
		}else {
			
			Node x =tail;
			
			for(int i=size-1; i>index; i--) {
				x=x.prev;
			}
			
			return x;
			
		}
		

	}

	public void add(Object input, int k) {

		if(size ==0) {
			addFirst(input);
		}else {

			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			
			if(temp2 !=null) { //둘러싸여있을때
				temp2.prev=newNode;
			}
			
			newNode.prev=temp1;
			
			size++;

			if(newNode.next ==null) {
				tail = newNode;
			}

		}


	}

	public Object removeFirst() {

		Node temp = head;
		head = head.next;
		
		Object deletevalue = temp.data;
		
		if(head !=null) {
			head.prev=null;
		}

		temp =null;
		size--;

		return deletevalue; 


	}

	public Object remove(int k) {

		if(k==0) {
			return removeFirst();

		}else {

			Node temp = node(k-1);
			Node todoDeleted = temp.next;

			temp.next = temp.next.next;
			
			temp.next.prev =temp;

			Object deletevalue = todoDeleted.data;

			if(todoDeleted.next==null) {
				tail = temp;
			}

			todoDeleted = null;

			size--;

			return deletevalue;

		}

	}
	
	public Object removeLast() {
		
		return remove(size-1);
	}




}




