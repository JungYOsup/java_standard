package min.edu;

import hk.edu.inputNumber;

public class CoffeeMain {

	public static void main(String[] args) {
		
		CoffeeChoice ch = new CoffeeChoice();
		System.out.println("커피를 선택해주세요");
		System.out.println("1번 200원 기본 커피");
		System.out.println("2번 커피가격 선택");
		
		/*int choice =InputValue.input();*/
		
		int choice = inputNumber.scannerNum();
		
		ch.choice(choice);

	}

}
