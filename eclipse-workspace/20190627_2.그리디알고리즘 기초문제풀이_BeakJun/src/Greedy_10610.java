import java.util.Scanner;

//N 는 최대 10^5개의 숫자로 구성되어있다 -> 자리수가 100000자리수 이다라는 말이다.
//따라서 기존에 런타임 오류가 나타났던 이유는 parsein를 썻는데 parseInt 같은 경우는 String->int로 바꿀때 숫자가 1000000자리수보다 작기 때문에 오류가 떠서 런타임 오류가 발생하는것이다.

public class Greedy_10610 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String value = scan.next();

		Greedy_10610(value);
	}

	public static void Greedy_10610(String value) {
		char[] array = value.toCharArray();
		int [] number = new int[10];
		int result = 0;

		// 각 자리수의 합을 구한다.
		for(int i=0; i<array.length; i++) {
			number[array[i]-'0']++;
			result += array[i]-'0'; 
		}

		String sum ="";

		// 30의 배수는 3의 배수이면서 1의자리가 0이 아니면 안되므로 , 102 같은경우 result가 3의 배수이면서 마지막 자리가 0이 될수 있으므로 30의 배수라고 할수 있다.
		if(result%3==0 && number[0]!=0) {
			for(int i=9; i>=0 ; i--) {
				for(int j=0; j<number[i]; j++) {
					sum += i;
				}
			}
		}else {
			System.out.println(-1);
		}
		System.out.println(sum);
	}
}