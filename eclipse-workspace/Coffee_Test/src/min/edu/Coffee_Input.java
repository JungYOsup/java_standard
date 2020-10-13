package min.edu;

import java.util.Scanner;

public class Coffee_Input {


	public static void coffeemenu(int n) {
		
		Scanner scan = new Scanner(System.in);
		
		if(n>=300) {
			
			System.out.println("현재 입력된 돈은 " + n + "원 입니다.");			
			CoffeeMenu.menu();//메뉴 출력
			System.out.println("메뉴를 선택해주세요");
			int b = scan.nextInt();
			System.out.println("3초만 기다려주세요");
			
			Coffee_Switch.output(b); //선택한 메뉴출력
			int coffeevalue = CoffeeMenu.menu(b);
			Coffee_change.change(coffeevalue, n);
			
			
			
			
		}
		
		else if(n<300){
			
			
			System.out.println("돈이 부족합니다.");
	
			
			}

	
	}


	

}
