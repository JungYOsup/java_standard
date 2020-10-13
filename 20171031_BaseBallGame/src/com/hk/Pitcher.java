package com.hk;

import java.util.Arrays;

public class Pitcher extends BaseBall_Comm {
	
	/*private int[] gong;*/
	
	/*public Pitcher() {
		this(3);
	}*/
	public Pitcher(int n) {
		super(n);
//		gong = new int[n];
	}
	
	/*public int[] getGong() {
		return gong;
	}*/
	
	// 난수를 발생시켜 입력값을 반환
	private int makeNum() {
		int num =0;
		num =(int)(Math.random()*9)+1;
		
		
		return num;
		
	}
	
	public void make() {
		Arrays.fill(gong, -1); // 처음 going의 배열이int배열이기에 들어가있는 초기값이 0이기 때문에 내가 입력한값이 0일경우 바꼇는지 알수가 없다
		                            // 그렇기에 gong의 int 배열의 초기값을 -1로 만들어주어서 내가 입력한값이 0이면 -1이 0으로 바껴 잘 들어갔음을 알수가 있다.
		int count =0;
		int n = gong.length;
		
		while (count!=n) {
			
			int temp = this.makeNum();
			if(!isSame(temp)) {
				this.gong[count++] = temp;
				
			}
			
		}
	}
	//중복판단 메소드 // 중복이라면 true , 아니라면 false
	private boolean isSame(int temp) {
		boolean isc = false;
		
		for (int i = 0; i < gong.length; i++) {
			if(gong[i]==temp) {
				isc =true;
				break;
			}
			
		}
		
		return isc;
	}
	/*@Override
	public String toString() {
		return "Pitcher [gong=" + Arrays.toString(gong) + "]";
	}
	
	public void print() {
		System.out.print("[");
		int a = gong.length;
		for (int i = 0; i < a-1; i++) {
			
			System.out.printf("%d",gong[i]);
			
		}
		System.out.printf("%d]",gong[a-1]);
		
	}*/
	
	
	
	

}
