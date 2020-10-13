import java.util.Arrays;

//대표적인 그래프 알고리즘이며
//합집합 찾기라는 의미를 가진 알고리즘이다.
//서로소 집합 알고리즘이라고 부릅니다. (서로소란 공통인 원소가 없는 둘 이상의 집합 관계를 서로소라고 한다)
//여러개의 노드가 존재할때 두개의 노드를 선택하여 현재 이 *두 노드가 서로 같은 그래프에 속하는지 판별하는 알고리즘


public class Union_Find {

	public static void main(String[] args) {
		int[] parent = new int[11];
		
		//각 부모의 자신의 값을 준다.
		for(int i=1; i<=10; i++) {
			parent[i] =i;
		}
		
		
		UnionParent(parent, 1, 2);
		UnionParent(parent, 2, 3);
		UnionParent(parent, 3, 4);
		UnionParent(parent, 5, 6);
		UnionParent(parent, 6, 7);
		UnionParent(parent, 7, 8);
		System.out.println("1과5는 연결되어있나요");
		System.out.println(findParent(parent, 1, 5));
		
		UnionParent(parent, 1, 5); //ref를 이용하였기 때문에 	UnionParent(parent, 1, 5) 를 했어도 1과 5만 연결된것이 모두 연결된것을 알수 있다.
		System.out.println("5과6는 연결되어있나요");
		System.out.println(findParent(parent, 1,8));
		System.out.println("8의 부모는?");
		System.out.println(parent[8]);
		
		
	}
	
	
	//부모 노드를 찾는 함수
	public static int getParent(int parent[], int x) {
		if(parent[x] ==x ) return x; //재귀함수 종료
		return parent[x]=getParent(parent, parent[x]);
	
	}
	
	//두 부모 노드를 합치는 함수
	public static void UnionParent(int parent[], int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a<b) parent[b] =a;
		else parent[a] = b;
	}
	
	//같은 부모를 가지는지 확인(=같은 그래프에 있는지 확인)
	
	public static int findParent(int parent[], int a ,int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if(a==b) return 1; //연결되어있으면 1
		return 0;//연결 안되어있으면 0을 반환
	}

}
