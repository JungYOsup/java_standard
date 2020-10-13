package min.edu;

/*
 * 28. Final의 구분
 *1)변수: 상수 Math.PI , 값을 재입력 하지 못함(초기값이 변하지않고 끝까지감) 
 *2)메소드 : 오버라이딩(재정의) 금지 , 사용은가능
 *3)클래스 : 상속 금지 , 
 */

public final class include_Final {
	
	public final void make() {
		final int n =10; // final 변수
		/*n=200; // 오류발생 , n은 무조건 10이라는 값만 들고 가야한다.
*/	}
	


}
