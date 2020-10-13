package min.edu;

public class Type_Explain {

	public static void main(String[] args) {
		byte b_min =Byte.MIN_VALUE;
		byte b_max =Byte.MAX_VALUE;
		
		short s_min = Short.MIN_VALUE;
		short s_max = Short.MAX_VALUE;
		
		int i_min = Integer.MIN_VALUE;
		int i_max = Integer.MAX_VALUE;
		
		long l_min = Long.MIN_VALUE;
		long l_max = Long.MAX_VALUE;
		
		System.out.println("byte 의 최소값" + b_min);
		System.out.println("byte 의 최대값" + b_max);
		
		System.out.println("short 의 최소값" + s_min);
		System.out.println("short 의 최대값" + s_max);
		
		System.out.println("int 의 최소값:" + i_min);
		System.out.println("int 의 최대값:" + i_max);
		
		System.out.println("long의 최소값:" + l_min);
		System.out.println("long의 최대값:" + l_max);
		
		//
		
		int sumI = 100 + 10;
		System.out.println(sumI);
		
		byte sumB = 100 + 10;
		System.out.println(sumB);
		
		byte a = 120;
		byte b = 7;
		// int ab = a+b;//자바의 모든 연산은 int타입으로 반환되어야한다.
		
		/*byte ab = a+b;*/
		
		boolean b1 = false;
		boolean b2= true;
		
		/*System.out.println(b1+b2);*/
		System.out.println(b1&b2);
		
		for(int i=0; i<100; i++) {
			System.out.println(i+":"+(char)i);
			
		}
		
		//-------------------------실수형
		
		//float , *double
		
		double d1= 1.1;
		
		float f1 = 1.1f;
		
		float dCal = 2/0.1f;
		
		double sdivisor = 5/2;
		System.out.println(sdivisor);

	}

}
