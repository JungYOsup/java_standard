package min.edu;

public class CoffeeMake {
	
	
	/*커피값과 선택된 커피의 가격 두개를 입력(Argument)

	메서드(1)
	CoffeeMake명

	static 생성
	parameter 2개 (int , int)
	리턴값 : 잔수-int*/
	
	// 1. 메서드를 실행 시켰을 때 필요한 결과 물이 반환이 되는지 아니면 종료가 되는지 확인
	//   -return 을 void 혹은 원하는 반환 타입을 작성한다.
	public static int makecoffee(int money, int coffeeVal) {
		
		int n=0; // 2. 반환에 타입에 받는 변수를 선언 하여 초기값을 넣어준다.
		
		n = money/coffeeVal;
		
		//3. return 예약을 사용하고 반환되는 결과가 담기는 변수를 작성한다.
		
		return n;
		
	}

	
	
	
	

}
