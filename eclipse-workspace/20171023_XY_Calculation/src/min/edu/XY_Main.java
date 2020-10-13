package min.edu;

public class XY_Main {
	
	public static void main(String[] args) {
		// 값을 가지고 있는 객체를 생성
		
		XY a = new XY();
		a.x = 10.0;
		a.y = 20.0;
		
		XY b = new XY();
		b.x = 5.0;
		b.y =10.0;
		
		XY rCal1 =XY_Calculation.Minus(a, b);
		
		System.out.printf("마이너스 결과는 ? x = %f , y = %f \n",rCal1.x , rCal1.y);
		
		XY rCal2 = XY_Calculation.plus(a, b);
		
		System.out.printf("플러스 결과는 ? x = %f , y = %f \n",rCal2.x , rCal2.y);
		
		
		
	}

}
