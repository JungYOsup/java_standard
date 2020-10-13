import java.util.Scanner;

public class problem1978_소수찾기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int num = scan.nextInt();
		int sosu =0;
		
		while(num-->0) {
			
			int a = scan.nextInt();
			if(isCheck(a)) {
				sosu++;
			}
			
		}
		System.out.println(sosu);
		
	}
	
	public static boolean isCheck(int a) {
		
		if(a<2) {
			return false;
		}else {
			for(int i=2; i*i<=a; i++) {
				
				if(a%i==0) {
					return false;
				}
			}
		}
		
		return true;
		
		
		
		
	}

}
