import java.util.Scanner;

//의 0이 몇 개 인지 알아내려면 N!을 소인수분해 했을 때, 2와 5가 몇 개 나오는지 알아야 한다.
//5의 개수가 항상 2의 개수 보다 적기 때문에, 5의 개수만 세어주면 된다.
//N! 0의 개수 = ⌊N/5⌋ + ⌊N/52⌋ + ⌊N/53⌋ + …
public class problem_1676_팩토리얼0의개수 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i=5; i<=num; i*=5) {
			sum += num/i; 
		}
		
		System.out.println(sum);
			

	}

}
