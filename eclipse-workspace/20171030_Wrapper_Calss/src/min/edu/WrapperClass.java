package min.edu;

public class WrapperClass {

	public static void main(String[] args) {

		/*
		 * Wrapper Class란?
		 * 8개의 기본타입에 상응되는 클래스
		 * byte - Byte
		 * short - Short
		 * int - integer
		 * long - Long
		 * float - Float
		 * double - Double
		 * boolean - Boolean
		 * char - character
		 * 원래 목적인 기본타입 영역인 stack은 참조타입 영역인 Heap과 연결이되지않음
		 */
		
		
		int a = 5;
		Integer b = new Integer(10);//참조타입
		b.compareTo(20);
		
		//참조타입은 형변환이 안되므로 참조타입을 형변환시키기 위해서는 참조타입을 같은 기본타입으로 바꾸고 기본타입을 프로모션한다음 기본타입을 참조타입으로 바꿔야한다
		int k = (int)b; //참조타입을 기본타입으로 변환
		double bb = k; //기본타입을 상위기본타입으로 변환(프로모션)
		Double xa = bb;//기본타입을 참조타입으로 변환
		System.out.println(xa); // 실질적으로 참조타입을 참조타입으로 변환한 상태가 되는거임
		
		//그러나 이 과정을 이클립스에서 해준다. 그러기때문에
		
		Double ff = (double) b;
		System.out.println("이클립스에서 알아서 해준다"+ff); //결론, 참조타입을 참조타입으로 바꾸려면, 받는 참조타입과 WraaperClass인 기본타입으로 타입케스팅해주면 된다.
		
		
		
		System.out.println(a);//값출력 과 연산
		System.out.println(b.hashCode());
		
		System.out.println(System.identityHashCode(b));
		System.out.println(a==b);//Auto - unboxing // JDK 1.5
		
		
		Integer ii = new Integer(a); // Boxing 기본타입 -> 참조타입
		int i = ii.intValue(); // unBoxing 참조타입 -> 기본타입
		
		//int -> integer -> Object
		//Object -> integer ->int
		
		int x = 10; //기본선언
		Object o = x; //Auto-Boxing
		int n = (Integer)o; //Object를 Integer로 Casting -> 기본타입
		
		Integer h = new Integer(x); //Boxing
		Object oo = h; //up-casting
		Integer g = (Integer)h; // down-casting
		int nn = g.intValue(); //un-Boxing
		
/*		int k = (int)o; // o = Object(Integer)
		
		System.out.println(k);
		
		double d = x;
		System.out.println(d);
		
		double dd=(double)o;
		System.out.println(dd);*/

		
		//------------------------------------------
		// 참조타입은 기본타입처럼 promotion 이나 casting을 통해서 형태를 변화시킬수없다.
		int l = 10;
		double ld = l;
		System.out.println(ld);
		
		
		Integer ll = new Integer(100);
		Object obj= ll;//부모의 타입으로 변경 //upcasting
		Double ddd=(double)ll; //참조타입은 참조타입끼리 변경이되지않음 (이예제는 Integer -> Double로 변경된것이다)
		
		
		System.out.println(ddd);

	}

}
