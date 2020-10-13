import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//문제 예시가 잘 이해가 안된다.

public class Topology_1516 {
	static int MAX = 501;
	static ArrayList<Integer>[] array = new ArrayList[MAX];
	static int[] InDegree = new int[MAX];
	static int[] Time = new int[MAX];

	public static void main(String[] args) {

		for(int i=0; i<array.length; i++) {
			array[i] = new ArrayList<>();
		}

		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();

		for(int i=1; i<=num; i++) {

			int time = scan.nextInt();
			
			Time[i] = time;
			
			for(int j=0; j<num; j++) {

				int index = scan.nextInt();

				if(index == -1) break;

				InDegree[i]++;
				array[index].add(i);



			}

		}

		Topology_1516(num);


	}

	public static void Topology_1516(int num) {

		int[] result = new int[num+1];
		
		Queue<Integer> q = new LinkedList<Integer>();
		
		for(int i=1; i<=num; i++) {
			result[i] = Time[i];
			if(InDegree[i] == 0) q.add(i);
		}
		
		for(int i=1; i<=num; i++) {
			
			if(q.isEmpty()) {
				return; 
			}
			
			int x = q.peek();
			q.poll();
			
			
			for(int j=0; j<array[x].size(); j++) {
				int y = array[x].get(j);
				
				System.out.println(y);

				result[y] += Time[i];
						
				if(--InDegree[y]==0) {
					q.add(y);
				}
				
			}
			
			
		}
		
		for(int i=1; i<=num; i++) {
			System.out.println(result[i]);
		}
	
	}

}
