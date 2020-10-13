import java.util.Scanner;

// 그리디 알고리즘은 "당장 눈 앞에 보이는 최적의 상황만을 쫒는 알고리즘"
// 그리디 알고리즘은 기본적으로 무조건 큰 경우대로, 무조건 작은 경우대로, 무조건 긴 경우대로, 무조건 짧은 경우대로 등으로 극단적으로 문제에 접근한다는 점 
// 예를들어 1260원 화페를 500원 100원 50원 10원으로 거슬러주는 가장 간단한 방법은 ? -> 무조건 큰 동전으로 먼저 나눠준다.
// 500원짜리 2개 100원짜리 2개 50원짜리 1개 10원짜리 1개 이다.즉 6개의 동전만 거슬러 주면 되고 
// 이렇게 단순하게 큰 경우부터 찾는 알고리즘과 같이 간단하게 문제를 해결하는 것이 "그리디 알고리즘"이다.

public class Greedy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int cost = scan.nextInt();
		int result=0;
		
		result += cost/500; 
		cost = cost%500; 
		
		result += cost/100;
		cost = cost%100;
		
		result += cost/50;
		cost = cost%50;
		
		result += cost/10;
		cost = cost%10;
		
		System.out.println(result);
		
		
		
	
	
		
		
	}

}
