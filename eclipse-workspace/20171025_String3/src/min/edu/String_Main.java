package min.edu;

public class String_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Happy";
		String strK = "Happy";
		String str2 = new String("Happy");
		
		System.out.println("객체를 비교할때 == 주소를 비교");
		System.out.println(str1==str2);
		System.out.println("String은 new 를 하지 않았을 경우 SP(String pool)에서 공통으로 사용한다.");
		System.out.println(str1==strK);
		
		
		System.out.println("String은 안에  있는 값으로 HashCode - 고유값을 재정의 함");
		System.out.println(str1.hashCode()); //값을 입력 ("Happy")
		System.out.println(str2.hashCode());// new를 사용 
		
		System.out.println("new 이던 그냥 생성을 했던 모든 값은 SP 영역에 있다.");
		System.out.println("객체를 따라가서 SP 영역의 값의 hashcode를 찾아 주는 메소드가 intern()");
		String strT1=str1.intern(); // intern()은 그 객체가 사용되는 pool 을 찾아감 
		String  strT2=str2.intern();
		
		System.out.println(strT2);
		
		System.out.println("객체의 고유값인 HashCode 를 확인해보자 ");
		System.out.println(str1.hashCode()); // 69494464 : 값으로 재정의된 hashcode
		System.out.println(System.identityHashCode(str1)); // 값에의해 덮히기 전의 hashcode 값 (원래 hashcode)
		System.out.println(System.identityHashCode(str2));   // 값에의해 덮히기 전의 hashcode 값 (원래 hashcode)
		
		System.out.println("equals로 비교하면 값으로 overriding 된 hashcode 를 비교한다.");
		
		System.out.println(str1.equals(str2));
		
		
	

	}

}
