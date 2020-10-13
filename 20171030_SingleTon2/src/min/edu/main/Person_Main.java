package min.edu.main;

import min.edu.I_MeMo;
import min.edu.ctrl.Controller;

public class Person_Main {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 3; i++) {
			/*Controller ct = new Controller();*/
			/*I_MeMo m =ct.choice(i);*/
	/*		m.command();
			m.output();*/
			Controller ctrl = Controller.getInstace();
			I_MeMo m =ctrl.choice(i);
			m.command();
			m.output();
			
			
		}
	}

}
