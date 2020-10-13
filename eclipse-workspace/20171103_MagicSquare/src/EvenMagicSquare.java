//기존에는 for문의 i를 index로 썻다면 , 마방진은 i를 값으로 쓴다는것에 주목해야한다.
public class EvenMagicSquare  extends MagicSquareImpl{
	/*private int magic[][];*/
	
	public EvenMagicSquare(int n ) {
		super(n);
		/*even = new int[n][n];*/
	}
	/*public EvenMagicSquare() {
		this(4);
	}*/
	public void makeMagic() {
		makeA();
		makeB();
	}
	
	/*public int[][] getEven() {
		return magic;
	}
	*/
	
	//특정위치값을 선택하는 메소드
	private void makeB() {
		
		int n =magic.length;
		for (int x = 0; x < n; x++) {
			for (int y = 0; y < n; y++) {
				
				if(x>=0&&x<n/4 || x>=n/4*3 &&x<n) {
					if(y>=n/4 && y<n/4*3) {
						magic[x][y] =(n*n)-(x*n+y);
					}
				}
				else if(y>=0&&y<n/4*1 || y>=n/4*3 && y<n) {
					magic[x][y] = (n*n)-(x*n+y);
				}
				
			}
			
				
			
		}
		
		
		
	}
	
	
	//4 마방진에 1부터 16까지의 값을 넣는메소드
	public void makeA() {
		int n = magic.length;
		for (int i = 0; i < n*n; i++) {
			
			magic[i/n][i%n] = i+1;
			
		}
	
		
	}
	
	

}
