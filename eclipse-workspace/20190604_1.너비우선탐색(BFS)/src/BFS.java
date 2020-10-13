import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//너비 우선 탐색은 탐색을 할 때 너비를 우선으로 하여 탐색을 수행하는 탐색 알고리즘입니다.
//"맹목적인 탐색"을 할 때 사용할 수 있는 탐색 기법
//"최단 경로"를 찾아준다는 점에서 최단 길이를 보장
//준비물 Queue입니다.

//BFS(너비우선탐색) 는 맨 처음 시작노드를 큐에 삽입하면서 시작합니다.
//또한 시작노드를 방문헀다고 "방문 처리"해주도록 합니다.

//알고리즘 순서
//0. 맨처음에 시작 노드를 큐에 삽입  ->"방문처리"

//1. 큐에서 하나의 노드를 꺼낸다
//2. 해당 노드에 연결된 노드 중 방문하지 않은 노드를 방문하고, 차례대로 큐에 삽입힌다.
//(큐에 삽입할때 ->"방문처리")

//1,2 를 반복하다가 모든 노드가 방문처리되면 남은 노드를 큐에서 꺼내준다.

//이러한 BFS는 너비를 우선으로 하여 탐색한다는 특성이 중요한 것이고, 이를 이용해 다른 알고리즘에 적용한다는 것이 핵심입니다.



public class BFS {
	
	static int number = 7;
	static boolean[] c = new boolean[number]; //방문처리용
	static int[][] a = new int[8][8]; 
	
	public static void main(String[] args) {
		
		ArrayList<Integer> v = new ArrayList<>();
		
		
		
		
		
	}
	
	public static void BFS(int start) {
	Queue<Integer> q = new LinkedList<>();
	
	int n = a.length-1;
	
	q.add(start); // 맨처음 시작 노드를 큐에 삽입 
	c[start] = true; // 방문처리
	
	while(!q.isEmpty()) {
		
		int v =q.poll(); //큐에서 하나의 노드를 꺼낸다.
		System.out.println(v+" ");
		
		for(int i=0; i<n; i++) {
			
			int y = a[v][i]; //연관되어있는 노드를 찾는다.
			
			if(!c[y]) { // 해당 노드에 연결된 노드 중 방문하지 않은 노드를 방문하고
				q.add(y);//차례대로 큐에 삽입힌다.
				c[y] = true; //큐에 삽입할때 ->"방문처리"
			}
		}
		
		
	}
	
	
	}

}
