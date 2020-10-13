package min.edu;

import java.util.Scanner;

public class Half_Auto {
	private int [] box;
		
	public Half_Auto(int n) {
		box = new int[n];
	}
	
	//임의의 값을 만들어주는 메소드 
	public int ran_Make() {
		int n =0;
		n=(int)((Math.random()+0.1)*41);
		
		return n;
	}

		
	//값을 입력해주는 메소드
	public int Auto() {
		int n =0;
		int[] temp = new int[box.length];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요(1~45까지)");
		String a =scan.next(); // 입력한 값이 숫자가아닌 문자로 받음, 숫자가 아닌 문자를 넣을경우의 오류를 방지하고자 아예 문자를 넣으면 int로 바꿔줌
		
		for (int i = 0; i < ; i++) {
			temp[i] = a.charAt(i) - '0';
		}
		
		
		
		
		
		
		
		
		
		return n;
		
	}
	
	

}
