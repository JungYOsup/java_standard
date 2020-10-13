import java.util.Arrays;
import java.util.Scanner;

//첫번째 줄은 갯수(N)
//둘째 줄부터 N개의 줄에는 숫자가주어진다.

//ex)  
//5           ->    1
//1                 2    
//3                 3
//4                 4
//2                 5  
//5

//온라인 채점 시스템의 경우에는 1초당 1억번의 연산을 하므로 
// N의 조건이 (1<=N<=1000)번 이므로 어떠한 정렬을 사용하던 최대 1000000가 걸리므로 
// 버블,선택,삽입,퀵 정렬을 사용해도 상관없다. -> 왜? 이들의 최악은 O(n^2)인데 이 문제의 최대 정렬횟수를 해도 1000000가 걸리므로 1초에 1억번 연산하는 채점시스템에서는 상관이 없다.

// Arrays.sort() 는 퀵 정렬을 구현한 것
// 결과
// 선택 ,퀵정렬,Array.sort 는 셋다 통과된다



public class Array_2750 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int size = scan.nextInt();
		if(size>1000)return;
		int [] array = new int[size];

		for(int i=0; i<size; i++) {
			int value = scan.nextInt();
			if(value>1000)return;
			array[i] = value;
		}

		Array_2750(array,0,array.length-1);

		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}
	public static void Array_2750(int[] array, int start, int end) {

		//퀵정렬의 범위 매우중요!!
		if(start>=end) {
			return;
		}

		int i = start+1;
		int j = end;
		int key = start;
		int temp;

		while(i<=j) {
			//퀵정렬 범위 배우중요
			while(i<=end&&array[key]>=array[i]) {
				i++;
			}
			while(j>start&&array[key]<=array[j]) { //why j>start이지.. 이렇게하면 j--를 하므로 j가 start까지 도달함.
				j--;
			}

			if(i<j) {
				temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}else {
				temp= array[j];
				array[j] = array[key];
				array[key] =temp;
			}



		}
		Array_2750(array, start, j-1);
		Array_2750(array, j+1, end);
	}
}

//	public static void Array_2750(int[] array) {
//
//		Arrays.sort(array);
//
//	}




//선택정렬을 사용
//	public static void Array_2750(int[] array) {
//		int i,j,min,temp;
//		int index=0;
//
//		for(i=0; i<array.length; i++) {
//
//			min = 1001;
//
//			for(j=i; j<array.length; j++) {
//
//				if(min>array[j]) {
//					min=array[j];
//					index=j;
//				}
//
//			}
//
//			temp = array[index];
//			array[index] = array[i];
//			array[i]=temp;
//
//		}
//
//	}












