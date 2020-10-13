package com.hk;

public class OddMagicSquare extends MagicSquareImpl{
	/*private int array[][];*/

	public OddMagicSquare(int n ) {
		super(n);
		/*array =new int[n][n];*/
	}
	/*public OddMagicSquare() {
		this(2);
	}

	public int[][] getArray() {
		return array;
	}*/
	
	public void makeMagic() {
		int a =magic.length;
		int x =0;
		int y =a/2;

		magic[x][y]=1;

		for (int i = 2; i <= magic.length*magic.length; i++) {
			
			int tempX = x;
			int tempY = y;
			//x가 -1했을때 음수이면 배열의 최대값을 넣어준다.
			
			if(x-1<0) { //[0,1] ->[-1,0] ->[mid-1,~]
				x=a-1;
					
			}else {
				x = x-1;
						}
			//y가 -1했을때 음수이면 배열의 최대값을 넣어준다
			
			if (y-1<0) {
				y=a-1;
			}
			else {
				y= y-1;
			}
			//위의 로직에 의해 이동한 곳의 배열에 값이 같다면(i=0) x,y가변하기 전의 값에 x+1.y
			if(magic[x][y]!=0) {
				x= tempX+1;
				y=tempY;
			}
			
			//최종벅으로 변경된 x,y를 이용하여 배열에 for문의 값을 입력
			
			magic[x][y]= i;

		}


	}


}
