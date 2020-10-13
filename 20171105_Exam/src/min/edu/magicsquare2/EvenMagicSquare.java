package min.edu.magicsquare2;

//짝수(2를제외)의 마방진을 구하는 메소드
public class EvenMagicSquare {
	private int[][] magic;
	public EvenMagicSquare(int n) {
		magic = new int[n][n];
	}
	
	
	
	
	public int[][] getMagic() {
		return magic;
	}




	public void makeMagic() {
		makeA();
		makeB();
		
	}
	// 배열의 범위를 정해서 위치를 바꾸느 메소드
	public void makeB() {
		 int n = magic.length;
		 for (int x = 0; x < magic.length; x++) {
			 for (int y = 0; y < magic.length; y++) {
				 if(x>=0 && x<n/4 || x>=n/4*3 && x<n) {
					 if(y>=n/4 && y<n/4*3) {
						 magic[x][y] = (n*n)-(x*n+y);
					 }
				 }else if(y>=0 && y<n/4 || y>=n/4*3 && y<n) {
					 magic[x][y] = (n*n)-(x*n+y);
				 }
				
			}
			
		}
	}
	
	//1~최대일수*2까지를 배열에 넣는 메소드
	public void makeA() {
		int n = magic.length;
		for (int i = 0; i < magic.length*magic.length; i++) {
			
			magic[i/n][i%n] = i+1;
		}
		
	}

}
