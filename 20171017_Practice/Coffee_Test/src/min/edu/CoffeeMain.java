package min.edu;

import java.util.Scanner;

public class CoffeeMain {

	public static void main(String[] args) {

		int a=Coffee_Scan.scan();
		
		Coffee_Input ci = new Coffee_Input();
		ci.coffeemenu(a);
		
		
	}

}
