import java.util.Arrays;

// 다익스트라 알고리즘은 최단 경로 알고리즘  = greedy 알고리즘이라고도 불림
// 다익스트라 알고리즘은 다익나믹 프로그래밍 문제이다.
// 그 이유는 a->b->c->d 가 a->d까지 가는 최단경로라 할때 a->c까지 가는것도 최단경로 이다.

// Kruskal 는 
// Kruskal 은 A->B->C->D 까지 최단경로(최소비용)

// Dijkstra 는 **한 정점으로부터 각 정점으로까지의 최단거리 
// 즉 A가 한 정점이라 하면 A->B 의 최단거리 A->C의 최단거리 A->D의 최단거리 

// 구체적인 작동과정 
// 1. 출발 노드를 선정합니다
// 2. 출발 노드를 기준으로 각 노드의 최소비용을 저장합니다 //2차원 배열로
// 3. 방문하지 않은 노드 중에서 가장 비용이 적은 노드를 선택합니다. 
// 4. 해당 노드를 거쳐서 특정한 노드로 가는 경우를 고려하여 최소 비용을 갱신합니다. // [0,2,5,1,무한,무한] -> [0,2,4,1,2,무한] 
// 이렇게 하는 이유는 컴퓨터는 1->4->3으로 가는 비용이 더 적은지 1->3으로 바로 가는게 적은지 알길이 없으므로 컴퓨터가 알게해줌을 위함
// 5. 위 과정에서 3~4번을 반복합니다.

// 그리고 이러한 그래프는 이차원 배열 형태로 처리해야한다.

// 하지만 이 알고리즘은 시간 복잡도가 O(N^2)으로 형성 된다.
// 최대한 빠르게 작동시켜야 하는 경우 힘구조를 활용하여 시간복잡도가 O(N*logN)을 만들 수 있습니다.
// 그리고 이 소스코드의 경우 정점읙 갯수가 많은데 간선은 적을때 치명적일 정도로 비 효율적으로 작동할 수 있습니다.

public class Dijkstra {
	
	static int INF = 10000000;
//	static int[][] array = {{0,2,5,1,INF,INF},{2,0,3,2,INF,INF},{5,3,0,3,1,5},{1,2,3,0,1,INF},{INF,INF,1,1,0,2},{INF,INF,5,INF,2,0}};
	static int[][] array = {{0,5,INF,8},{7,0,9,INF},{2,INF,0,4},{INF,INF,3,0}};
	static boolean[] v = new boolean[array.length]; //방문한 노드
	static int[] d = new int[array.length]; // 거리입니다.
	
			
	public static void main(String[] args) {
		
			
			dijkstra(1);
			
			for(int i=0; i<d.length; i++) {
				System.out.print(d[i]);
			}
			System.out.println();
			
		
		
	}
	
	// 가장 최소 거리를 가지는 정점을 반환합니다.
	public static int getSmallIndex() {
		int min = INF;
		int index = 0;
		
		for(int i=0; i<array.length; i++) {
			if(d[i]<min && !v[i]) { //만약 길이가 가장 짧고 방문하지 않았으면
				min = d[i]; 
				index = i;
			}
		}
		return index;
	}
	
	public static void dijkstra(int start) {//1.출발 노드를 선정합니다
		for(int i=0; i<array.length; i++) {
			d[i] = array[start][i]; //{0,2,5,1,무,무} -> [0,2,4,1,2,무한] // 2.출발 노드를 기준으로 각 노드의 최소비용을 저장합니다
		}
		v[start] = true; 
		
		for(int i=0; i<array.length-2; i++) {
			int current = getSmallIndex(); //3.방문하지 않은 노드 중에서 가장 비용이 적은 노드를 선택합니다. 
			v[current] = true; //방문한 노드 
			for(int j=0; j<array.length; j++) {
				if(!v[j]) { 
					if(d[current] + array[current][j] < d[j]) {
						d[j] = d[current] + array[current][j]; //4.해당 노드를 거쳐서 특정한 노드로 가는 경우를 고려하여 최소 비용을 갱신합니다.
					}
				}
			}
			
		}
	}
	
	
}
