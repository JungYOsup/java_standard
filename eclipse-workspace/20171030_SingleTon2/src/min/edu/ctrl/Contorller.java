package min.edu.ctrl;

import min.edu.I_Memo;
import min.edu.Person_Address;
import min.edu.Person_Name;

public class Contorller {
	
	static Contorller Control;
	private Contorller() {
		
	}
	
	public static Contorller SingleTon() {
		
		if(Control== null) {
			Control = new Contorller();
		}
		
		return Control;
		
		
		
		
	}
	
	
	
	
	
	
	
	public I_Memo choice(int n) {
		I_Memo imemo = null;
		switch (n) {
		case 1:
			imemo = new Person_Address();
			imemo.output();
			imemo.command();
			break;

		default:
			imemo = new Person_Name();
			imemo.output();
			imemo.command();
			break;
		}
		
		return imemo;
	}

}
