package min.edu.main;

import min.edu.I_Memo;
import min.edu.ctrl.Controller;

public class Person_Main {

	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {
			
//			Controller ctrl = new Controller();
//			I_Memo m = ctrl.choice(i);
			
			Controller ctrl = Controller.getInstance();
			I_Memo m = ctrl.choice(i);
			m.commad();
			m.outPut();
		}
		
	}

}
