package min.edu;

public class SamePackAccess {
	// 같은 패키지의 경우 public ,protected, default 가 접근이 가능하다. 
	public void sameAccess() {
		InnerClass ic = new InnerClass();
		ic.publicMethod();
		ic.protectedMethod();
		ic.defaultMethod();
	}

}
