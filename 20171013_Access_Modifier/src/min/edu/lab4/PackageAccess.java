package min.edu.lab4;

import min.edu.InnerClass;

// 패키지가 달라지면 protected , default , private 는 접근이 불가능하다.

public class PackageAccess {
	
	public void packAccess() {
		InnerClass ic = new InnerClass();
		ic.publicMethod();
				
	}

}