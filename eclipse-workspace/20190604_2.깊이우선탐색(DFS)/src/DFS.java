//깊이 우선탐색은 탐색을 함에 있어서 보다 깊은 것을 우선적으로 하여 탐색하는 알고리즘 입니다.
//이러한 깊이 우선 탐색은 명목적으로 각 노드를 탐색할때 주로 사용됩니다.
//깊이 우선탐색은 stack을 사용합니다.
//허나 stack을 사용하지 않고도 깊이 우선탐색을 구현할수 있다.
//어떻게? 컴퓨터는 구조적으로 스택의 원리를 사용하기 때문에 재귀함수로 깊이우선탐색을 구할수 있다.(이게 더 빠름)

//동작방식
//먼저 시작노드를 stack에 넣고 방문처리

//반복동작 
//2.스택의 최상단 노드를 확인합니다.
//3.그 최상단 노드를 꺼내서 방문하지 않은 인접노드가 있으면 그 노드를 스택에 넣고 방문처리를 합니다.
//방문하지 않은 읹은 노드가 없으면 스택에서 최상단 노드를 뺍니다.

//나중에 DFS를 활용해서 문제를 해결하고자 하는 것에 주안점을 두어져 있으므로
//작동 원리에 대해서만 빠삭하게 이해하면 된다.
//또한 스택을 직접 사용하지 않고 재귀함수를 이용해 간랸하게 함수를 구현할수 있다


public class DFS {
	
	static int number = 7;
	static boolean c[] = new boolean[number];
	static int a[][] = new int[8][8];
	public static void main(String[] args) {
		
		
	}
	
	public static void DFS(int x) {
		if(c[x]) return;
		
		c[x] = true; //방문처리
		
		System.out.println(x);
		
		for(int i=0; i<a.length-1; i++) {
			int y= a[x][i]; //인접노드를 다 찾아
			DFS(y);//DFS를 재귀적으로 실행
		}
		
		
	}
}
