package YouTube;

public class StackSort {

	//Stack을 정렬하는 함수를 만드시오, 단 하나의 Stack을 추가로 사용할수 있고 ,*Array등 다른 데이터 구조는 사용할수 없음

	//tip)두개의 Stack을 사용한다. 처음Stack을 pop해서 나온 값을 다른정렬의 값과 비교를 한다
	//이렇게 반복하다보면 다른 Stack이 오름차순으로 정렬되는데, 그것을 원래의 Stack으로 pop()해서 이동시키면 내림차순으로 정렬이 완성된다.

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		s1.push(3);
		s1.push(5);
		s1.push(1);
		s1.push(6);
		
		sort(s1);
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		
		
		
	}

	private static void sort(Stack<Integer>s1) {
		
		Stack<Integer> s2 = new Stack<Integer>();
		
		while(!s1.isEmpty()) {
			int temp = s1.pop();
			
			while(!s2.isEmpty() && s2.peek()>temp) {
				
				s1.push(s2.pop());
			}
			s2.push(temp);
		}
		
		while(!s2.isEmpty()) {
			s1.push(s2.pop());
		}
		
	}
}


