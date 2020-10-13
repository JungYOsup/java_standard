package com.hk;

public class MagicSquare_Check {
	
	private int[][] magic;
	public boolean isCheck(int[][] magic) //true면 마방진 실패

	{
		boolean isc = false;
		
		this.magic =magic;
		
		int[] chkArray =new int [2*magic.length+2]; //가로 n개 세로 n 개 + 대각선 2개 
		
		for (int i = 0; i < magic.length; i++) { // 값을 변경하면서 chkArray에 누적을 한다.
			//가로계산하는애 0 1 2 
			chkArray[i] = sumRow(i);
			//세로계산하는애 3 4 5 
			chkArray[i+magic.length] =sumCol(i);
			
		}
		
		//가로 6
		chkArray[magic.length*2] = sumDiagonal();
		chkArray[magic.length*2+1] = sumRevDiagonal();
		//세로 7
		for (int i = 0; i < chkArray.length; i++) {
			if(chkArray[0]!=chkArray[i]) //true면 마방진 실패
			{
				isc = true;
				break;
			}
			
		}
		
		return isc;
	}
	
	private int sumRow(int x) {
		int sum = 0;
		for (int y= 0; y < magic.length; y++) {
			sum+=magic[x][y];
		}
		
		
		return sum;
	}
	private int sumCol(int y) {
		int sum =0;
		for (int x = 0; x < magic.length; x++) {
			sum+=magic[x][y];
		}
		return sum;
	}
	private int sumDiagonal() {
		int sum =0;
		for (int i = 0; i < magic.length; i++) {
			sum+=magic[i][i];
		}
		return sum;
	}
	private int sumRevDiagonal() {
		int sum=0;
		for (int i = 0; i < magic.length; i++) {
			sum+=magic[i][magic.length-1-i];
		}
		return sum;
	}
	

}
