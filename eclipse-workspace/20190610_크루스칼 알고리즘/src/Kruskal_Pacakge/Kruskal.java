package Kruskal_Pacakge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

// 크루스칼 알고리즘은 가정 적은 비용으로 모든 노드를 연결하기 위한 알고리즘
// 흔히 여러개의 도시가 있을때 각 도시를 도로를 이요해 연결 하고자 할 때 비용을 최소한으로 하고자 할때 적용되는 알고리즘 
// 한가지 특징은  노드갯수 - 1 = 간선숫자 
// 즉 모든 7개 노드를 연결하기 위해서는 6개의 간선이 필요하다.

//크루스칼 알고리즘의 핵심 개념은 ? -> 간선을 거리가 짧은 순서대로 그래프에 포함시킨다.

// 모든 노드를 최대한 적은 비용으로 연결만 시키면 되기 때문에 모든 간성 정보를 오름차순으로 정렬한 뒤에 비용이 적은 간선부터 차근차근 그래프에 포함시키면 된다.

// 단 주의사항은 사이클이 형성되면 안된다!! ( 사이클은 블로그 참조 ) 

// 최소비용 신장트리 
// 1. 모든 간선들의 정보를 저장하는 노드를 만든다. //Edge Class
// 2. 모든 간선들을 거리(비용)을 기준으로 먼저 오름차순으로 정렬을 수행한다. //Arraylist에 넣어준다음 Colletions.sort의 Comparator을 이용한다.
// 3. 정렬된 순서에 맞게 그래프에 포함시킨다. // 갯수에 맞게 배열을 만들어 주고 배열의 번호마다 같은 값을 넣어줌
// 4. 포함시키기 전 사이클 테이블을 확인한다. // FindParent로 사이클테이블인지를 확인한후 
// 5. 사이클을 형성하는 경우 간선을 포함하지 않는다. // 사이클이 아닌경우 연결시킨다.

// 일단 쿠르스칼의 사이클의 발생여부는 Union-Find 알고리즘을 그래도 사용하면 된다.
// 사이클이 발생하는지는 - Find 작업
// 단순하게 연결이 된 이후에는 - Union 작업


public class Kruskal {

	public static void main(String[] args) {
		
		ArrayList<Edge> v = new ArrayList<>();
		
		
		//C에서 push_back 역할을 대신 해주는게 Arraylist의 add
		
		
		//1. 모든 간선들의 정보를 저장하는 노드를 만든다. 
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
		
		//2. 간선의 비용을 기준으로 오름차순 정렬
		//Arraylist는 Collection.sort로 오름차순을 하는데 내가 만든 클래스를 타입으로 사용해줬으므로 Comparator을 이용해 조정해줘야한다.
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
		
		
		for(Edge a : v) {
			System.out.println(a.distance);
		}
		
		//3. 정렬된 순서에 맞게 그래프에 포함시킨다.
		
		int Num=v.size(); //11
		int[] parent = new int[Num+1]; //
		
		for(int i=1; i<parent.length; i++) {
			parent[i] = i;
		}
		
		int sum =0;
		
		// 4. 포함시키기 전 사이클 테이블을 확인한다.
		for(int i=0; i<v.size(); i++) {
			//사이클이 발생하지 않는 경우 그래프에 포함 // 즉 FindParent가 false일때 
			if(!FindParent(parent, v.get(i).node[0], v.get(i).node[1])) {
				sum += v.get(i).distance;
				UnionParent(parent, v.get(i).node[0] , v.get(i).node[1]);
			}
		}
		
		System.out.println(sum);
		
	}
	
	
	
	//같은 부모로 만드는 메서드
	public static int getParent(int[] parent , int a) {
		if(parent[a] == a ) return a;
		return parent[a] = getParent(parent, parent[a]);
		
	}
	
	//노드를 연결시키는 메서드
	public static void UnionParent(int[] parent, int a , int b ) {
		
		int x = getParent(parent, a);
		int y = getParent(parent, b);
		
		if(x<y) parent[y] = x;
		else parent[x] = y;
		
		
	}
	//같은 부모인지를 찾는 메서드
	public static boolean FindParent(int[] parent, int a , int b) {
		
		int x = getParent(parent, a);
		int y = getParent(parent, b);
		
		if(x==y) return true;
		else return false;
	}

}

