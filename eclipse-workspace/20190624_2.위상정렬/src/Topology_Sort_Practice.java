import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topology_Sort_Practice {

	static int MAX = 10;
	static int[] inDegree = new int[MAX];
	static ArrayList<Integer>[] array = new ArrayList[MAX+1];



	public static void main(String[] args) {
		
		for(int i=1; i<=MAX; i++) {
			array[i] = new ArrayList<Integer>();
		}

		array[1].add(2);
		inDegree[2]++;
		array[1].add(5);
		inDegree[5]++;
		array[2].add(3);
		inDegree[3]++;
		array[3].add(4);
		inDegree[4]++;
		array[4].add(6);
		inDegree[6]++;
		array[5].add(6);
		inDegree[6]++;
		array[6].add(7);
		inDegree[7]++;
		
		topologySort();
	}
	public static void topologySort() {
		int[] result = new int[8];
		Queue<Integer> q = new LinkedList<Integer>();

		for(int i=1; i<result.length; i++) {
			if(inDegree[i]==0) q.add(i);
		}

		if(q.isEmpty()) {
			System.out.println("사이클이 있습니다.");
			return;
		}

		for(int i=1; i<result.length; i++) {

			int x = q.peek();
			q.poll();
			result[i] = x;

			for(int j=0; j<array[x].size(); j++) {

				int y = array[x].get(j);

				if(--inDegree[y]==0) {
					q.add(y);
				}
			}

		}

		for(int i=1; i<8; i++) {
			System.out.print(result[i]);
		}





	}


}
