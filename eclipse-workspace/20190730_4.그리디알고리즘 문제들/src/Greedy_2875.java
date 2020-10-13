import java.util.Scanner;

public class Greedy_2875 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int girl = scan.nextInt();
		int boy = scan.nextInt();
		int internship = scan.nextInt();
		int team = 0;
		
		while(girl>=2 && boy >=1 && girl+boy>=internship+3) {
			
			girl -= 2;
			boy--;
			team++;
			
			
		}
		
		System.out.println(team);
				
	}
	
		
}
