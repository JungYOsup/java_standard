package min.edu;

public abstract class AService implements IService {

	@Override
	public void make1() {
		System.out.println("난 interface를 상속받은 클래스이다.");
	}

	@Override
	public abstract void make2();
		

	

}
