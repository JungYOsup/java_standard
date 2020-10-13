import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem_1158_조세퍼스 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		Queue<Integer> queue = new LinkedList<>();
		int n = scan.nextInt();
		int k = scan.nextInt();

		for(int i=1; i<=n; i++) {
			queue.add(i);
		}

		for(int i=0; i<n-1; i++) {
			for(int j=0; j<k-1; j++) {
				queue.add(queue.poll());
			}
			sb.append(queue.poll()+", ");

		}
		sb.append(queue.poll()+ ">");
		System.out.println(sb);

	}
}