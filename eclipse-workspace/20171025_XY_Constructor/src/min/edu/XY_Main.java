package min.edu;

public class XY_Main {

	public static void main(String[] args) {
		XY xy1 = new XY(3.14 , 5.0);
		XY xy2 = new XY(10.0 , 2.1);
		
		XY r1 = XY_Calculation.minus(xy1, xy2);
		XY r2= XY_Calculation.plus(xy1, xy2);
		
		System.out.println(r1);
		System.out.println(r2);
		
		
//		xy.setX(3.14);
//		xy.setY(5.1);
		
		/*System.out.println(xy); //결과값 min.edu.XY@15db9742 (부모의 toString이 찍힘) 
		                                //그러나 XY를 toString으로 오버라이딩을 하게 되면 오버라이딩된 값이 찍힘
		*/
		
		

	}
	

}
