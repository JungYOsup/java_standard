package Prac;

public class Main {

	public static void main(String[] args) {
		
		Queue_Prac queue = new Queue_Prac();
		
		queue.push(4);
		queue.push(5);
		queue.push(6);
		queue.push(7);
		queue.push(8);
		System.out.println(queue.pop());
		System.out.println(queue.pop());
		System.out.println(queue.peek());
		
		
	}
}
