import java.util.Arrays;
import java.util.Scanner;

//5가지를 다 돌리는데 120가지가 나오므로 
//주어진 최대값이 1000이므로 -> 1억이 넘어가버림 따라서 전체의 경우의 수를 구한다음에 최소시간을 찾는 방법은 옳지 않다.

//방법을 보니 가장 작은수부터 계속 더해주면 그 값이 최소가 되는것을 알수 있다.
//따라서 입력값을 가장 작은수부터 나열한다음에 게속 더해주면 된다.

public class Greedy_11399 {
	
	public static void main(String[] args) {
	
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int array[] = new int[num];
		
		for(int i=0; i<num; i++) {
			int value = scan.nextInt();
			array[i] = value;
		}
		
		// 최대값이 1000 이므로 시간복잡도가 O(n^2) 여도 상관이 없겠구나.. 괜한걱정을 ㅠ
		Arrays.sort(array);
		
		Greedy_11399(array);
		
		
		
	}
	
	public static void Greedy_11399(int[] array) {
		
		int sum =0;
		
		for(int i=1; i<=array.length; i++) {
			
			for(int j=0; j<i; j++) {
				
				sum += array[j];
				
			}
			
		}
		
		System.out.println(sum);
		
		
	}
}
