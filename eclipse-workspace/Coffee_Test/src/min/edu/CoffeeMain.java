package min.edu;

import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

		
		System.out.println("돈을 넣어주세요");
		Scanner s = new Scanner(System.in);
		int money=s.nextInt();
		Coffee_Input.coffeemenu(money);
		
		
		
		
	}

}
