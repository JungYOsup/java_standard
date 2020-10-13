package min.edu.practice;

public class WrapperClass {

	public static void main(String[] args) {
		
		Integer a  = new Integer(100); //Wrapper클래스일때 참조타입을 기본타입으로, 기본타입을 참조타입으로 바꿀수 있다.
		int b = a;
		System.out.println(b);
		
		/*Double c = (Double)a; // 참조타입안에서는 타입케이스팅과 프로모션이 안된다. */
		
		Double d = (double)a; // 자동적으로 int로 바꿧다가 더블로 바뀌고 다시 참조타입으로 
		
		int e = a;
		double f= e;
		 



	}

}
