import java.util.Scanner;



public class problem1929_소수구하기 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		boolean[] isc = new boolean[b+1];
		int n =0;
		
		isc[0]=isc[1]=true;
		
		for(int i=2; i*i<=b; i++) {
			
			if(isc[i]==true) {
				continue;
			}
			
			for(int j=i*2; j<=b; j+=i) {
				isc[j]=true;
			}
		}
		
		for(int i=a; i<=b; i++) {
			if(isc[i] == false) {
				System.out.println(i);
			}
		}
			
		
		
		
			
		
		
		

	}

}
