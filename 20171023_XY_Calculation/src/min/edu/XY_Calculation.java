package min.edu;
/**
 * XY 객체를 입력받아 계산(+ , - ) 클래스
 * @author HK_Lab4
 *
 */
public class XY_Calculation {
	
	
	
	public static XY Minus(XY a , XY b) {
		XY rXY = new XY();
		rXY.x = (a.x-b.x);
		rXY.y = (a.y-b.y);
		
		return rXY;
	}
	
	public static XY plus(XY a , XY b) {
		XY rXY = new XY();
		rXY.x = (a.x + b.x);
		rXY.y = (a.y + b.y);
		return rXY;
		
	}

}
