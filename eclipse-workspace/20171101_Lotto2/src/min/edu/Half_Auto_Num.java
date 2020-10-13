package min.edu;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Half_Auto_Num {

	private int[] box;
	private int number;
	
	public Half_Auto_Num(int n) {
		box = new int[n];
	}
	public Half_Auto_Num() {
		this(6);
	}




	public void makeLotto() {
		int count=0;
		System.out.println("입력할 수의 갯수를 입력하시오.");
		Scanner scan = new Scanner(System.in);

		while (true) {

			try {
				number=scan.nextInt();
				if(number >6) {
					System.out.println("잘못된 입력입니다.");
					System.out.println("입력할 수의 갯수를 입력하시오.");

				}
				else {
					System.out.printf("Enter로 구분지어 %d개의 번호를 입력하시오.\n", number);
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자가 입력되지 않았습니다.");
				System.exit(0); //프로그램 종료
			}

		}
		while(count !=number) {

			 	
			try {
				int a = scan.nextInt();
														
				System.out.println("입력한값은 "+a+"입니다"); //쌤한테 질문 1 띄고 2 띄고 3을 입력했는데 1 , 2 , 3이 제대로 배열에 들어감? 왜그럼? Scanner객체를 밖으로 뺴놓으니까 됨
				if (a > 0 && a < 46) {
					if (!isSame(a)) {
						box[count++] = a;

					} else {
						System.out.println("중복되었습니다 다시입력해주세요");
					}

				} else {
					System.out.println("입력범위를 벗어났습니다.");
				} 
			} catch (InputMismatchException e) {
				System.out.println("숫자가 입력되지 않았습니다.");
				System.exit(0); //프로그램 종료
			} 

		}

		System.out.println("남은 숫자가 랜덤으로 생성됩니다.");

		while(count!=6) {

			int b = makeRan();
			if(!isSame(b)) {
				box[count++] =b;
			}

		}
		
		
		

	}


	private int makeRan() {   //남은 숫자 랜덤으로 생성
		int num = 0;
		num = (int)((Math.random()+0.1)*41)+1;
		return num;
	}

	//입력값 중복 판별
	public boolean isSame(int n) {
		boolean ischeck = false;

		for (int i = 0; i < box.length; i++) {

			if(box[i] ==n) {
				ischeck = true;
			}

		}
		return ischeck;

	}
	@Override
	public String toString() {
		return Arrays.toString(box);
	}


}
