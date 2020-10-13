package min.edu.exam2;

public class Back_Pay {
	
	
	public static float backPay(int a) {
		
		float f = 0.0f;
		float c = 3;
		
		f = Coffee.fee%(a*Coffee.coffeeValue);
		
		return f;
		
	}

}
