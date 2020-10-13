package Data_Structure_Book;

public class Chaining<K,V> {
	private int M = 13; //해쉬테이블 크기
	private Node[] a = new Node[M]; //해쉬테이블 

	//1. Node 클래스
		public static class Node{
		private Object key;
		private Object data;
		private Node next;
		
		public Node(Object newkey, Object newdata, Node ref) {
			key = newkey;
			data = newdata;
			next = ref;
		}
		
		public Object getKey() {return key;}
		public Object getDate() {return data;}
		
	}
		
	private int hash(K key) { //키값을 받으면 hashcode로 바꿔주고 그 hashcode를 index로 바꿔주는 해쉬함수
		return (key.hashCode() * 0x7fffffff) % M;
	}
	
	//확인하는 데이터
	public V get(K key) {
		int i = hash(key); //index로 바꾼 것을 변수 i 가 받고 
		for(Node x = a[i]; x!=null; x=x.next) // Node x 변수에 넣어주고 그 x가 값이 null 이 경우 
			
			if(key.equals(x.key)) return (V) x.data; // 만약 내가 넣은 키값이 이미 존재한다면 데이터를 리턴한다. 그리고 다시 for문으로 가서 다음 리스트로 이동
		return null; //그 값이 null
	}
	
	//
	private void put(K key, V data) {
		int i = hash(key);
		for(Node x=a[i]; x!=null; x=x.next)// Node x 변수에 넣어주고 그 x가 값이 null 이 경우
			if(key.equals(x.key)) { //만약 내가 넣은키값이 이미 존재한다면 
				x.data=data; // 똑같이 넣어줌 
				return;
			}
		a[i]=new Node(key,data,a[i]); //그게 아니면 새로운 노드를 만들어서 거기다 넣어줌 
		}
	}

