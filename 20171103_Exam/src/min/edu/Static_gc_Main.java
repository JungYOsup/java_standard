package min.edu;

public class Static_gc_Main {
	static {
		System.out.println("static의 메모리 할당");
	}
	public static void main(String[] args) {
		new Static_gc_test();
		new Static_gc_test();
		System.out.println("Static_gc_tst이 heap 에 있는 개수 \t" +Static_gc_test.newObjectCnt);
		
		
		
		
		System.gc();
		System.out.println("Static_gc_test이 heap에 있는 개수 \t" +Static_gc_test.newObjectCnt );
		System.gc();
		System.out.println("메인의 실행 완료");
	}

}
