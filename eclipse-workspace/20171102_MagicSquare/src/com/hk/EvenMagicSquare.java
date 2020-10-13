package com.hk;;

public class EvenMagicSquare extends MagicSquareImpl {
	
	/*private int[][] magic;*/
	
	/*public EvenMagicSquare(int n) {
		magic = new int[n][n];
		
	}*/
	
	public EvenMagicSquare(int n) {
		super(n);
		// TODO Auto-generated constructor stub
	}

	public void makeMagic() {
		//1~n*n까지 값을 입력하는 메소드
		makeA();
		//범위값 선택을 통한 값 변경
		makeB();
		
		
	}
	
	private void makeB() {
		int n = magic.length; //4
		for (int x = 0; x < n; x++) { // 세로 x
			for (int y = 0; y < magic.length; y++) {//가로 y
				
				if(x>=0 && x<n/4 || x>=n/4*3 && x<n) {
					if(y>=n/4 && y<n/4*3) {
						magic[x][y] =n*n-(x*n+y);
					}
					
					}
				else if(y>=0 &&y<n/4 || y>=n/4*3&& y<n) {
					magic[x][y] = n*n-(x*n+y);
					
					}
				
					
					
				}
				
				
			}
		}
	

	private void makeA() {
		int x =0;
		int y =0;
		int n =magic.length;
		
		for (int i = 0; i < n*n; i++) {
			magic[i/n][i%n] =i+1;
			
			
			
		}
		
	
	}

	/*public int[][] getMagic() {
		return magic;
	}*/
	

}
