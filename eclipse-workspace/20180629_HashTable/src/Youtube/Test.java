package Youtube;

import java.util.LinkedList;

//HashTable
//:해쉬테이블이란 검색하고자 하는 키값을 입력받아서 해쉬함수를 돌려서 반환받은 해쉬코드를 배열의 index로 환산해서 데이터에 접근하는 방식이다.
//여기서 키값은 문자열, 숫자 , 파일데이터 등이 될수도 있다.
//해쉬함수는 어떤 특정한 규칙을 이용해 입력받은 키값으로 키값이 얼마나 큰지에 상관없이 동일한 해쉬코드를 만들어 준다.
//해쉬테이블의 장점은 검색 속도가 빠르다는 것이다.
//그 이유는 해쉬함수를 이용해서 만든 해쉬코드는 정수이기 때문에 해쉬코드 자체가 그 배열방의 index로 사용되기 떄문에 검색자체를 할 필요 없이 해쉬코드로 배열의 index에 다이렉트로 접근할수 있기 떄문이다.!! 
//ex)  Key    HashCode    Index    list
//   "Sung" ->  445         0      
//   "jin"  ->  321         1
//   "hee"  ->  306         2
//   "min"  ->  324         3

//해쉬테이블에 문제점 
//하나의 Index에  값들이 몰아서 들어갈경우 , 방의 효율성이 떨어진다. 그래서 방을 나눌때 규칙을 잘 정하는것이 중요하다.
//이렇게 하나의 Index에 값들이 몰아서 들어갈경우 충돌현상이 일어난다. 이럴경우 최대 검색시간이 O(1)에서 O(n)까지 늘어난다.
//따라서 좋은 해쉬테이블의 좋은 알고리즘은 규칙을 얼마나 잘 정해서 여러방에 분배하느냐에 있다.

//Key값은 문자열이므로 값이 무한하지만 HashCode는 정수개 만큼밖에 제공하지 못하므로(한정적이다) 어떤 키들은 중복되는 HashCode를 가질수 밖에 없다.
//또한 다른 HashCode라도 배열방은 고정되어 있으므로 다른 HashCode 라도 같은방에 배정받는 경우가 있다. 
//즉 다른문자열이지만 중복되는 HashCode를 받아서 같은방에 배정받던
//다른 HashCode지만 같은 방에 배정받던 이렇게 겹쳐서 들어가는 경우를 Collision(충돌)이 발생했다고 한다. 이러한 충돌을 최소화 하기 위해 좋은 HashTable을 만드는것이 중요하다.

//배열방은 하나방에 여러값들이 들어갈수 있으므로 LinkedList로 연결시켜 놓는다.


public class Test {

	public static void main(String[] args) {
		HashTable h = new  HashTable(3);
		
		h.put("sung", "She is pretty");
		h.put("jin", "She is model");
		h.put("hee", "She is an angel");
		h.put("min", "She is cute");
		h.put("min", "She is happy");
		
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
		System.out.println(h.get("jae"));
				
	}
	
	
}

class HashTable{
	
	class Node{
		String key;
		String value;
		
		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}
		
		public String getValue() {
			return value;
		}

		public void setValue(String value) {
			this.value = value;
		}
		
	}
	
	LinkedList<Node>[] data;
	public HashTable(int size) {
		this.data = new LinkedList[size];
	}
	
	//키값을 hashCode로 변환시킴
	int getHashCode(String key) {
		int hashcode=0;
		//key값(문자열)을 받으면 toCharArray를 이용해 문자형배열에 넣어주고
		for(char c: key.toCharArray()) {
			hashcode+=c; //char가 int형으로 바뀌면 알아서 아스키코드로 변환되므로 이렇게 해준거임
		}
		return hashcode;
	}
	
	//hashcode를 배열방의 index로 바꿔주는 메서드
	int convertToIndex(int hashcode) {
		
		return hashcode % data.length;
		
		
	}
	//검색 키를 가지고 해당 노드를 찾아오는 메서드
	Node searchKey(LinkedList<Node> list , String key) {
		
		if(list==null) return null;
		for (Node node : list) {
			
			if(node.key.equals(key)) {
				return node;
			}
		}
		return null;
		
	}
	
	void put(String key , String value) {
		int hashcode = getHashCode(key); //키를 이용해 hashcode를 받고 
		int index = convertToIndex(hashcode); //받아온 hashcode를 이용해 배열방 index를 가져오고
		LinkedList<Node> list = data[index]; //받아온 배열방 index를 이용해서 배열방의 연결되어있는 것들을 가져오고 
		
		//배열방이 아무것도 없으면 배열방에 LinkedList를 생성하고 
		if(list ==null) {
			list = new LinkedList<Node>();
			data[index] = list;
		}
		Node node = searchKey(list, key); //검색 키를 가지고 해당 노드를 가져오고 
			
		if(node ==null) {
			list.addLast(new Node(key,value)); //받아온 정볼르 가지고 Node 객체를 만들어서 추가한다.
		}else {
			node.setValue(value); //기존에 노드가 존재할경우 새로운값으로 바꿔준다.
		}
	}
	String get(String key) {
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);
		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);
		return node ==null? "Not found" : node.getValue();
	}
	
}


