package min.edu;

public class XY {

		private double x;
		private double y;
		
		public XY(double x, double y) {
			super();
			this.x = x;
			this.y = y;
		}

		public XY() {
			
		}

		public double getX() {
			return x;
		}

		public void setX(double x) {
			this.x = x;
		}

		public double getY() {
			return y;
		}

		public void setY(double y) {
			this.y = y;
		}

		
		@Override
		public String toString() //자식이 toString()을 오버라이딩 함 
		{
			System.out.println(super.toString());
			
			return "XY [x=" + x + ", y=" + y + "]";
		}
		
		
		
}
