package min.edu;

public class InnerClass {
	
	// 내 클레스에서는 접근제어자 상관없이 모두 접근 가능하다.
	
	public void accessInner() {
		
		publicMethod();
		protectedMethod();
		privateMethod();
		defaultMethod();
		
	}
	
	public void publicMethod() {};
	
	protected void protectedMethod() {};
		
	void defaultMethod() {};
	
	private void privateMethod() {};
	
		
}
