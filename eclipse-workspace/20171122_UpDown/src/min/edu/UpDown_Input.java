package min.edu;

import java.util.Scanner;

//값을 집어 넣는 메소드
public class UpDown_Input {
	
	
	public int input() {
		int n=0;
		System.out.println("값을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		
		if(n>50||n<=0) {
			System.out.println("50이하 1이상의 숫자를 입력해주세요");
			this.input();
		}
				
		return n;
		
		
	}

}
