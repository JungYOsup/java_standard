import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//첫째 줄에 N(1 ≤ N ≤ 105)과 S(1 ≤ S ≤ 109)가 주어진다. 둘째 줄에 동생의 위치 Ai(1 ≤ Ai ≤ 109)가 주어진다. 동생의 위치는 모두 다르며, 수빈이의 위치와 같지 않다.
//출력 
//가능한 D값의 최댓값을 출력한다.

//해결방법 : 공통된 거리의 약수의 최대값을 구하면 된다.
//ex) 나의 위치 2 , 동생의 위치 14 23 8 이라고 했을때 
//12,21,6 의 거리에서 이 거리의 약수의 최대값을 구하면 된다. 즉 최대 공약수를 구하면 된다.
//3

public class problem_17087_숨바꼭질6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();//동생들의 수 
		int x = scan.nextInt(); //수빈이의 위치
		int[] array = new int[num];

		while(num-->0) {
			int y = scan.nextInt();//동생들의 위치
			array[num] = Math.abs(x-y); 			

		}

		int ans = array[0];
		
		for(int i=1; i<array.length; i++) {
			ans = GCD(ans,array[i]);
		}
		System.out.println(ans);



	}





	public static int GCD(int a, int b) {

		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}

		return a;



	}

}
