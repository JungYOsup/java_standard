package min.edu;
/**
 * 커피를 계산하는 클래스
 * @author 정요섭
 * @since 2107/10/12
 *
 */
public class CoffeePrint {
	/**
	 * 돈(int)를 입력 받아 300원짜리 커피의 잔수와 잔돈을 출력 해줌
	 */
	public void print(int money, int coffeeValue) {
		
      // 몫 /
      // 나머지 %		
		int 몫 = money/coffeeValue;
		int 잔돈 = money%coffeeValue;
		
		
	

		System.out.println("잔수: " + 몫);
		System.out.println("잔돈: " + 잔돈);
		
		
	
	
	}
}
