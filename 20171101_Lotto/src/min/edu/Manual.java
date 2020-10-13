package min.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Manual {

	private int[] box;

	public Manual(int n) {
		box = new int[n];

	}

	//값을 입력해주는 메소드
	public int Input() {
		int n =0;
		System.out.println("값을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		n =scan.nextInt();

		return n;
	}

	//범위를 정해주고 값을 넣어주는 메소드

	public void Range () {
		int n =0;
		int count =0;
		
		
		while (count != box.length) {
			n =Input();
			if(n>=1 && n<46) {
				if(!isCheck(n)) //범위에 속한 n을 중복판단후에 배열에 넣어준다.	
				{
					box[count++] = n;
				}

			}
			else {
				System.out.println("범위를 넘어섯습니다.");

			}

		}



	}

	//중복을 판단하는 메소드
	public boolean isCheck(int n) {
		boolean ischeck = false;

		for (int i = 0; i < box.length; i++) {
			if(box[i]==n) { //배열과 입력한 값이 중복이 되면 true, 중복이 아니면 false
				ischeck =true;
			}

		}
		return ischeck;
	}


/*	public void make(int n) {
		int count=0;
		while (count != box.length) {

			box[count++] = n;


		}

	}*/

	@Override
	public String toString() {
		return "Manual [box=" + Arrays.toString(box) + "]";
	}



}
