
public class OddMagicSquare extends MagicSquareimpl {
	
   /*private int[][] magic;*/
	
	public OddMagicSquare(int n) {
		super(n);
		/*magic = new int[n][n];*/
	}
	
	
	//3방진을 만드는 메소드
	public void makeMagic() {
		
		int x =0;
		int n = magic.length;
		int y =n/2;
		
		magic[x][y] =1;
		
		for (int i = 2; i <= magic.length*magic.length; i++) {
			int tempX = x;
			int tempY = y;
			if(x-1<0) {
				x=n-1;
			}
			else {
				x=x-1;
			}
			
			if(y-1<0) {
				y=n-1;
			}
			else {
				y=y-1;
			}
			
			if(magic[x][y]!=0) {
				x = tempX +1;
				y = tempY;
			}
			
			magic[x][y] =i;
			
			
		}
	}


	/*public int[][] getMagic() {
		return magic;
	}*/

}
