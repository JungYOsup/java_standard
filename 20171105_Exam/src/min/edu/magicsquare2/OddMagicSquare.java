package min.edu.magicsquare2;


//홀수 마방진을 구하는 클래스 
public class OddMagicSquare {
	
	private int[][] magic;
	public OddMagicSquare(int n) {
		magic = new int[n][n];
	}
	
	public void makeMagic() {
		int n =magic.length;
		int x =0;
		int y =n/2;
		magic[x][y]=1;
		
		for (int i = 2; i <= magic.length*magic.length; i++) {
			int tempX = x;
			int tempY =y;
			if(x-1<0) {
				x=n-1;
			}else {
				x=x-1;
			}
			if(y-1<0) {
				y=n-1;
			}else {
				y=y-1;
			}
			
			if(magic[x][y]!=0) {
				x = tempX +1;
				y = tempY;
				
			}
			
			magic[x][y] = i;
			
			
		}
		
		
		
		
	}

	public int[][] getMagic() {
		return magic;
	}

}
