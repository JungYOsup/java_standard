import java.util.Scanner;

//GCD : 최대공약수
//LCM : 최소공배수
//최대공약수를 구한 다음에 최소 공배수를 구하면 된다.

//첫번째 방법 : 결과값은 제대로 나오는데 틀렸다는 결과를 보여짐
//두번재 방법 : sum을 틀렸다고 나온것이다. int가 아닌 long으로 해야하는 이유가 뭘까? 

public class problem_9613_GCD합 {
	
	public static int gcd(int a, int b) {
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		
		return a;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while(t-->0) {
			
			long sum =0; //int 로 할경우 "틀렸습니다"
			int n = scan.nextInt();
			int[] array = new int[n];
			while(n-->0) {
				
				int value = scan.nextInt();
				array[n] = value;
								
			}
			
			for(int i=0; i<array.length-1; i++) {
				for(int j=i+1; j<array.length; j++) {
					sum+=gcd(array[i], array[j]);
				}
			}
			
			System.out.println(sum);
			
		}
		

	}
	
	
	

}
