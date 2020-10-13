import java.util.Arrays;

//힙 정렬은 병합정렬과 퀵정렬만큼 빠른 정렬 알고리즘입니다.
//실제로 고급프로그래밍 기법으로 갈수로 Heap의 개념이 자주 등장하기 때문에 
//반드시 알아두어야할 정렬 알고리즘이다.
//힙 정렬은 힘 트리구조를 이용하는 정렬입니다. 즉 정렬의 기초는 다음과 같다.

//자세한 설명은 
//https://blog.naver.com/ndb796/221228342808 참조

//힙 구조 조건 
//1. 완전 이진트리를 기반으로한다.
//2. 최대힙 구조이어야한다(부모노드가 자식노드보다 커야함)
//3. 최대힙이 아닐경우 힙 생성알고리즘(Heapify Algorithm)을 통해 최대힙 구조형태로 만들어준다.

//힙생성알고리즘은 시간복잡도가 O(logN) 이므로 만약 9개를 힙생성 알고리즘으로 최대힙 구조형태로 만들어준다면 
//9/2 = 4.5 ->내림-> 4번 만큼만 힙생성알고리즘을 사용하면된다.

//예를들어 배열이 {7,6,5,8,3,5,9,1,6} 이라 할때 
// 			7
//		6		5	
//    8	  3	  5	  9
//   1  6

// 7,6,5,8까지만 힙생성알고리즘을 사용한다.

// 이렇게 하게 되면 

// 			9
//		7		8	
//    6	  3	  5	  5
//   1  3

// 가 된다. (블로그에는 9,8,7,6,3,5,5,1,3)으로 되어있지만 코딩은 9,7,8 ~ 이 나와야지 정상이다.

// 그다음 가장 큰수인 제일 위에있는 9와 마지막수 3을 바꿔준다.

// 			3
//		8		7	
//    6	  3	  5	  5
//   1  9

// 맨 마지막 9를 제외하고 나머지를 또 힙생성알고리즘을 통해 바꿔준다.
// 이걸 반복적으로 시행하면

// 			1
//		3		5	
//    5	  6	  6	  6
//   8  9

// 이 된다.

// 즉 힙 정렬의 시간복잡도는 O(N*logn)
//이거 코딩할때는 어떤형식으로 heap이 만들어지고 어떤형식으로 바뀌고 어떤형식으로 순차적인 heap이 만들어 지는지 아는것이 중요하다.
//병합정렬과 다르게 추가적인 배열이 필요하지 않다는 점에서 메모리 측면에서 몹시 효율적이고 또한 항상 O(N*logN)을 보장할 수 있다!!


public class Heap_Sort {


	public static void main(String[] args) {

		int[] heap = {7,6,5,8,3,5,9,1,6};
		Heap_Sort(heap);
		
		
		for(int i=0; i<heap.length; i++) {
			System.out.print(heap[i]+",");
		}
	}

	//힙을 구성
	public static void Heap_Sort(int [] heap) {

		for(int i=1; i<heap.length; i++) {
			int c = i;  //child
			do {
				int root = (c-1)/2; //특정 원소의 부모
				if(heap[root]<heap[c]) { //부모의 값보다 자식의 값이 크면 위치를 바꿔준다.
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				c=root; //자식의 부모로 이동함

			}while(c!=0); ////최종부모까지 이동해서 검사하기 위함
			System.out.println(Arrays.toString(heap));
		}
		
		
		//크기를 줄여가면서 반복적으로 힙을 구성 
		for(int i = heap.length-1; i>=0 ; i--) {
			//마지막과 첫번째를 바꿔준다.
			
			int temp = heap[0];  
			heap[0] = heap[i];
			heap[i] = temp;
			//1번

			int root = 0;
			int c =1;
			do {
				c = 2*root+1; //root는 부모 c는 오른쪽자식(c) c+1은 왼쪽자식
				//자식중에 더 큰값을 찾기
				if(c<i-1&&heap[c]<heap[c+1]) {
					c++; 
				}//2번
				
				//루트보다 자식이 더 크다면 교환
				if(c<i&&heap[root]<heap[c]) { //c<i의 위치에 따라서 오류가 발생하고 안하고가 결정된다 !!
					int temp2 = heap[root];  
					heap[root] = heap[c];
					heap[c] = temp2;
				}
				//3번
				
				root=c;//4번 //부모의 자식으로 이동함 
			}while(c<i);

		}
	}



}
