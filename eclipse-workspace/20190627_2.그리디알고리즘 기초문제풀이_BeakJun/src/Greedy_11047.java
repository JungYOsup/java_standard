import java.util.Scanner;
import java.util.Stack;

public class Greedy_11047 {

	static Stack<Integer> stack = new Stack<>();
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int cost = scan.nextInt();
		
		for(int i=0; i<num; i++) {
			int value = scan.nextInt();
			stack.push(value);
		}
		
		Greedy_11047(cost);
		
		

	}
	
	public static void Greedy_11047(int cost) {
		
		int money = cost;
		int sum=0;
	
		while(!stack.isEmpty()) {
			sum += money / stack.peek();
			money = money % stack.pop();
		}
		
		
		System.out.println(sum);
		
		
		
	}

}
