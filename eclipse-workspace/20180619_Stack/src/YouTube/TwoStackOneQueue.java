package YouTube;


//두개의 stack으로 하나의 queue으로 만듬

//1개 stack은 값을 넣는 용도
//또다른 stack은 peek과 remove 

// (1)첫번째 stack = 1-2-3 (add할때는 가장 처음에 들어갔던것이)
// (2)peek()을 하면 
// (3)두번째 stack = 3-2-1 순서로 저장됨 (remove할때는 가장 마지막에 나오므로) 즉 가장 처음에 들어간것이 가장 먼저 제거되므로 FIFO형태(즉 queue형태)

public class TwoStackOneQueue {
	
	public static void main(String[] args) {
		
		MyQueue<Integer> q = new MyQueue<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		
		System.out.println(q.peek());
		
	}
	
	


}

class MyQueue<T>{
	
	Stack<T> stackNewest , stackOldest;
	
	public MyQueue() {

		stackNewest = new Stack<T>();
		stackOldest = new Stack<T>();
	}
	
	public int size() {
		
		return stackNewest.size() + stackOldest.size();
	}
	
	public void add(T value) {
		stackNewest.push(value);
	}
	
	public void shiftStacks() {
		
		if(stackOldest.isEmpty()) {
			
			while(!stackNewest.isEmpty()) {
				stackOldest.push(stackNewest.pop());
			}
		}
		
	}
	public T peek() {
		shiftStacks();
		return stackOldest.peek();
	}
	
	public T remove() {
		shiftStacks();
		return stackOldest.pop();
		
		
	}
	
}


