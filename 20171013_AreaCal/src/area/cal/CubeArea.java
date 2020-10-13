package area.cal;
/**
 * 사격형의 면적을 계산
 * @author 정요섭
 *
 */
public class CubeArea  extends Area{
	
	/*
	 * 사각형 면적 계산 메도스 가로 * 세로 
	 * @param int 반지름 값 
	 */
	
	
	public void makeCube(int n) {
		int result = n*n;
		print(result);
		
	}
	public void print(int result) {
		System.out.println("계산된 최종면적 값은: " + result);
		
	}
}
