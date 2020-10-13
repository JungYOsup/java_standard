package com.hk;


//두 배열이 중복되었는지를 판단하여 같은위치가 존재할경우 strike , 숫자가 같지만 위치가 다를 경우 ball을 해준다.

public class Umppire {
	private int pBall[];
	private int hBall[];
	
	
	public Umppire(int n) {
		pBall =new int[n];
		hBall =new int[n];
		
	}
	
	public void setpBall(int[] pBall) {
		this.pBall = pBall;
	}

	public void sethBall(int[] hBall) {
		this.hBall = hBall;
	}

	public Umppire() {
		this(3);
	}
	
	//스트라이크일 경우
	public int Strike() {
		
		int scount=0;
		for (int i = 0; i < hBall.length; i++) {
			if(pBall[i]==hBall[i]) {
				scount++;
			}
		}
		
		
		return scount;
		
	}
	public int Ball() {
		
		int bcount =0;
		for (int i = 0; i < hBall.length; i++) {
			for (int j = 0; j < hBall.length; j++) {
				
				if (pBall[i]==hBall[j] && i!=j) {
					bcount++;
				}
				
			}
		}
		return bcount ;
	}
	
	
}
