package com.hk;
/**
 * Hitter와 Pitcher에서 객체의 값을 비교판단하는 클래스
 * @author Owner
 *
 */
public class Umppire {
	
	private int[] hBall;
	private int[] pBall;
	
/*	public Umppire() {
		this(3);
	}*/
/*	public Umppire(int n) {
		hBall = new int[n];
		pBall = new int[n];
	}*/
	public void sethBall(int[] hBall) {
		this.hBall = hBall;
	}
	public void setpBall(int[] pBall) {
		this.pBall = pBall;
	}
	
	
	public int strike() {
		int count = 0;
		int n = hBall.length;
		
		for (int i = 0; i < n ;i++) {
			if(hBall[i] ==pBall[i]) {
				count ++;
			}
			
		}
		
		return count;
	}
	
	public int ball() {
		int count =0;
		
		for (int i = 0; i < hBall.length; i++) {
			for (int j = 0; j < pBall.length; j++) {
				if(i!=j && hBall[i] == pBall[j]) {
					count ++;
				}
				
			}
		}
		
		return count;
	}
	
	

}
