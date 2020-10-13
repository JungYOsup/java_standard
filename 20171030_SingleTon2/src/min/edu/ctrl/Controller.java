package min.edu.ctrl;

import min.edu.I_MeMo;
import min.edu.Person_Address;
import min.edu.Person_Name;

public class Controller {
	
	public static Controller ctrl;
	private Controller() {
		
		
		
	}
	
	public static Controller getInstace() {
		
		if(ctrl ==null) {
			ctrl = new Controller();
		}
		
		return ctrl;
	}
	
	
	public I_MeMo choice(int n) {
		I_MeMo memo =null;
		switch (n) {
		case 1:
			memo = new Person_Address();
									
			break;

		default:
			memo = new Person_Name();
			break;
		}
		
		
		return memo;
	}
	
	
	
	

}
