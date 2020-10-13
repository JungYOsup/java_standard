package min.edu;

public class WrapperClass {

	public static void main(String[] args) {
		
		/*
		 * Wrapper Class 란 ?
		 * 8개의 기본타입에 상응되는 클래스
		 * byte - Byte
		 * shrot - Short
		 * int - Integer
		 * long - Long
		 * float - Float
		 * double -Double
		 * boolean -Boolean 
		 * char - character
		 * 
		 * 원래 목적은 기본타입 영역인 stack 은 참조타입 영역인 Heap과 연결이 되지 않음 
		 * 
		 */ 
			int a =10; // 기본타입
			Integer b= new Integer(10); //참조타입 
			
			System.out.println(a); // 값 출력 연산 //10 
			System.out.println(b.hashCode()); // Wrapper Class -> 안에있는 값으로 해쉬코드를 일치화 시켜버림 //10
			System.out.println(System.identityHashCode(b));
			System.out.println(a==b); // 원래는 기본타입과 참조타입은 ==으로 비교가 되지 않았다, 그러나 Wrapper Class인경우 결과값을 낼때 자동으로 참조타입(Integer)을 기본타입(int)으로 바꿔줌 auto-unboxing //JDK 1.5
			
			Integer ii = new Integer(a); //Boxing : 기본타입을 참조타입으로 바꿀떄 //잘안씀
			int i = ii.intValue(); // unBoxing : //참조타입을 기본타입으로 바꿀때  // 요즘에는 잘안씀 
			
			// int ->Integer -> Object
			// Object -> Interger -> int 
			
			int x =10; //기본선언
			Object o = x; // Auto-Boxing
			int n =(Integer) o;// Object를 Integer Casting 하고-> 기본타입
			
			Integer h = new Integer(x); //Boxing
			Object oo =h; //up-casting
			Integer g = (Integer)h;  // down-casting
			int nn =g.intValue();// un-Boxing
			
			int k =(int) o; // 원래 o는 Object(Integer)
			
			double d = x;
			System.out.println(d);
			
			double dd = (double)o;
			
			System.out.println(dd);
			
			//===============================
			//참조 타입은 기본타입처럼 promotion, casting 으로 통해서 형태를 변화시킬 수 없다.
			//int l = 10; // 기본타입
			//doulbe ld = l; //기본타입때 발생하는 모습(가능)
			//----------------------------------------------------------------------------
			//Integer ll = new Interger(100); //참조타입
			//Object obj = ll; //분모의 타입으로 변경 (upCasting)
			
			//Double ddd = (Double)ll; //Integer가 자동으로 int로 바뀌어서 double로 됨
			
			//Double aaa = (Double) obj ; // 오류발생
					
					

	}

}
