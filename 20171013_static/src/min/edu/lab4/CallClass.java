package min.edu.lab4;

public class CallClass {
	
	public void call() {
		// static 메소드의 경우는
		// 클래스명.메소드
		AllMethodClass.staticMethod();
		
		// non static 메소드의 경우는
		// 객체명.메소드
		
		AllMethodClass amc = new AllMethodClass();
		amc.staticMethod(); //이거는 가능하나 완벽하게 올바른 방법은 아니다
		                    //어차피 static 매소드를 호출하니까 AllMethodCalss.staticMethod(); 가 옳은방법
		
		
		amc.nonstaticMethod();
		
	}

}
