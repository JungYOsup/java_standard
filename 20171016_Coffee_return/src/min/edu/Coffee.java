package min.edu;

public class Coffee {

	public static void main(String[] args) {
		int result = CoffeeMake.makecoffee(1000, 100);
		CoffeePrint cp = new CoffeePrint();
		cp.print(result);

	}

}
