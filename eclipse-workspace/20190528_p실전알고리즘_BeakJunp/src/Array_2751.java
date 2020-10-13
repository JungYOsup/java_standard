import java.util.Scanner;

//https://www.acmicpc.net/board/view/31887 수 정렬하기에 관한 필수적인 개념들

//온라인 채점 시스템의 경우에는 1초당 1억번의 연산을 하므로 
//N의 조건이 (1<=N<=1000000)번 이므로 어떠한 정렬을 사용하던 최대 1000000000(=10억)가 걸리므로 
//시간복잡도 O(n*logn)을 요구한다. 왜? 시간복잡도 O(n*2)일 경우 위처럼 최대 10억번이 작동되므로 최대 10초가 걸리게 된다.
//따라서 이 문제를 해결하기 위해서는 버블,선택,삽입은 될수가없다.
//그렇다면 퀵정렬이 시간복잡도가 O(n*logn)이므로 이것을 사용하면 어떨까?
//프로그래밍 쪽에서는 일반적으로 시간복잡도 O(n*logn)을 요구하는 곳에서 퀵 정렬을 쓸떄 해결되지 못하도록함.. 
//따라서 이 문제는 sort()나 병합정렬 등을 사용해야한다.
//그런데 이 문제에서도 sort()를 사용할시 시간초과가 뜨는데  Array.sort는 퀵정렬을 기반으로 하나 별도의 처리를 거쳣다는 점에서 최악의 경우인 O(n^2)에도
//O(n*logn)을 보장한다고는 하나, 연산개수가 많아질경우에는 안되는건 안되더라.

//Java에서 Arrays.sort에 primitive type array를 전달하면 dual-pivot quicksort를 수행하기 때문에 최악의 경우 O(N^2)이 됩니다. 
//이는 보통의 방법으로는 웬만해서는 O(N^2)이 안 되지만 이 문제에는 https://www.acmicpc.net/board/view/34491 에 의해 추가된 저격 데이터가 있습니다. 
//Collections.sort를 사용하는 편이 좋습니다.


//즉 이 문제는 버블,선택,삽입,퀵,Sort()함수 다 안됨
//해결할수 있는것은 병합정렬 등 
//병합 정렬을 할 때, merge를 수행할 때마다 배열의 전체 크기만큼을 할당하고 해제하기를 반복하면 안 됩니다. 
//크기가 N인 메모리를 할당하는 것은 O(N) 시간이 걸리고, merge가 O(N)번 호출되기 때문에 총 시간복잡도가 O(N^2)이 됩니다. 
//이를 해결하기 위한 방법으로는,
//1.복사를 하기 위한 큰 배열 하나를 미리 할당해두고 계속 사용
//2.merge가 담당하는 구간의 크기만큼만 메모리를 할당 등이 있습니다.


public class Array_2751 {
	
	static int[] sort = new int[1000000];
	
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); 

		int size = scan.nextInt();
		int [] array = new int[size];

		for(int i=0; i<size; i++) {
			int value = scan.nextInt();
			array[i] = value;
		}
		
		Merge_Sort(array, 0, array.length-1);

		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}


	public static void Merge(int[] array, int m , int middle, int n) {

		int i = m;
		int j = middle+1;
		int k = m;


		while(i<=middle&&j<=n) {

			if(array[i]<=array[j]) {
				sort[k] = array[i];
				i++;
			}else {
				sort[k] = array[j];
				j++;
			}
			k++;
		}

		if(i>middle) {
			for(int t=j; t<=n; t++) {
				sort[k] = array[t];
				k++;
			}
		}else {
			for(int t=i; t<=middle; t++) {
				sort[k] = array[t];
				k++;
			}
		}

		for(int t=m; t<=n; t++) {
			array[t]=sort[t];
		}

	}

	public static void Merge_Sort(int[] array, int m , int n) {

		if(m<n) {
			int middle = (m+n)/2;

			Merge_Sort(array, m, middle);
			Merge_Sort(array, middle+1, n);
			Merge(array,m,middle,n);

		}

	}

}
