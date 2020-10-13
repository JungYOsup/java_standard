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
			
			CoffeeMenu.menu();
			
		}
		else {
			Coffee_Print.print(i);
		}
		
				return i;
		
	}

}
