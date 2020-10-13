package min.edu;

public class CoffeeMachine {
	
	//1번을 선택 했을때 자동을 기본 200원 가격의 커피 잔수를 출력
		public void coffeeMake(int input) {
			
			int result = input/200;
			
			System.out.printf("%d잔 커피가 출력됨",result );
			
		}
	
	//2번을 선택 했을때 입력 금액과 커피가격을 입력받은 -> 잔수를 출력 
		public void coffeeMake(int input , int coffeeVal) {
			
			int result = input/coffeeVal;
			System.out.printf("%d잔의 커피가 출력됨 ", result);
			
		}
	

}
