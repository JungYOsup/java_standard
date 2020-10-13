package YouTube;

import java.awt.Stroke;

public class LinkedListDigit {

	//어떤 숫자를 자리수 별로 한개씩 Linked List에 담았다. 그런데 1의 자리가 헤더에 오도록 거꾸로 담았다. 
	//이런식의 Linked LIst 두개를 받아서 합산하고 같은식으로 Linked List에 담아서 반환해라 
	//tip) 재귀호출
	//ex) 9->1->4 = 419(각 자리수를 LinkedList에 거꾸로 넣음) 
	//    6->4->3 = 346
	// C  1  0  0 
	//    5->6->7 = 765
	
	//문제2) LInkedList에 숫자가 거꾸로가 아니면?
	//ex) 4->1->9 = 419
 	//       3->4 = 032 //tip) 자리수가 틀리면 0을 채워넣줘야한다.
	// C  0->1  0
 	// R =4->5->3->null
	// 마지막 작업의 합산의 Carry가 1이 나올경우 
	
	//사용된 메서드 (1) 길이를 측정하는 메서드 , (2)길이가 다를경우 길이를 맞추기 위해 비어있는곳에 0 노드를 만드는 메서드 ,(3)만든 메서드를 노드 이전에 넣는 메서드 ,(4)값을 더하는 메서드
	
	//
		
	static int count=0;
	static class Storage{
		
		int carry =0;
		YouTube.LinkedListNode.Node result = null;
		
	}
	public static void main(String[] args) {
		
		LinkedListNode l1 = new LinkedListNode();
		l1.append(1);
		l1.append(1);
		l1.append(4);
		l1.retrieve();
				
		LinkedListNode l2 = new LinkedListNode();
		l2.append(3);
		l2.append(7);
		l2.retrieve();
		
		
		
		/*YouTube.LinkedListNode.Node n = sumLists(l1.get2(1), l2.get2(1), 0); //여기서 n값이 나오고 
		
		//이거는 화면 호출
		while(n.next !=null) {
			System.out.print(n.data+"->");
			n=n.next;
		}
		
		System.out.println(n.data);*/
		
		YouTube.LinkedListNode.Node n2 = sumLists(l1.get2(1), l2.get2(1)); //여기서 n값이 나오고 
		
		
		
		while(n2.next !=null) {
			System.out.print(n2.data+"->");
			n2=n2.next;
		}
		System.out.println(n2.data);
		
		
		
		
	}
	
	
	private static YouTube.LinkedListNode.Node sumLists(YouTube.LinkedListNode.Node l1, YouTube.LinkedListNode.Node l2, int carry) {
		
		
		if(l1 ==null && l2 ==null && carry ==0) {
			return null;
		} //재귀함수의 반복을 멈추는 if문 
		
		YouTube.LinkedListNode.Node result = new YouTube.LinkedListNode.Node(); //결과를 담는 노드
				
		int value = carry; //carry의 값 뿐만아니라 data의 모든 합을 담는 value
		
		
		if(l1 !=null) {
			value += l1.data; //0+9
		}
		
		if(l2 !=null) {
			value += l2.data; //(0+9)+6
		}
		result.data = value%10; // 15%10 = 5;
		
		if(l1 !=null || l2 !=null) {
			YouTube.LinkedListNode.Node next = sumLists(l1== null? null:l1.next,l2 == null? null:l2.next,value >= 10? 1:0); //재귀
			
			result.next = next;
		}
		return result;
	}
	
	private static YouTube.LinkedListNode.Node sumLists(YouTube.LinkedListNode.Node l1, YouTube.LinkedListNode.Node l2) {
		
		
		int len1 = getListLength(l1); //각 노드의 길이를 측정한다.
		int len2 = getListLength(l2); //각 노드의 길이를 측정한다.
		
		
		if(len1<len2) {
			l1 = LPadList(l1, len2-len1);
		}else {
			l2 = LPadList(l2, len1-len2);
		}
		
		Storage storage = addLists(l1, l2);
		
		
		if(storage.carry !=0) {
			storage.result = insertBefore(storage.result, storage.carry);
		}
		return storage.result;
		
		
		
		
		
	}
	
	private static Storage addLists(YouTube.LinkedListNode.Node l1, YouTube.LinkedListNode.Node l2) {
		
		//맨끝으로 이동되면
		if(l1 == null && l2 == null) {
			Storage storage = new Storage(); //새로운 저장소를 선언
			return storage;
		}
		
		Storage storage = addLists(l1.next, l2.next); //재귀함수를 통해 노드의 가장 마지막으로 이동(마지막.next가 null이 될떄까지)
		
		
		int value = storage.carry + l1.data + l2.data; //그 저장소에다가 l1.data,l2.data,carry값을 더해줌 
		
		
		int data = value%10; //1 
		storage.result = insertBefore(storage.result, data); //1인 노드를 
		storage.carry = value/10; //1
		return storage;
	}
	
	//노드의 길이를 알려줌 노드가 있을때마다 tatal을 1씩 늘려주어 길이를 측정함 
	public static int getListLength(YouTube.LinkedListNode.Node l) {
		int total =0;
		while(l !=null) {
			total++;
			l=l.next;
		}
		return total;
		
	}
	
	public static YouTube.LinkedListNode.Node insertBefore (YouTube.LinkedListNode.Node node , int data){
		
		
		YouTube.LinkedListNode.Node before = new YouTube.LinkedListNode.Node(data);
		
		if(node !=null) {
			before.next = node; //0노드 다음으로 원래노드를 연결하여 
		}
		
		
		return before; //반환한다.
		
		
	}
	
	//노드와 길이값을 받아서 
	private static YouTube.LinkedListNode.Node LPadList(YouTube.LinkedListNode.Node l , int length) {
		YouTube.LinkedListNode.Node head = l; //
		
		for(int i=0; i<length; i++) {
			head = insertBefore(head, 0); //길이를 서로 비교헀을때 부족한쪽에다가 0노드를 마들어서 연결시킴 
		}
		
		return head;
		
	}
	
	
	
}
