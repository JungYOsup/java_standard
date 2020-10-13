
public class Union_Find_Prac {


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

		
		UnionParent(parent, 1, 6);
		System.out.println("1과 5가 연결되었습니까?");
		System.out.println(FindParent(parent, 1, 5));
	}



	//1.부모를 노드를 찾는 함수
	public static int getParent(int[] parent , int x) {
		if(parent[x]==x) return x;
		return parent[x] = getParent(parent, parent[x]);
	}


	//2.두 부모노드를 합치는 함수

	public static void UnionParent(int[] parent , int a , int b) {
		int x = getParent(parent, a);
		int y = getParent(parent, b);

		if(x<y) parent[y]=x;
		else parent[x]=y;
	}

	//3.두 노드가 같은 노드인지를 판별하는 함수
	public static int FindParent(int[] parent , int a , int b) {
		int x = getParent(parent, a);
		int y = getParent(parent, b);

		if(x==y) return 1;
		else return 0;
	}
}
