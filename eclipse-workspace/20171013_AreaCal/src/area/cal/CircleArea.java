package area.cal;
/**
 * 원의 면적을 계산 
 * @author 정요섭
 *
 */
public class CircleArea extends Area{
	/*
	 * 원 면적 계산 메도스 반지름 * 반지름 * PI
	 * @param int 반지름 값 
	 */
	
	
	public void makeCircle(int n) {
		int result = (int) (n/2*n/2*Math.PI);
		print(result);
		
	}
	
	public void print2(int result) {
		
		System.out.println("계산된 최종면적 값은: " + result);
		
		
		
	}
	

	
	

}
