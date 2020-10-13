package Prac;

import java.util.LinkedList;
import java.util.NoSuchElementException;

//키 값을 받으면 그 키값을 해시코드를 만들어줄 함수가 필요하다
//그리고 그 해시코드를 배열방의 번호로 만들어주는 함수가 필요하고
//그 배열방은 LinkedList로 구성되어 있어서 값이 증가하더라도 크기를 늘려줄 필요없다.



public class HashTable_Prac2 {

	LinkedList<Node>[] floor;

	public HashTable_Prac2(int size) {
		floor = new LinkedList[size];
	}

	public String get(String key) {

		int num = ConvertHashCode(key);
		
		LinkedList<Node> RoomNumber = floor[num];
		
		Node node = searchKey(RoomNumber, key);
		
		if(node != null) {
			
			return node.value;
		}
		
		return null;
		
		

	}


	//값을 집어넣음
	public void put(String key, String value) {

		int num = ConvertHashCode(key);
		LinkedList<Node> RoomNumber;

		RoomNumber=new LinkedList<>();
		floor[num] = RoomNumber;


		Node checked =searchKey(RoomNumber, key);

		if(checked==null) {
			Node node = new Node(key, value);
			RoomNumber.addLast(node);
		}else {
			checked.value = value;
		}



	}
	public Node searchKey(LinkedList<Node> RoomNumber, String inputkey ) {

		for(Node node : RoomNumber) {

			if(node.key.equals(inputkey)) {
				return node;
			}

		}
		return null;
	}


	public int ConvertHashCode(String input) {

		int HashCode = 0;

		for(int Code : input.toCharArray()) {

			HashCode += Code;

		}


		return RoomNumber(HashCode);

	}

	public int RoomNumber(int HashCode) {

		return HashCode%floor.length;

	}





}

class Node{

	String key;
	String value;

	public Node(String key , String value) {
		this.key = key;
		this.value = value;

	}

}


