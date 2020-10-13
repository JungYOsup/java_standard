package min.edu;

import min.edu.lab4.Process;

//-----------------------
//임포트 영역
//import는 다른 패키지의 위치를 표시해 줌 
//java.lang.*  (java안에 있는 lang안에 있는 모든파일들) 패키지는 import 되지않음 
//-----------------------
public class Main {

	public static void main(String[] args) {
		
		Process p = new Process();
		p.print1();
		p.print2(5); //Argument : 내가 필요한 값을 넣는 곳 
		p.print3(1000, true);
		
		
		
		
	}

}
