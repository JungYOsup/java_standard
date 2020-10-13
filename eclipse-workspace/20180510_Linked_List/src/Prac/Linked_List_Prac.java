package Prac;

import java.util.NoSuchElementException;

public class Linked_List_Prac {


	Node head;
	Node tail;
	int size;

	public Linked_List_Prac() {

		head = null;
		tail = null;
		size =0;
	}

	public void firstadd(int data) {

		Node NewNode = new Node();

		NewNode.next=head;
		head = NewNode;
		NewNode.data=data;

		if(head.next==null) {
			tail=NewNode;
		}

		size++;

	}
	public void lastadd(int data) {

		Node NewNode = new Node();

		if(size ==0) {
			firstadd(data);

		}else {

			tail.next = NewNode;
			tail = NewNode;
			size++;

		}

	}

	public Node move(int index) {

		Node thisNode = head;

		for(int i=0; i<index; i++) {

			thisNode=thisNode.next;

		}

		return thisNode;

	}

	public void add(int index, int data) {

		if(index==0 || size==0) {
			firstadd(data);
		}else {

			Node NewNode = new Node();
			NewNode.data = data;

			Node temp1 = move(index-1);
			Node temp2 = temp1.next;

			temp1.next = NewNode;
			NewNode.next = temp2;

			size++;

			if(NewNode.next == null) {
				tail = NewNode;
			}


		}

	}

	public int peek(int index) {

		if(size==0) {

			throw new NoSuchElementException();
		}

		Node thisNode = move(index);

		return thisNode.data;



	}
	public int removeFirst() {

		if(size==0) {
			throw new NoSuchElementException();
		}
		
		int DeleteValue = head.data;
		head = head.next;
		size--;
		if(head ==null) {
			System.out.println("다 지워졌습니다.");
		}
		
		return DeleteValue;

	}

	public int remove(int index) {

		
		if(size==0) {

			throw new NoSuchElementException();
		}
		
		if(index==0) {
			return removeFirst();
		}else {
			
			Node temp1 = move(index-1);
			int deleteValue = temp1.next.data;
			temp1.next = temp1.next.next;
			
			if(temp1.next==null) {
				
				tail = temp1;
			}
			size--;
			
			return deleteValue;
			
		}
		
			


	}

	public Object removeLast() {

		return remove(size-1);
	}




	public void String_Prac() {

		for(int i=0; i<size; i++) {

			Node thisNode= new Node();
			thisNode = move(i);

			System.out.print(thisNode.data+",");


		}
	}





}

//노드에는 데이터를 담는 변수와 그 다음노드를 가리키는 변수가 존재한다.


class Node{

	int data;
	Node next;

	public Node() {

		data = 0;
		next = null;

	}






}
