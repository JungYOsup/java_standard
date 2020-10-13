package min.edu;

public abstract class  AService implements IService {

	@Override
	public void make1() {
		System.out.println("난 인터페이스 상속받음");
	}

	@Override
	public abstract void make2();

}
