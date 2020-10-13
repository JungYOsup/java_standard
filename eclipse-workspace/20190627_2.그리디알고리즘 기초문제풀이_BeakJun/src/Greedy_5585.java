import java.util.Scanner;

public class Greedy_5585 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int exchange = scan.nextInt();
		
		int cost = 1000-exchange;
		
		Greedy_5585(cost);
		
	}
	
	public static void Greedy_5585(int cost) {
		
		int value = cost; 
		int sum =0;
		
		
		sum += value / 500; 
		value = value % 500; 
				
		sum += value / 100; 
		value = value % 100; 
		
		sum += value / 50;
		value = value % 50;
		
		sum += value / 10;
		value = value % 10;
		
		sum += value / 5;
		value = value % 5;
		
		sum += value / 1;
		value = value % 1;
		
		System.out.println(sum);
		
		
	}

}
