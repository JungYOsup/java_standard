import java.util.HashMap;
import java.util.Scanner;

//첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 10,000보다 작거나 같은 자연수이다.
//첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

//개수가 천만이니까 N^2은 천억이 넘어가네.. 그러면 기본 정렬인 버블,삽입,선택은 안되고 why? O(N^2)
//퀵, sort , 병합도 안되겟네 why? O(N*logN)이므로
//따라서 계수정렬을 이용해야겠다. 계수정렬의 시간복잡도는 O(N)이므로 ...

//계수정렬과 비슷한 hashMap도 한번 사용해보자


public class HighLevel_Array_10989 {

	static int[] a = new int[10001];
	
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
//		
//		int[] array = new int[num];
//		
//		for(int i=0; i<array.length; i++) {
//			int value = scan.nextInt();
//			array[i]= value;
//		}
//		
//		Counting_Sort(array);
//		System.out.println();
//		Hash_Map(array);
//		
//
//	}
	//Counting_Sort의 문제점이라 하면 그 데이터의 값만큼 배열이 카운팅 되므로 
	//배열의 크기를 10이라고 하면 그 이하의 수를 입력해야지 그보다 배열의 크기보다 큰 수를 입력하면 오류가 발생한다. 
	//-> 시간초과..
	public static void Counting_Sort(int[] array) {
		
		int[] sorted = new int[array.length];
		
		for(int i=0; i<sorted.length; i++) {
			sorted[i] =0;
		}
		
		for(int i=0; i<sorted.length; i++) {
			sorted[array[i]-1]++;
		}
		
	
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<sorted[i]; j++) {
				System.out.print(i+1);
			}
		}
		
		
		
	}
	//위의 Counting_Sort의 문제점을 방지하고자 hash_Map을 써보자 -> 시간초과..
	public static void Hash_Map(int[] array) {
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		
		for(int key : array) hm.put(key, hm.getOrDefault(key, 0)+1);
		
		for(int key :hm.keySet())
			for(int i=0; i<hm.get(key); i++) {
				System.out.print(key);
			}
		
	}
	
	//또다른 계수정렬 -> 시간초과..
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Num = scan.nextInt();
		for(int i=0; i<Num; i++) {
			int value=scan.nextInt();
			a[value]++;
			
		}
		
		
		for(int i=0; i<10001; i++) {
			while(a[i]!=0) {
				System.out.println(i);
				a[i]--;
			}
		}
		
	}
	

}
