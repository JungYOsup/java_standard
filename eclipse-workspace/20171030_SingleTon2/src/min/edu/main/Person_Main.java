package min.edu.main;

import min.edu.ctrl.Contorller;

public class Person_Main {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i < 3; i++) {
			/*Contorller control = new Contorller();
			control.choice(i);*/
			
			Contorller a = Contorller.SingleTon();
			a.choice(i);
			
		}
	}

}
