package min.edu;

import java.util.Arrays;

public class Auto {

	private int[] box;
	
	public Auto(int n) {

		box = new int[n];

	}

	@Override
	public String toString() {
		return "Auto" +  Arrays.toString(box);
	}

	public int[] getBox() {
		return box;
	}

	public int ran_make() {
		int ran=0;
		ran = (int)((Math.random()+0.1)*41);
		
		return ran;
	}


	//판별후 배열에 넣어 주는 메소드

	public void Auto_make() {
		int count=0;
		while (count !=box.length) {
			
			int n = ran_make();
			if (!isCheck(n)) {
				box[count++] = n;
			}
			
		}
		
		/*for (int i = 0; i < box.length; i++) {
			
			int n = ran_make();
			if (!isCheck(n)) {
				box[i] = n;
			}
			
		} // false가 뜨면(배열에 중복) 배열에 아무값도 못넣으므로 초기값인
		  //0이 들어가버려버리고 다음 인덱스로 넘어가버림
*/
			

	}

	//배열에 값이 중복되어있는지 판단하는 메소드
	public boolean isCheck(int n) {
		boolean ischeck = false;

		for (int i = 0; i < box.length; i++) {

			if(box[i] ==n) {
				ischeck = true;
			}

		}
     	return ischeck;

	}
}
