
public class Doubly_linkedlist {
	
	//Doubly_linkedlist(이중연결리스트) vs Linked_List
	//이중연결리스트의 장점
	//단순연결리스트랑은 다르게 노드가 이전의 주소도 가지고 있어 
	//만약 6개배열중에 5번째를 찾을때 단순연결리스트처럼 1번째 2번재 3번재 4번째 5번째 이런식으로 순서대로 찾을 필요없이 
	//6번째이 5번째을 가지고 있으므로 뒤에서부터 6번째에서 찾으면 된다. 즉 시간이 더 빠르다.
	
	//찾는index가 배열의 중간 index보다 높으면 이중연결리스트를(뒤에서부터 찾아도 되니까) , 중간 index보다 낮으면 단순연결리스트를 써서 찾는게 좋다
	
	//이중연결리스트의 단점
	//한 클래스(노드)마다 이전 주소를 가져야하므로 메모리가 많이 든다.
	//단순연결리스트보다 복잡하다.
	
	private Node head; //제일처음의 정보를 담는 변수
	private Node tail; //제일 끝의 정보를 담는 변수
	private int size = 0;//몇개의 Element가 이 리스트안에 포함되어 있는가에 대한 정보를 담는 변수
	
	
	//LinkedList에서는 배열을 이용하지 않고 , 객체와 객체를 연결해서 리스트를 만드는것이다.
	
	//innerClass
	//Node
	private class Node{
		
		private Object data; // 각각의 노드가 저장될 data 
		private Node next; //누가 다음노드인가에 대한 정보
		private Node prev; //이전 정보를 담는 변수
		public Node(Object input)//어떠한 노드가 처음생성됬을때, 값들을 전달받는 매개변수
		{
			this.data=input;
			this.next=null;
			this.prev=null;
			
		}
		//노드의 내용을 쉽게 출력해서 확인해 볼수 있는 기능
		public String toString() {
			return String.valueOf(this.data); //노드에 저장될 데이터값을 String으로 변환하여 반환(return 타입은 String이어야한다)
		}
		
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head; //새로운 노드가 만들어졌을때 head의 값(즉 처음 노드의 주소(정보)를 새로운 노드가 가지고 있다.)
		
		if(head !=null) {
			
			head.prev = newNode;
		}
		
		head = newNode; //head(제일처음의 정보를 담는 변수)에 노드의 주소를 준다. head->Node 인상태 
		
		size++;
		if(head.next ==null) {
			tail = head;
		}
		
	}
	
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if(size==0) {
			addFirst(input);
		}else {
			tail.next =newNode; 
			newNode.prev = tail;
			tail = newNode;
			size++;
			
		}
	}
	public Node node(int index){
		
		if(index<(size/2)) {
			
			Node x = head;
			for(int i=0; i< index; i++) {
				x = x.next;
			}
			return x;
		}else {
			Node x =tail;
			for(int i=size-1; i>index; i--) {
				x= x.prev;
			}
			return x;
		}
		
	}
	
	public void add(int k,Object input) {
		
		if(k==0) {
			addFirst(input);
		}else {
			
			Node temp1 = node(k-1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next=newNode;
			
			newNode.next = temp2;
			if(temp2 !=null) {
				temp2.prev=newNode;
			}
			newNode.prev=temp1;		
			size++;
			if(newNode.next==null) {
				tail = newNode;
			}
		}
		
	}
	
	public String toString() { //클래스가 다르기 때문에 메서드가 같아도 상관없다
		if(head ==null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";
		
		while(temp.next != null) {
			str+= temp.data+","; //[10,20,
			temp = temp.next;
			
		}
		str += temp.data;//[10,20,30
		return str+"]";//[10,20,30]
	}

	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		
		if(head !=null) {
			head.prev=null;
		}
		temp = null;
		size--;
		
		return returnData;
		
	}

	public Object remove(int k) {
		
		if(k==0) {
			return removeFirst();
		}else {
			
			Node temp =node(k-1);
			Node todoDeleted = temp.next;
			
			temp.next=temp.next.next;
			
			temp.next.prev = temp;
			
			Object returnData = todoDeleted.data;
			
			if(todoDeleted.next==null) {
				tail = temp;
				
			}
			todoDeleted = null;
			size--;
			
			return returnData;
		}
		
	}
	public Object removeLast() {
		return remove(size-1); //마지막노드는 사이즈에서 -1 한것이 마지막 index
	}
	
	public int size() {
		return size;
	}
	
	public Object get(int k) {
		Node temp =node(k);
		return temp.data;
	}
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0;
		
		while(temp.data != data) {
			
				temp = temp.next;
				index++;
			if(temp ==null) {
				return -1;
			}
		}
		return index;
	}
	
	public ListIterator listIterator() {
		return new ListIterator();
	}
	
	class ListIterator{
		private Node next;
		private Node lastReturned;
		private int nextIndex;
		
		public ListIterator() {
			next = head;
			nextIndex = 0;
		}
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
			return lastReturned.data;
		}
		
		public boolean hasPrevious() {
			return nextIndex >0;
		}
		
		public Object previous() {
			
			if(next ==null) {
				lastReturned = next = tail;
			}else {
				lastReturned = next = next.prev;
			}
			
			nextIndex--;
			
			return lastReturned.data;
		}
		
		public boolean hasNext() {
			return nextIndex < size();
		}
		
		public void add(Object input) {
			
			Node newNode = new Node(input);
			
			//새로운 node를 맨처음에 추가할때
			if(lastReturned==null) {
				
				head = newNode;
				newNode.next= next;
			}else {
				
				//새로운 node를 중간에 추가할때
				lastReturned.next= newNode;
				newNode.prev = lastReturned;
				
				if(next !=null) {
					
					newNode.next=next;
					next.prev = newNode;
				}else {
					tail = newNode;
				}
				
				
			}
			lastReturned = newNode;
			nextIndex++;
			
			size++;
		}
		
		//가장 처음을 삭제할때 , 중간을 삭제할때 , 마지막을 삭제할때.
		public void remove() {
		
			if(nextIndex == 0 ) {
				throw new IllegalStateException();
			}
			
			Node n = lastReturned.next;
			Node p = lastReturned.prev;
			
			
			if(p!=null) {
				
				head =n;
				head.prev=null;
				lastReturned =null;
				
			}else {
											
				p.next=next;
				lastReturned.prev =null;
						
			}
			
			//가장 마지막의 노드를 삭제할때
			if(n==null) {
				tail = p;
				tail.next =null;
				
			}else {
				
				n.prev = p;
			}
			
			if(next == null) {
				
				lastReturned =tail;
			}else {
				
				lastReturned=next.prev;
			}
			
			size--;
			nextIndex--;
			
			
			
			

		}
	}
	

}
