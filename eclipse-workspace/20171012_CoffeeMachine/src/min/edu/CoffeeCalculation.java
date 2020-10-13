package min.edu;

import java.util.Scanner;

public class CoffeeCalculation {

	public static void main(String[] args) {
       // 키보드로 입력 받은 Class 인 java.util.scanner		
		Scanner scan = new Scanner(System.in); // Scanner 클래스의 함수의 메서드가 static이 아니므로 그 클래스 함수의 주소를 받아와야한다.
		System.out.println("돈을 입력해 주세요 ");
		
		int money =scan.nextInt();
		
		System.out.println("커피값을 입력해 주세요 ");
		
		int coffeeValue=scan.nextInt();
		
		
		
		CoffeePrint cp = new CoffeePrint();
		cp.print(money, coffeeValue);
		
		
		/*cp.print(550,500);*/
		
		
		
		
	


	}

}
