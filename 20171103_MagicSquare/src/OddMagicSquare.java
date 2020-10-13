
public class OddMagicSquare {
	
	private int[][] odd;
	
	
	public int[][] getOdd() {
		return odd;
	}
	public OddMagicSquare(int n) {
		odd = new int[n][n];
		
	}
	
	
	public void makeMagic() {
		int n =odd.length; //3
		int x =0;
		int y =n/2;
		odd[x][y] =1;
		
		for (int i = 2; i <= odd.length*odd.length; i++) {
			
			
			if(x-1<0) //x값이 음수가 되면 총길이 -1 을 x에 넣어준다. (-1에 총길이를 더해준거랑 같은 의미)
			{
				x=n-1;
			}
			else //x가 음수가 아닐경우 -1해준다
			{
				x=x-1;
				
			}
			
			if(y-1<0) {//y값이 음수가 되면 총길이 -1을 y에 넣어준다.
				y=n-1;
			}
			else {
				y=y-1;
			}
			if(odd[x][y]!=0) {
				
			}
			
			odd[x][y] = i;
			
					
		}
		
	}
	
	
	

}
