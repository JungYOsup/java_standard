import java.util.Arrays;

//소수: 약수가 1과 자기 자신 밖에 없는 수
//N이 소수가 되려면, 2보다 크거나 같고, N-1보다 작거나 같은 자연수로 나누어 떨어지면 안된다



public class 소수_모든자연수중에소수판별_에라토스테네스의체 {

	public static void main(String[] args) {

		int[] prime = new int[100]; //소수 저장
		int pn =0; //소수의 갯수
		int n =100; // 100까지의 소수
		boolean[] check = new boolean[101]; // 지워졌으면 true; //boolean 배열은 기본값이 false가 들어간다. 


		for(int i=2; i<=n; i++) {
			if(check[i]==false) {
				prime[pn++] = i;

				for(int j=i*2; j<=n; j+=i) {
					check[j] = true;
				}

			}
		}

		System.out.println(pn);

		
// 이걸로 한것이 시간이 더 절약될듯
//		for(int i=2; i*i<=n; i++) {
//
//			if(check[i]==true) {
//				continue;
//			}
//
//			for(int j=i*2; j<=n; j+=i) {
//				check[j] = true;
//			}
//
//		}
//
//		for(int i=2; i<check.length; i++) {
//			if(check[i] == false) {
//				pn++;
//			}
//		}
//		System.out.println(pn);


	}



}
