package min.edu.magicsquare;


//홀수 마방진을 만드는 클래스 
public class OddMagicSquare extends MagicSquareImpl {
	
	/*private int[][] magic;*/
	
	public OddMagicSquare(int n) {
		super(n);
		/*magic = new int[n][n];*/
	
	}
	//홀수 마방진을 만드는 메소드 (x가 0보다 작을때 길이를 더해준다 ,y가 0보다 작을때 길이를 더해준다, 값이 존재할때 원래 위치되어있는 위치에다가 x는 +1 y는 그대로둔다)
	
	/*public int[][] getMagic() {
		return magic;
	}*/

	public void makeMagic() {
		int n =magic.length;
		int x=0;
		int y=n/2;
		magic[x][y]=1;
		
		for (int i = 2; i <= n*n; i++) {
			
			int tempX = x;
			int tempY = y;
			if(x-1<0) {
				x = n-1;
			}
			else {
				x= x-1;
				
			}
			
			if(y-1<0) {
				y = n-1;
				
			}
			else {
				y = y-1;
			}
			
			if(magic[x][y]!=0) {
				
				x =tempX +1;
				y =tempY;
			}
			
			magic[x][y] =i;
			
			
			
		}
		
	}

}
