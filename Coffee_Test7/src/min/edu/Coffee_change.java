package min.edu;

import java.util.Scanner;

public class Coffee_change {
	
	public static int chage(int money , int coffeevalue) {
		
		int i =0;
		
		i=Math.abs(coffeevalue - money);
		
		System.out.printf("잔돈은 %d 입니다", i);
		System.out.println("더 뽑으시겠습니까? Y or N");		
		Scanner sc = new Scanner(System.in);
		String choice=sc.next();
		if(choice.equalsIgnoreCase("y")) {
			
			Coffee_Input.menu(i);
			
		}
		
				return i;
		
	}

}
