package min.edu;

public abstract class AreaImpl implements Interface_Area {
	
	private double x;
	private double y;
	private double result;
	

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

/*	public double getResult() {
		return result;
	}*/

	public void setResult(double result) {
		this.result = result;
	}

	@Override
	public abstract void make();

	@Override
	public void print() {
		System.out.printf("입력된 %f 와 %f 를 계산한 면적값은 ? %f 입니다 \n ",x,y,result);

	}

}
