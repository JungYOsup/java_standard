package Youtube;

import java.util.Arrays;

//QuickSort란? 
//평균 걸리는 시간 O(nlogn)
//퀵정렬이란 배열을 중간으로 기준을 잡은다음 왼쪽에는 자기보다 작은값 오른쪽에는 자기보다 큰값으로 둔다 그리고 작은부분에서 다시 기준 , 큰 부분에서 기준을 잡고 다시 기준 왼쪽에는 기준보다 작은값 , 기준 오른쪽에는 기준보다 큰값을 넣는다.ㄴ
//ex 5,1,8,6,3,0,7 라 할때
//기준 6으로 잡고 6 왼쪽에는 6보다 작은값 오른쪽에는 6보다 큰값을 둔다. (0,3,1,5),6,(7,8) 
//작은 부분,큰부분의  기준을 잡아준다 
//작은부분 3으로 기준을 잡으면 3보다 작은값은 왼쪽 큰값은 오른쪽 (1,0,3,5)
//큰부분 7로 기준을 잡으면 (7,8)
//이런식으로 반복하다보면 
//빠르게 정렬이 된다.

//그러나 최악의 경우에는 평균 걸리는 시간이 O(n^2)이다.
//그 이유는 만약 ex) 3,9,4,7,0,1,5,8,6,2, 라고 할때 중간값을 기준으로 잡았는데 제일 작은값이다. 
//즉 0,3,9,4,7,1,5,8,6,2 
//그런데 여기서 또 가운데를 기준으로 잡았더니 또 제일 작은값이다.
//즉0,1,9,4,7,1,5,8,6,2 
//이런식으로 기준이 매번 가장 작은값이거나 가장 큰값일때는 최악의 경우이므로 평균 걸리는 시간이 O(n^2)이다.

//그렇다면 어떻게 기준값 왼쪽으로는 작은값 , 기준값 오른쪽으로는 큰값을 넣을수 있을까?
//ex) 3,9,4,7,5,0,1,6,8,2 라고 할때 기준값을 5라고 잡고 0번째 index를 변수 s로 잡고 , 마지막 index를 변수 e로 잡은뒤에
//s<기준값 ,e>기준값 일경우 무시하면서 기준index를 향해 간다.
//따라서 3이 5보다 작으므로 건너뛰고 9는 5보다크니 잠깐 기다린다. e=2일때 5보다 작으니 s와e의 위치를 바꿔준다. 
//그러면 3,2,4,7,5,0,1,6,8,9
//이런식으로 계속 작업을 하다보면 s와e가 서로 위치가 바뀌면 중단한다.
//만약 배열방이 한개일 경우에는 정렬하지 않고 중단한다.

//결론 : 1)파티션만드는 메서드 , 2)swap 하는 메서드 



public class Test {

	private static void QuickSort(int[] arr) {
		
		QuickSort(arr,0,arr.length-1);
	}
	
	private static void QuickSort(int[] arr, int start, int end) {
		
		int part2 = partition(arr,start,end); //index=5
		//재귀함수를 멈추는 곳
		if(start<part2-1) { //0<4
			QuickSort(arr,start,part2-1);
		}
		
		if(part2<end) {//5<9
			QuickSort(arr, part2, end);
		}
		
	}
	private static int partition(int[] arr, int start, int end) {
		
		int pivot =arr[(start+end)/2]; //중간값을 정한다
		
		System.out.println("피벗값"+pivot);
		
		while(start<=end) { //start가 end보다 작거나 같을때까지 돌려준다
			
			while(arr[start]<pivot) start++; //배열값이 pivot보다 작으면 무시
			while(arr[end]>pivot) end--; //배열값이 pivot보다 크면 무시
			
			
			if(start<=end) {
				swap(arr,start,end);
				start++;
				end--;
			}
			
			System.out.println(Arrays.toString(arr));
			
		}
		
		
		return start;
	}

	private static void swap(int[] arr, int start, int end) {

		
		int temp =arr[start];
		arr[start] = arr[end];
		arr[end]=temp;
	}
	
	private static void printArray(int[] arr) {
		for(int data: arr) {
			System.out.print(data+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] arr = {9,7,5,11,12,2,14,3,10,6};
		
		printArray(arr);
		QuickSort(arr);
		printArray(arr);
		
	}
	
}
