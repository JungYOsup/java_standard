package Prac;

import java.util.LinkedList;

public class HashTable_Prac {
	
	//1. 노드
	class Node{
		
		String key;
		String value;
		
		public Node(String key, String value) {

			this.key =key;
			this.value=value;
			
			
		}

		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
		
		
	}

	//2. 해쉬테이블
	LinkedList<Node>[] data; //
	public HashTable_Prac(int size) {
		data = new LinkedList[size];
	}
	
	//3. key값을 hashcode로 바꿔주는 메서드(해쉬함수)
	int getHashCode(String key) {
		int hashcode =0;
		
		for(char c : key.toCharArray()) {
			hashcode += c;
		}
		
		return hashCode();
	}
	
	//4.hashcode를 index로 바꿔주는 메소드
	int convertToIndex(int hashcode) {
		return hashcode%data.length;
	}
	//4.값을 넣어주는 메서드
	
	void put(String key , String value) {
		
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		
		if(list ==null) {
			list = new LinkedList<Node>();
			data[index] = list;
		}
		
		Node node = searchKey(list, key);
		
		if(node ==null) {
			
			list.addLast(new Node(key,value));
		}else {
			node.setValue(value);
		}
		
		
	}
	
	//5.검색 키를 가지고 해당 노드를 찾아오는 메서드
	Node searchKey(LinkedList<Node> list, String key) {
		
		if(list ==null) return null;
		
		for(Node node : list) {
			
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
		
		
	}
	String get(String key) {
		
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);
		
		return node ==null ? "Not found" : node.getValue();
		
		
	}

}

