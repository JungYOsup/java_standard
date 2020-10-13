import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//시리얼번호 A가 시리얼번호 B의 앞에 오는 경우는 다음과 같다.
//1.A와 B의 길이가 다르면, 짧은 것이 먼저 온다.
//2.만약 서로 길이가 같다면, A의 모든 자리수의 합과 B의 모든 자리수의 합을 비교해서 작은 합을 가지는 것이 먼저온다. (숫자인 것만 더한다)
//3.만약 1,2번 둘 조건으로도 비교할 수 없으면, 사전순으로 비교한다. 숫자가 알파벳보다 사전순으로 작다.
//
//시리얼이 주어졌을 때, 정렬해서 출력하는 프로그램을 작성하시오.

//첫째 줄에 기타의 개수 N이 주어진다. N은 1,000보다 작거나 같다. 둘째 줄부터 N개의 줄에 시리얼 번호가 하나씩 주어진다. 
//시리얼 번호의 길이는 최대 50이고, 알파벳 대문자 또는 숫자로만 이루어져 있다. 시리얼 번호는 중복되지 않는다.

//입력
//5
//ABCD
//145C
//A
//A910
//Z321

//출력
//A
//ABCD
//Z321
//145C
//A910

//Hint
//char a= 'a'; 
//char c= '0';

//int d = a-c; //이렇게 char-char를 하면 int 형 (아스키코드 - 아스키코드)


public class HighLevel_Array_1431 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int Num =scan.nextInt();

		String[] array = new String[Num];

		for(int i=0; i<array.length; i++) {
			String value = scan.next();
			array[i] =value;
		}



		sort(array);
	}

	public static void sort(String[] array) {

		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {

				if(o1.length()>o2.length()) {
					return 1;
				}else if(o1.length()<o2.length()) {
					return -1;
				}else{ //만약 길이가 같다면 
					if(getSum(o1)>getSum(o2)) { //합을 비교한다.
						return 1;
					}else if(getSum(o1)<getSum(o2)){
						return -1;
					}else { // 합이 같으면 , 사전식순으로 비교한다 !!
						return o1.compareTo(o2);
					}
				}

			}
		});

		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public static int getSum(String a) {

		int n = a.length();
		int sum =0;

		char[] b=a.toCharArray();

		//만약 b[i]의 값이 문자형일경우 b[i]-'0'을 하면 int형이 나오고 그 값은 무조건 9초과 또는 0 미만이다. 
		//문자형 대문자 A의 아스키코드가 65이므로
		//b[i]가 숫자면 -'0'을 하면 int형이 고 무조건 9 이하 0이상이다.
		for(int i=0; i<n; i++) {
			if(b[i]-'0'<=9 && b[i]-'0'>=0) {
				sum += b[i]-'0'; //sum이 인트이고 b[i]는 문자형이므로 -'0'을 해줌으로 int로 바꿔줌
			}
		}

		return sum;


	}



}
