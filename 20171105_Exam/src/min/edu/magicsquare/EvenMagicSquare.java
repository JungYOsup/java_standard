package min.edu.magicsquare;

public class EvenMagicSquare extends MagicSquareImpl {
	/*private int[][] magic;*/
	
	public EvenMagicSquare(int n) {
		super(n);
		/*magic = new int[n][n];*/
	}
	
	
	public void makeMagic() {
		makeA();
		makeB();
		
	}
	/*public int[][] getMagic() {
		return magic;
	}*/


	// 배열의 위치를 잡아주고 자리를 바꾸는 메소드
	public void makeB() {
		int n = magic.length;
		
		for (int x = 0; x < magic.length; x++) {
			for (int y = 0; y < magic.length; y++) {
				
				if(x>=0&&x<n/4 || x>=n/4*3 && x<n) {
					
					if(y>0 && y<n/4*3) {
						magic[x][y] = (n*n)-(x*n+y);
					}
					
				}
				else {
					if(y>=0 &&y<n/4 || y>=n/4*3 && y<n) {
						magic[x][y] = (n*n)-(x*n+y);
					}
				}
				
			} 
		}
		
		
	}
	
	
	
	
	//1~최대길이*2까지 찍는 메소드
	public void makeA() {
		int n =magic.length;
		for (int i = 0; i < magic.length*magic.length; i++) {
			
			magic[i/n][i%n] = i+1;
			
		}
		
	}

}
