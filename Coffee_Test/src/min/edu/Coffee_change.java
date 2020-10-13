package min.edu;

import java.util.Scanner;

public class Coffee_change {
	
	public static int change(int coffeevalue , int money) {
		
		int i =0;
		
		i=money-coffeevalue;
		
		
				
				
		System.out.printf("잔돈은 %d 입니다", i);
		System.out.println("더 뽑으시겠습니까? Y or N");		
		Scanner sc = new Scanner(System.in);
		String choice=sc.next();
		if(choice.equalsIgnoreCase("y")) {
			
			Coffee_Input.coffeemenu(i);
			
		}
	
		else {
			Coffee_Print.print(i);
		}
		
				return i;
		
	}
	//입력한돈과 커피가격을 빼서 Y를 입력하면 리턴해주는 프로그램 
	

}
