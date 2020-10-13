import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Topology_2252 {

	static int MAX =32001; 
	static ArrayList<Integer>[] array = new ArrayList[MAX];
	static int[] InDegree = new int[MAX];

	public static void main(String[] args) 
	{
		for(int i=1; i<array.length; i++) {
			array[i] = new ArrayList<>();
		}


		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int m = scan.nextInt();


		for(int i=0; i<m; i++) {

			int a=scan.nextInt();
			int b=scan.nextInt();

			if(a>n||b>n) {
				System.out.println("입력값이"+n+"보다 클수 없습니다.");
				return;
			}

			array[a].add(b);
			InDegree[b]++;


		}

		Topology_2252(n);


	}

	public static void Topology_2252(int n) {

		int[] result = new int[n+1];
		Queue<Integer> q = new LinkedList<>();

		for(int i=1; i<=n; i++) {
			if(InDegree[i] == 0 ) q.add(i);
		}
		
		for(int i=1; i<=n; i++) {
			
			if(q.isEmpty()) {
				System.out.println("사이클이 발생했습니다"); 
				return;
			}
			
			int x = q.peek();
			q.poll();
			result[i]=x;
			
			for(int j=0; j<array[x].size(); j++) {
				
				int y = array[x].get(j);
				
				if(--InDegree[y]==0) {
					q.add(y);
				}				
				
			}
		}
		
		for(int i=1; i<=n; i++){
			System.out.print(result[i]);
		}
		
	}
	
}
