//기존에는 for문의 i를 index로 썻다면 , 마방진은 i를 값으로 쓴다는것에 주목해야한다.
public class OddMagicSquare extends MagicSquareImpl{
	
	/*private int magic[][];*/
	public OddMagicSquare(int n) {
		super(n);
		/*magic = new int[n][n];*/
	}	
	
	/*public int[][] getOdd() {
		return magic;
	}*/

	/*public OddMagicSquare() {
		this(3);
		
	}*/
	
	public void makeMagic() {
		int n = magic.length;
		int x = 0;
		int y = n/2;
		magic[x][y] =1; //무조건 시작위치는 1이며 그 위치는 0,배열의길이/2 이다.
		
		for (int i = 2; i <= magic.length*magic.length; i++) {
			int tempX=x;
			int tempY=y;
			//x값이 음수가 되면 x에다가 총 길이를 더해준다.(=총길이 - 1)
			
			if(x-1<0) {
				x = n-1;
			}
			else { //그게 아니라 일반적인 경우일경우 x-1 해줌 
				x = x-1;
			}
			
			//y값이 음수가 되면 y에다가 총 길이를 더해준다.(=총길이 - 1)
			
			if(y-1<0) {
				y = n-1;
			}
			else { //그게 아니라 일반적인 경우일경우 y-1 해줌 
				y = y-1;
			}
			//그리고 겹치는 부분 즉 기존의 값이 존재한다면 원래값에다가 x는 +1해주고 ,y는 그대로 둔다.
			
			if(magic[x][y]!=0) {
				x = tempX+1;
				y = tempY;
				
			}
			magic[x][y]=i;
			
			
		}
		
		
		
	}
	
	
	
	
	
	

}
