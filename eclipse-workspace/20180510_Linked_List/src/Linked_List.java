import java.util.NoSuchElementException;

public class Linked_List {

	//메모리를 효율적으로 사용하기위해 Data Structure을 사용한다.
	//객체와 객체를 연결(refer)을 통해서 구현하는것이 LinkedList
	//LinkedList의 장점? 
	//따라서 자신의 어떤 작업을 할때는 LinkedList를 사용하는게
	//또는 ArrayList를 사용하는게 좋다라는걸 알기위해 배운다
	
	private Node head; //제일처음의 정보를 담는 변수
	private Node tail; //제일 끝의 정보를 담는 변수
	private int size = 0;//몇개의 Element가 이 리스트안에 포함되어 있는가에 대한 정보를 담는 변수
	
	//LinkedList에서는 배열을 이용하지 않고 , 객체와 객체를 연결해서 리스트를 만드는것이다.
	
	//innerClass
	//Node
	private class Node{
		
		private Object data; // 각각의 노드가 저장될 data 
		private Node next; //누가 다음노드인가에 대한 정보
		
		public Node(Object input)//어떠한 노드가 처음생성됬을때, 값들을 전달받는 매개변수
		{
			this.data=input;
			this.next=null;
			
		}
		//노드의 내용을 쉽게 출력해서 확인해 볼수 있는 기능
		public String toString() {
			return String.valueOf(this.data); //노드에 저장될 데이터값을 String으로 변환하여 반환(return 타입은 String이어야한다)
		}
		
	}
	
	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head; //처음노드가 존재하는데 새로운 노드가 만들어졌을때 head의 값(즉 처음 노드의 주소(정보)를 새로운 노드가 가지고 있다.)
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
			tail = newNode;
			size++;
			
		}
	}
	
	public Node node(int index){
		Node x = head;
		
		for(int i=0; i< index; i++) {
			x = x.next;
		}
		
		return x; //x.toString을하면 리턴타입이 String을 반환해버리니까 오류가발생 , 그래서 어차피 이클립스에서 x를 입력하면 알아서 toString을 해주니까  Node타입에도 맞추고 toString을 하기위해 변수만 넘음???
				  //이게 맞나??
	}
	
	//중간에 노드를 추가할때
	public void add(int k,Object input) {
		
		
		
		if(k==0) {
			addFirst(input);
		}else {
			
			Node temp1 = node(k-1);  //그 전의 노드를 알아야한다. //1->2->3에 2와 3사이에 4를 추가시키고 싶으면 2의 주소를 알아야한다.
			Node temp2 = temp1.next; //그 전의 노드의 주소(즉 다음 노드)를 temp2라고 하자 //2와 3의 연결점(->)을 temp2에 저장
			Node newNode = new Node(input); //새로운 노드를 만들고  
			temp1.next=newNode; // 그전의 노드 주소에 새로운 노드를 연결한다. // 1->2->4 3 
			newNode.next = temp2; //새로운 노드 주소에  // 1->2->4->3
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
		temp = null;
		size--;
		
		return returnData;
		
	}

	public Object remove(int k) {
		
		if(size==0) {
			throw new NoSuchElementException();
		}
		
		if(k==0) {
			return removeFirst();
		}else {
			
			Node temp =node(k-1);
			Node todoDeleted = temp.next;
			
			temp.next=temp.next.next;
			
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
		}
		public Object next() {
			lastReturned = next;
			next = next.next;
			nextIndex++;
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
				newNode.next=next;
			}
			lastReturned = newNode;
			nextIndex++;
			
			size++;
		}
		
		public void remove() {
		
			if(nextIndex == 0 ) {
				throw new IllegalStateException();
			}
			
			Linked_List.this.remove(nextIndex-1);
			nextIndex--;
			

		}
	}
	
	
	
	
}
