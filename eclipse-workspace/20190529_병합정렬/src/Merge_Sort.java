import java.util.Arrays;

//병합정렬도 퀵정렬과 마찬가지로 "분할 정복"(퀵에서 두가지로 나눠서 적용했던 방법) 방법을 채택한 알고리즘이기 때문에 시간복잡도가 O(N*logn)이 걸린다.
//병합정렬은 퀵 정렬과 다르게 피벗값(퀵에서 key값)이 없다.
//병합정렬은 일단 반으로 쪼개고 나중에 합치는 정렬
//ex) 7,6,5,8,3,5,9,1
//-> 7 6 5 8 3 5 9 1 로 (1)하나씩 나올때까지 쪼갬
//(2)이것을 2개씩 합침
//(3)합칠때 순서를 맞춤
//-> 6,7  5,8  3,5  1,9 
//(4)이것을 2개씩 합침
//(5)합칠때 순서를 맞춤
//-> 5,6,7,8, 1,3,5,9
//(6)이것을 2개씩 합침
//(7)합칠때 순서를 맞춤
//-> 1,3,5,5,6,7,8,9

//병합정렬이 평균적으로 퀵정렬보다 딱히 빠르지는 않으나 ***시간복잡도 O(n*logn)을 보장한다는거
//병합정렬은 "기존의 데이터를 담을 추가적인 배열공간이 필요하다"는 점에서 메모리 활용이 비효율적이다.
//이 문제를 해결해줄것이 힙정렬

public class Merge_Sort {

	//즉 전역변수로 선언해줌으로써 공통으로 이용함으로써 필요할때마다 배열을 생성하는 비효율적인면을 방지하기 위함.
	//**그리고 일반적으로 정렬배열은 반드시 전역변수로 선언한다.
	static int number = 8;
	static int[] sorted = new int[number]; //**이렇게 전역변수로 배열을 선언해주는 이유는 우리가 하나씩 쪼개진 것들을 합칠때마다 새로운 배열을 필요로 하기때문

	public static void main(String[] args) {
		//m : 시작점 
		//middle : 중간점 
		//n : 끝점
		
		int[] a ={4,5,3,2,1,6,7,8};
		
		mergeSort(a, 0, sorted.length-1);
		
		for(int i=0; i< a.length; i++) {
			System.out.print(a[i]);
		}
		
		
	}
	public static void Merge(int a[] , int m , int middle, int n) {

		int i = m;
		int j = middle+1;
		int k = m;

		//작은 순서대로 배열에 삽입

		while(i<=middle&&j<=n) {
			if(a[i]<=a[j]) {
				sorted[k] = a[i];
				i++;
			}else {
				sorted[k] = a[j];
				j++;
			}
			k++;
		}

		// 남은 데어터도 삽입

		if(i>middle) {
			for(int t = j; t<=n; t++) {
				sorted[k]=a[t];
				k++;
			}
		}else {
			for(int t = i; t<=middle; t++) {
				sorted[k]=a[t];
				k++;
			}
		}

		//정렬된 배열을 삽입
		for(int t =m; t<=n; t++) {
			a[t]=sorted[t]; //-->기존의 데이터를 담을 추가적인 배열 공간이 필요하다는 점에서 메모리 활용이 비효율적이라는 문제가 있다.
		}

	}



	public static void mergeSort(int a[], int m, int n) {
		//크기가 1보다 큰 경우
		if(m<n) {
			int middle = (m+n)/2; //일단 나누고
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			
			Merge(a, m, middle, n); //나중에 합친다.
		}
	}
}
