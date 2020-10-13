package min.edu.ctrl;

import min.edu.I_Memo;
import min.edu.Person_Address;
import min.edu.person_Name;

public class Controller {
	//SingleTon Pattern
	 	//1. 목적 : 사용되는 클래스를 메모리(Heap)에 한번만 생성할 수있도록 하자
	// 생성자를 호출되는 횟수는 1번으로 하면됨
	// 외부에서 생성자가 호출되지 않도록 하고 내부에서 만들어서 보내주면 됨.
	public static int ctrl_count =1;
	
	//1.생성자의 private 접근제한자 처리를 한다.
	private Controller() {
		
		ctrl_count ++;
		
	}
	// 2. 내 자신의 객체 가 메모리에 있는지 없는지판별하고 있다면 담겨져있는주소
	// 없다면 자신이 new를 통해서 ctrl에 담아줘서 넘겨줌
	public static Controller ctrl;
	public static Controller getInstance(){
		if (ctrl==null) {
			ctrl = new Controller();
		}
		return ctrl;
	}
		
		
	
	
	public I_Memo choice(int n) {
		
		I_Memo m = null;
		
		switch (n) {
		case 1:
			m = new person_Name();
			break;
			
		default:
			m = new Person_Address();
			break;
	}//switch
		return m;
	}//choice

}
