package Youtube;

//병합정렬
//ex) 정렬되어있는 두개의 배열을 병합정렬로 합치는 방법
// a ={1,2,7,9,10} b={3,4,5,6,8} 라고할때

//--------------------------
// a ={1,2,7,9,10}
// b= {3,4,5,6,8}

// a의 첫번째 인덱스와 b의 첫번째 인덱스를 비교해서 작은것을 c에 넣어준다.


//c= {1
//--------------------------
//a ={2,7,9,10}
//b= {3,4,5,6,8}

//a의 첫번째 인덱스와 b의 첫번째 인덱스를 비교해서 작은것을 c에 넣어준다.


//c= {1,2
//--------------------------
//a ={7,9,10}
//b= {3,4,5,6,8}

//a의 첫번째 인덱스와 b의 첫번째 인덱스를 비교해서 작은것을 c에 넣어준다.
// c= {1,2,3
//--------------------------

//이런식으로 반복하다보면 c={1,2,3,4,5,6,7,8,9,10} 이 들어가게 된다.
//그렇다면 정렬되어있지 않은 배열은 어떻게 병합정렬을 할까?

//a = {4,2,6,3,7,8,5,1} 이라고 할떄
//  = {4,2,6,3} {7,8,5,1} 
//  = {4,2} {6,3} {7,8} {5,1}

//  = {4}
//    {2] 를 비교해서 작은것을 먼저 넣어준다
// {2,4}
// 그리고 이것을 원본에 복사한다.(덮어씌움)

// = {2,4} {6,3} {7,8} {5,1}

// = {6}
// = {3}
// {3,6}
//그리고 이것을 원본에 복사한다.(덮어씌움)

//= {2,4} {3,6} {7,8} {5,1}

//이런식으로 계속 하면 {2,4} {3,6} {7,8} {1,5}

//이것을 다시 비교한다 .
// {2,4}
// {3,6}

// {2,3,4,6} 

// 이런식으로 계속 하면 {2,3,4,6} {1,5,7,8}
//	{2,3,4,6} 
//  {1,5,7,8} 을 비교

//{1,2,3,4,5,6,7,8} 의 결과값이 나옴

//즉 비교해주어서 배열에 넣는 재귀함수를 반복적으로 하고, 길이만큼 배열에 넣어졌을때 재귀함수를 중단한다.

//함수가 호출될때마다 절반식 짤라서 재귀적으로 함수적으로 호출하고 제일 작은 조각부터 2개씩 병합해서 정렬된 배열을 merge 하는것이 MergeSort 이다.

//N개를 logn번(이진검색에서 배웠듯이 검색영역이 절반으로 줄어들때 시간 복잡도가 logN) 돌기때문에 시간 복잡도는 O(nlogN)이다. 

//그러나 mergesort는 자른 배열을 담을 상자가 필요하기 때문에 만약 담을 상자가 없으면 퀵Sort를 이용해야한다.

public class Test {
	
	public static void mergeSort(int[] arr) {
		
		int[] temp = new int[arr.length]; //임시저장공간
		
		mergeSort(arr,temp,0,arr.length-1); //배열 , 임시저장공간 , 시작 , 끝
		
	}
	
	private static void mergeSort(int[] arr, int[] temp, int start, int end) {
		
		//시작이 끝보다 작을동안만 재귀함수 진행
		if(start<end) {
			
			int mid = (start+end)/2; //index 4
			mergeSort(arr, temp, start, mid); //if조건을 만족할때까지는 계속 분할
			mergeSort(arr, temp, mid+1, end); //if조건을 만족할때까지는 계속 분할
			merge(arr,temp,start,mid,end); //두개로 나뉘어진 배열방을 합해준다
			
		}
		
		
	}
	
	// 두개로 나뉜 배열방을 값에 따라 순서에 맞게 병합해주는 merge 라는 함수를 정의하자
	// 정렬된결과를 반복적으로 저장하고 있는 배열의 포인터 , 임시저장장소 , 시작인덱스 , 파티션을 나누었던 중간인덱스 , 끝 인덱스
	private static void merge(int[] arr, int[] temp, int start, int mid, int end) {
		
		//우선 임시 저장소에 정렬이 된 배열을 필요한 만큼 복사를 해줌 
		for(int i =start; i<=end; i++) {
			temp[i] = arr[i];
		}
		//지금 두개가 중간을 기준으로 하나로 붙어 있으므로 첫번째 배열방에 첫번째 방이랑 , 두번재 배열의 첫번째 index 각각 part1과 part2로 저장함 
		int part1 = start; //0
		int part2 = mid+1; //1 
		int index = start; //0 //작은값을 하나씩 복사할때마다 결과 배열방에 어디에 저장해야하는지도 알아야하므로 
		
		while(part1<=mid &&part2<=end) {
			if(temp[part1]<=temp[part2]) {
				arr[index] = temp[part1];
				part1++;
			}else {
				arr[index] = temp[part2];
				part2++;
			}
			index++;
		}
		
		//뒷쪽 배열은 비었고 앞쪽배열의 데이터가 남아잇는경우
		//그 반대의 경우는 신경 안써도 된다..
		for(int i=0; i<=mid-part1; i++) {
			arr[index+i] = temp[part1+i];
		}
		
	}
	
	private static void printArray(int[] arr) {
		for(int data: arr) {
			System.out.print(data+",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int[] arr = {3,9,4,7,5,0,1,6,8,2};
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
		
	}
	
	
	

}
