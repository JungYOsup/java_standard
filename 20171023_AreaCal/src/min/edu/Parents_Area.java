package min.edu;
/*
 * 면적의 가로 혹은 세로와 결과를 담고 있는 클래슨느 부모로 만듬
 * 상수값도 포함
 * 출력
 */
public class Parents_Area {
	
	private double x;
	private double y;
	private double result; //결과를 담아 줌 
	protected double PI = Math.PI;
	
		


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




	public double getResult() {
		return result;
	}




	public void setResult(double result) {
		this.result = result;
	}




	// 결과를 출력하는 메서드 
	public void areaPrint() {
		System.out.println("면적 결과는? " + result);
	}


	

}
