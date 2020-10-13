import java.util.Scanner;

//소수: 약수가 1과 자기 자신 밖에 없는 수
//N이 소수가 되려면, 2보다 크거나 같고, N-1보다 작거나 같은 자연수로 나누어 떨어지면 안된다


public class 소수_특정수소수판별 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();

		System.out.println(prime(a));
		System.out.println(Goodprime(a));
		System.out.println(Bestprime(a));
	}

	public static boolean prime(int a) {

		if(a<2) {
			return false;
		}else {
			for(int i=2; i<=a-1; i++) {

				if(a%i==0) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean Goodprime(int a) {

		if(a<2) {
			return false;
		}else {
			for(int i=2; i<=a/2; i++) {

				if(a%i==0) {
					return false;
				}
			}
		}

		return true;
	}

	public static boolean Bestprime(int a) {

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
