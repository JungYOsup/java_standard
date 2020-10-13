package min.edu;

import min.edu.inputNumber;
import min.edu.perpect.Perfect_Number;

public class Yaksu_Main {
	
	public static void main(String[] args) {
		
		/*Yaksu y = new Yaksu();
		
		y.make(n);*/
		
			
		System.out.println("원하시는 약수를 입력해 주세요");
		
		Perfect_Number pn = new Perfect_Number();
		int n = inputNumber.scannerNum();
		
		pn.perfectNum(n);
		
		
		
		/*Perfect_Number p = new Perfect_Number();
		p.friendlyNum(50000);*/
		
	}
}
