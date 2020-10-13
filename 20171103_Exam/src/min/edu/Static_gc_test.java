package min.edu;

public class Static_gc_test {
	
	public static int newObjectCnt =0;
	public Static_gc_test() {
		newObjectCnt++;
	}

	protected void finalize() throws Throwable{
		System.out.println("garbageCollection 실행");
		super.finalize();
	}
}

