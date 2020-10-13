package com.hk;

/**
 * Hitter와Pitcher의 공통모듈을 가지고 있는 클래스(abstract)
 * @author Owner
 *
 */
public abstract class BaseBall_Comm {

	protected int[] gong;
	/*	public BaseBall_Comm() {
		// TODO Auto-generated constructor stub
	}*/

	public BaseBall_Comm(int n ) {
		gong = new int[n];
	}

	public int[] getGong() {
		return gong;
	}

	//추상메소드 : 자식에게 구현을 강요

	public abstract void make();

	@Override
	public String toString() {
		String s = "[";
		int n = gong.length;
		for (int i = 0; i < n-1; i++) //배열이 3일때 처음이랑 두번째거 입력해주고
		{
			s+=String.format("%d,", gong[i]);

		}
		s+= String.format("%d]", gong[n-1]); //3번쨰껄 여기다 입력해주어서 모양을 맞춰줌
		return s;
	}//toString

	public void print() {
		System.out.print("[");

		int n = gong.length;
		for (int i = 0; i < n-1; i++) {
			System.out.printf("%d",gong[i]);

		}

		System.out.printf("%d]",gong[n-1]);



	}
}
