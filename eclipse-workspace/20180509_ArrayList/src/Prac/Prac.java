package Prac;

import java.util.NoSuchElementException;

public class Prac {
	
	public static void main(String[] args) {
		
		ArrayListPrac a = new ArrayListPrac();
		
		a.insert(0, 1);
		a.insert(1, 2);
		a.insert(2, 3);
		a.insert(3, 4);
		a.insert(4, 5);
		
		System.out.println(a.remove(4));
		System.out.println(a.remove(3));
		System.out.println(a.remove(0));
		System.out.println(a.remove(0));
		
		a.toStringPrac();
		
		
		
		
		
	}

}

class ArrayListPrac{

	public int[] array;
	public int size;

	public ArrayListPrac() {

		array = new int[1];
		size =0;

	}

	public int peek(int num) {

		return array[num];				
	}

	public void insertLast(int num) {

		if(array.length==size) {

			resize(2*array.length);
		}

		array[size++] = num;


	}

	public void insert(int index , int num) {

		if(size==0) {
			insertLast(num);
			
		}else {
		
			if(array.length==size) {

				resize(2*array.length);
				
			}
			
			for(int i=size-1; i>=index; i--) {
				
				array[i+1] = array[i];
				
			}
			array[index] = num;
			size++;

		}
				
				
	}
	
	public int remove(int index) {
		
		if(size==0) {
			throw new NoSuchElementException();
		}

		int deleteValue = array[index];
		
		for(int i=index; i<size; i++ ) {
			
			array[i] = array[i+1];
		}
		
		
		size--;
	 
		if(size>0&&size<array.length/2) {
			resize(array.length/2);
		}
				
		return deleteValue;
		
	}

	public void resize(int NewSize) {

		int[] NewArray = new int[NewSize];

		for(int i=0; i<size; i++) {
			NewArray[i] = array[i];
		}

		array = NewArray;


	}
	
	public void toStringPrac() {
		
		for(int i : array) {
			
			System.out.print(i+",");
		}
		
	}







}