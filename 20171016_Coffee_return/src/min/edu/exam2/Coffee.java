package min.edu.exam2;

public class Coffee {
	
	static int fee =1000;
	static int coffeeValue= 300;

	public static void main(String[] args) {
		
		
		int b = Cup.cup(fee);
		float payback = Back_Pay.backPay(b);
		
		
		
		System.out.printf("커피는 %d잔,잔돈은 %f원",b,payback);
		
	}

}
