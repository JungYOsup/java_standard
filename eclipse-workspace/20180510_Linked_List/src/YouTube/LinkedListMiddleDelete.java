package YouTube;

import YouTube.LinkedListNode.Node;

public class LinkedListMiddleDelete {
	
	//알고리즘 문제1] 중간의 노드를 삭제하시오 단. 나는 삭제할 이전 노드를 알지못하고 오로지 삭제할 노드만 안다.
	//: 이 문제 해결방법. 기존에는 삭제할 노드가 있으면 그 노드 이전 노드의 주소를 다음다음 노드랑 연결시키면서 문제를 해결했지만
	// 이전노드의 주소를 알지 못하므로 이 방법은 옳지 않다. 따라서 삭제할 노드는 그 다음 노드의 주소를 가지고 있으므로 삭제할 다음노드의 값과 주소를 삭제할 노드에 덮어 씌우면 왼다.
	// ex) 3을 지우시오 : 1->2->3->4->5라고 하면 1->2->4->4->5 로 3번째 index를 2번째 index로 덮어 씌운다음 3번째 index(즉 4번쨰 값)을 지우면 된다.
	
	
	public static void main(String[] args) {
		
		LinkedListNode ll = new LinkedListNode();
		ll.append(2);
		ll.append(4);
		ll.append(6);
		ll.append(8);
		ll.append(10);
		ll.retrieve();
		
		deleteNode(ll.get(2));
		ll.retrieve();
		
		
	}
	
	public static boolean deleteNode(YouTube.LinkedListNode.Node n) {
		
		//노드가 존재하지 않거나 , 마지막 노드일때는 안된다. 
		if(n == null || n.next ==null) {
			return false;
		}
		
		Node next = n.next;
		n.data=next.data;
		n.next=next.next;
		
	
		return true;
	}
	
	
	

}
