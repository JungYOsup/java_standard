package com.hk;

import java.util.Arrays;

//임의의 값을 배열에 담는데 담기전에 , 그 배열이 중복되어있는지를 판별하여 담아주어야한다.
public class Pitcher extends BaseBall_Comm {

	//값을 담아 주는 배열
	/*private int[] box;

	public int[] getBox() {
		return box;
	}*/
	
	public Pitcher(int n) {
		super(n);
		box = new int[n];
	}
	/*public Pitcher() {
		this(3);
	}*/
	// 난수를 발생시켜 입력값을 반환
	private int makeNum() {
		int num =0;
		num = (int)(Math.random()*9)+1;

		return num;

	}

	//배열에 중복되어있는지를 판별하고 임의의 값을 담아주는 메소드

	public void make() {
		Arrays.fill(box, -1); // 배열의 초기값이 0이므로 우리가 임의의값 0을 넣어주었는지 초기값0인지 파악하기 힘드므로 
							  // 초기값을 -1로 해줘서 임의의값 0이 들어가면 0이 들어갔다고 알수있게

		int count =0;
		int n = box.length;

		while(count!=n) {

			int num=this.makeNum();

			if(!isSame(num)) {
				this.box[count++] = num;

			}

		} //굳이 for로 안돌려준 이유가 뭐지 ?



	}



	//배열에 중복되는 값이 있는지 판별해주는 메소드

	public boolean isSame(int n) {
		boolean isSame = false;

		for (int i = 0; i < box.length-1; i++) {

			//박스안에 중복되는 값이 있으면 true , 없으면 false로 리턴해줌 
			if(box[i]==n) {
				isSame = true;

			}

		}


		return isSame;
	}

	/*@Override
	public String toString() {
		return "Pitcher"+Arrays.toString(box);
	}*/


}
