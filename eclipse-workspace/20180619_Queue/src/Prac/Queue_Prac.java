package Prac;

import java.util.NoSuchElementException;

//FIFO(선입선출)
//값추가,값 가져오기,값 삭제 , 
public class Queue_Prac {


	Node first;
	Node last;
	int size;

	public Queue_Prac() {

		first = null;
		last  = null;
		size =0;
	}

	public void pushFirst(int newData) {

		Node newNode = new Node(newData);
		first = newNode;
		last = newNode;
		size++;
	}

	public void push(int newData) {

		if(size==0) {
			pushFirst(newData);
		}else {

			Node newNode = new Node(newData); 

			last.next= newNode;
			last = newNode;
			size++;
		}

		/*Node newNode = new Node(newItem);

		if(size==0) {
			front = newNode;
		}else {
			rear.next = newNode;

		}
		rear =newNode;
		size++;*/





	}



	public int peek() {

		if(size==0) {

			throw new NoSuchElementException();
		}

		return first.data;
	}


	public int pop() {


		if(size==0) {

			throw new NoSuchElementException();
		}

		int DeleteValue = first.data;
		first = first.next;
		size--;

		return DeleteValue;


	}





}

class Node{

	int data;
	Node next;

	public Node(int newData) {

		data =newData;
		next =null;
	}

}




