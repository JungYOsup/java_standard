package area.cal.play;

import area.cal.CircleArea;

import area.cal.CubeArea;
/**면적을 계산하는 프로그램 
 * 
 * @author Owner 정요섭
 *
 */

public class AreaMain {
	/**
	 * 면적을 계산하는 클래스를 실행 시키는 메소드
	 * @param args 기본 파라미터(사용하지 않음)
	 */

	public static void main(String[] args) {
		
		CubeArea cube = new CubeArea();
		CircleArea circle = new CircleArea();
		cube.makeCube(10);
		circle.makeCircle(10);
		

	}

}
