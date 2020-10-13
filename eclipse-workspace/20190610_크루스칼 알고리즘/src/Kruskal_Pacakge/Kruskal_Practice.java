package Kruskal_Pacakge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Kruskal_Practice {
	
	// 최소비용 신장트리 
	// 1. 모든 간선들의 정보를 저장하는 노드를 만든다. //Edge Class
	// 2. 모든 간선들을 거리(비용)을 기준으로 먼저 오름차순으로 정렬을 수행한다. //Arraylist에 넣어준다음 Colletions.sort의 Comparator을 이용한다.
	// 3. 정렬된 순서에 맞게 그래프에 포함시킨다. // 갯수에 맞게 배열을 만들어 주고 배열의 번호마다 같은 값을 넣어줌
	// 4. 포함시키기 전 사이클 테이블을 확인한다. // FindParent로 사이클테이블인지를 확인한후 
	// 5. 사이클을 형성하는 경우 간선을 포함하지 않는다. // 사이클이 아닌경우 연결시킨다.

	public static void main(String[] args) {
		
		ArrayList<Edge> v = new ArrayList<>();
		
		v.add(new Edge(1,7,12));
		v.add(new Edge(1,4,28));
		v.add(new Edge(1,2,67));
		v.add(new Edge(1,5,17));
		v.add(new Edge(2,4,24));
		v.add(new Edge(2,5,62));
		v.add(new Edge(3,5,20));
		v.add(new Edge(3,6,37));
		v.add(new Edge(4,7,13));
		v.add(new Edge(5,6,45));
		v.add(new Edge(5,7,73));
		
		Collections.sort(v, new Comparator<Edge>() {

			@Override
			public int compare(Edge o1, Edge o2) {
				if(o1.distance>o2.distance) {
					return 1;
				}else if(o1.distance<o2.distance) {
					return -1;
				}else {
					return 0;
				}
				
			}
		});
		
		int Num = v.size(); //11 
		int[] parent = new int[Num+1]; //12
		
		for(int i=1; i<parent.length; i++) {
			parent[i] = i;
		}
		
		int sum =0;
		
		for(int i=0; i<v.size(); i++) {
			//사이클이 아니면
			if(!FindParent(parent, v.get(i).node[0], v.get(i).node[1])) {
				sum += v.get(i).distance;
				UnionParent(parent, v.get(i).node[0], v.get(i).node[1]);
			}
		}
					

	}
	
	public static int getParent(int[] parent, int a) {
		if(parent[a] == a ) return a;
		return parent[a] = getParent(parent, parent[a]);
	}
	
	public static void UnionParent(int[] parent, int a , int b) {
		int x = getParent(parent, a);
		int y = getParent(parent, b);
		
		if(x>y) parent[x] = y;
		else parent[y] = x;
	}
	
	public static boolean FindParent(int[] parent, int a, int b) {
		int x = getParent(parent, a);
		int y = getParent(parent, b);
		
		if(x==y) return true;
		else return false;
	}

}
