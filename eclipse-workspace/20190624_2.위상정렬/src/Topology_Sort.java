import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

// 순서가 정해져 있는 작업을 차례로 수행해야 할 때 그 순서를 결정해주기 위해 사용하는 알고리즘
// **사이클이 발생하는 경우 위상정렬을 수행할 수 없습니다.
// 큐를 이용하는 방법, 스택을 이용하는 방법이 있지만 기본적으로 큐를 선호하므로 
// 큐를 이용하는 방법에 대해서 배워보겟다.

// 알고리즘 수행 방법

// 0. 진입차수를 배열에 넣어준다. (진입차수란? 1->2->3<-4 이라고 할때 2는 진입차수 1("1" 한개가 들어옴) , 3은 진입차수 2("2"와 "4" 두개가 들어옴 ))
// 1. 진입차수가 0인 정점을 큐에 삽입합니다.
// 2. 큐에서 원소를 꺼내 연결된 모든 간선을 제거합니다.
// 3. 간선 제거 이후에 진입차수가 0이된 정점을 큐에 삽입합니다.
// 4. 큐가 빌 때까지 2번~3번 과정을 반복합니다. 모든 원소를 방문하기 전에 큐가 빈다면 사이클이 존재하는 것이고, 모든 원소를 방문했다면 큐에서 꺼낸 순서가 위상 정렬의 결과입니다.



public class Topology_Sort {
	static int MAX = 10;
	static int[] inDegree = new int[MAX]; //0. 진입차수 배열에 넣어준다.
	static ArrayList<Integer>[] array = new ArrayList[MAX+1]; //배열을 선언해주고

	public static void main(String[] args) {
		
		for(int i=1; i<=MAX; i++) {
			array[i] = new ArrayList<Integer>(); // 각 배열마다 new 를 해줘야한다.
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
		int[] result = new int[MAX]; 
		Queue<Integer> q = new LinkedList<>() ;
		
		for(int i=1; i<=7; i++) {
			if(inDegree[i] ==0) q.add(i); //1. 진입차수가 0인 정점을 큐에 삽입합니다.
		}

		for(int i=1; i<=7; i++) {
			
			if(q.isEmpty()) { // 왜 Queue가 비어있으면 사이클일까? 그 이유는 위에서 inDegree[i]==0이 아니라는것은 
							  // 사이클 형태로 되어있기 떄문이다 즉 q.add를 할수 없으므로 q가 비어있으면 사이클이다.
				System.out.println("사이클이 발생했습니다"); 
				return;
			}

			int x = q.peek(); //q에 제일 처음걸 변수에 담고
									
			q.poll(); // q에 잇는걸 삭제한다.
			result[i] =x; //2. 큐에서 원소를 꺼내 연결된 모든 간선을 제거합니다.
			
			
			for(int j=0; j<array[x].size(); j++) {
				int y =array[x].get(j); //원소의 모든 간선을 가져온다.
					
				//3.연결되어있던 간선을 제거했고 간선의 수가 0일경우, 간선 제거 이후에 진입차수가 0이된 정점을 큐에 삽입합니다.  
				if(--inDegree[y]==0) { 
					q.add(y); //간선을 queue에 넣어준다.
				}
				
			}
		}
		
		for(int i=1; i<8; i++) {
			System.out.print(result[i]);
		}
	}

}




