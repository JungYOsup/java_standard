package min.edu;

public class XY_Calculation {
	
	public static final XY minus(XY a, XY b) {
		
				
		return new XY((a.getX()-b.getX()),(a.getY()-b.getY()));
		
	}
	
	public static final XY plus(XY a, XY b) {
		
		return new XY((a.getX()+b.getX()),(a.getY()+b.getY()));
	}

}
