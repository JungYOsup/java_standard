public class Floyd_Warshall_Practice {
	
	
	static int number =4;
	static int INF = 100000;
	
	static int[][] array = {{0,5,INF,8},{7,0,9,INF},{2,INF,0,4},{INF,INF,3,0}};
	
	
	public static void main(String[] args) {
		
		Floyd_Warshall();
		
		
	}
	
	public static void Floyd_Warshall() {
		
		int[][] d = new int[number][number];
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length; j++) {
				
				d[i][j] = array[i][j];
			}
		}
		
		// k 는 지나가는 노드
		for(int k=0; k<array.length; k++) {
			
			// i는 시작점
			for(int i=0; i<array.length; i++) {
				// j 는 끝점
				for(int j=0; j<array.length; j++) {
					
					if(d[i][k]+d[k][j]<d[i][j]) {
						d[i][j] = d[i][k]+d[k][j];
					}
					
				}
			}
		}
		
		for(int i=0; i<number; i++) {
			for(int j=0; j<number; j++) {
				System.out.print(d[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}
