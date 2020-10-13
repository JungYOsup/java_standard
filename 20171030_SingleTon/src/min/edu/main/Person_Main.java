package min.edu.main;

import min.edu.I_Memo;
import min.edu.ctrl.Controller;

public class Person_Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			
	/*		Controller ctrl = new Controller(); // 그런데 이렇게 될경우 new를 3번이나 호출해야한다는 문제가 발생해버리고 그 호출된 인스턴스는 변수에 다 물려있기 때문에 메모리 낭비이다.
			I_Memo m = ctrl.choice(i);*/
			Controller ctrl = Controller.getInstance();
			I_Memo m = ctrl.choice(i);
			m.command();
			m.output();
		}
		
		System.out.println(Controller.Ctrl_Count);
		
	}

}
