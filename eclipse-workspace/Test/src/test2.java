import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		for(int i=1; i<=a*b; i++) {
			
			System.out.print("*");
			
			
			if(i%a==0) {
				System.out.println();
			}
			
			
		}
		
				

	}

}
