import java.util.Scanner;

public class problem_1934_최소공배수 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		
		
		while(num-->0) {
			
			int a = scan.nextInt();
			int b=  scan.nextInt();
			
			int g = GCR(a,b);
			
			int l = g*(a/g)*(b/g);
			System.out.println(l);
						
		}
				
	}
	
	public static int GCR(int a, int b) {
		
		while(b!=0) {
			int r =a%b;
			a=b;
			b=r;
		}
		return a;
		
		
	}
}
