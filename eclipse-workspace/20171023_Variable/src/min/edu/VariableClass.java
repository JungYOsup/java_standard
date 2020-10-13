package min.edu;
/*
 * static 변수 :application 이 실행 될때 단 한번 호출
 * instance 변수 :member field 영역서 선언 :new  , 자동으로 초기화가 된다.
 * local 변수 : {} 안에 선언 :
 */
public class VariableClass {
	static int count = 0; 
	int number ;
	int val;
	
	//default 생성자
	public VariableClass(int n ) {
		count++;
		number = n;
		/*int a;
		System.out.println(a);*/
		
	}

}
