//합집합 찾기의 조건
	//1. 부모를 판별하는 함수
	//2. 부모를 같게 만드는 함수
	//3. 같은 부모인지 찾는 함수


public class Union_Find_Prac2 {

	public static void main(String[] args) {
		
		int[] parent = new int[9];
		
		for(int i=1; i<parent.length; i++) {
			parent[i] = i;
		}
		
		UnionParent(parent, 1, 2);
		UnionParent(parent, 2, 3);
		UnionParent(parent, 3, 4);
		UnionParent(parent, 5, 6);
		UnionParent(parent, 6, 7);
		UnionParent(parent, 7, 8);

		System.out.println("1과 5가 연결되었습니까?");

		System.out.println(FindParent(parent, 1, 5));

		
		UnionParent(parent, 1, 5);
		System.out.println("1과 5가 연결되었습니까?");
		System.out.println(FindParent(parent, 1, 5));

	}
	
	
	
	
	
	public static int getParent(int[] parent , int x) {
		
		if(parent[x] == x ) return x;
		return parent[x]= getParent(parent, parent[x]);
		
	}
	
	public static void UnionParent(int[] parent , int x , int y) {
		int a = getParent(parent, x);
		int b=  getParent(parent, y);
		
		if(a>b) parent[b] = a;
		else parent[a] = b;
		
	}
	
	public static int FindParent(int[] parent, int x , int y) {
		int a = getParent(parent, x);
		int b=  getParent(parent, y);
		
		if(a==b) return 1;
		else return 0;
	}

}
