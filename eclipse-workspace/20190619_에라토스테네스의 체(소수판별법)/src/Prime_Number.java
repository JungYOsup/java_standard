import java.util.Scanner;

// 소수 판별 알고리즘
// 소수란 : 양의 약수를 오직 두개만 가지는 자연수 (즉 1과 자기자신을 가지는 것이 소수)
// 2,3,5,7,11 등 

public class Prime_Number {


	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println("소수입니까?" + isPrimeNumber(x));
		System.out.println("소수입니까?" + Useful_isPrimeNumber(x));
		Eratos(x);
		
	}

	// 이런게 작성할 경우 시간 복잡도는 O(N)
	public static boolean isPrimeNumber(int x) {
		for(int i=2; i<x; i++) {
			if(x%i==0) {
				return false;
			}

		}
		return true;
	}

	// 제곱근까지만 약수의 여부를 검증하면 된다.
	// 이런게 작성할 경우 시간 복잡도는 O(N/2)
	public static boolean Useful_isPrimeNumber(int x) {

		int end = (int) Math.sqrt(x);

		for(int i=2; i<=end; i++) {
			if(x%i==0) {
				return false;
			}

		}
		return true;
	}

	// 다만 이렇게 하나의 소수를 판별하는것이 아니라 대량의 소수를 한꺼번에 판별하고자 할때 사용하는것이 바로 에라토스테네스의 체 이다.
	// 에라토스테네스의 체는 가장 먼저 소수를 판별할 범위만큼 배열을 할당에 그 인덱스에 해당하는 값을 넣어줍니다.
	// ex) 25 까지 중 소수를 구하시오 ! 
	// 25개의 배열의 index 값을 넣어줍니다 {1,2,3,4,5,6,7,8, --- , 25}
	// 2의 배수중 자기자신을 제외한 배수를 제외시켜준다. -> 4, 6, 8 -- 지워줌
	// 3의 배수중 자기자신을 제외한 배수를 제외시켜준다. -> 3 ,6 ,9 -- 지워줌 ( 단 이미 지워준거면 건너뛴다 ) 
	// 4의 배수는 이미 2의 배수에 의해 4가 지워졌기 때문에 하지 않는다. (4의 배수가 2의배수이기때문)

	public static void Eratos(int x) {

		int[] array = new int[x+1];
		
		for(int i=2; i<array.length; i++) {
			array[i] = i;
		}
		
		for(int i=2; i<array.length; i++) {
			
			if(array[i]==0) continue;
			
			for(int j=i+i; j<array.length; j+=i) {
				
				array[j] =0;
				
			}
			
			
		}
		
		for(int i=2; i<array.length; i++) {
			if(array[i]!=0) {
				System.out.print(array[i]);
			}
		}
		
		
	}
}
