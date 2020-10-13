package min.edu;

import hk.edu.inputNumber;

public class CoffeeChoice {
	
	public void choice(int choice) {
		
		CoffeeMachine coffee = new CoffeeMachine();
		
		if(choice ==1) {
			System.out.println("커피가격을 입력해 주세여");
			/*int input=InputValue.input();*/
			
			int input = inputNumber.scannerNum();
			
			coffee.coffeeMake(input);
		}
		else {
			
			System.out.println("돈을 입력해 주세여");
			int input= inputNumber.scannerNum();/*InputValue.input();*/
			System.out.println("커피가격을 입력해주세요");
			int coffeeVal= inputNumber.scannerNum();/*InputValue.input();*/
			coffee.coffeeMake(input, coffeeVal);
			
		}
		
		
	}

}
