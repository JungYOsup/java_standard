package min.edu;

public class Triangle_Area extends AreaImpl {

	@Override
	public void make() {
		double result = getX()* getY()*0.5;
		setResult(result);

	}

}
