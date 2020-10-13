package min.edu.ctrl;

import min.edu.I_Memo;
import min.edu.Person_Address;
import min.edu.Person_Name;

public class Controller {
	//SingleTon Pattern 
	 //목적: 사용되는 클래스를 메모리(Heap영역, Method area 영역이 아니라)에 한번만 생성할 수 있도록 한다. 
	// 			즉 이말은 생성자를 호출되는 횟수를 1번으로 하면됨
	// 			외부에서 생성자를 호출되지 않도록 하고 내부에서 만들어서 보내주면 됨
	
	public static int Ctrl_Count = 1;
	
	//2.내 자신의 객체(instance)가 메모리에 있는지 없는지 판별하고 , 있다면 담겨져 있는 주소를 주고 , 없다면 내 자신이 new 를 통해서 ctrl에 담아줘서 넘겨줌 
	public static Controller ctrl; //래퍼런스를 담는변수 ,//ctrl의 초기값은 null;
	
	//1 생성자의 private 접근 제한자 처리를 한다 (외부에서 생성자를 호출되지 않도록 하고,외부에서 호출하면 여러번 생성할수도 있으니까)
	private Controller() {
		Ctrl_Count++;
	}
	
	public static Controller getInstance() {
		
		if(ctrl == null) //처음에 객체가 메모리에 없으므로 new 를 통해서 넘겨주고 , 그 이후부터는 계속 메모리에 있으므로 new를 선언하지 않고 계속 ctrl의 주소를 넘겨준다.
		{
			ctrl = new Controller(); //(생성자가 호출되는 횟수를 한번함)  (내부에서 만들어서 보내주면 됨)
		}
		
		
		return ctrl;
		
	}
	
	
	public I_Memo choice(int n ) {
		I_Memo m = null;
		
		switch (n) {
		case 1:
			m = new Person_Name();
		
			break;
		

		default:
			m = new Person_Address();
			break;
		} // switch-case
		
		
		return m;
	}
	
	

}
