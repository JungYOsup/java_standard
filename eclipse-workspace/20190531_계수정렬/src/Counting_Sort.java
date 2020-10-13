import java.util.HashMap;

//그동안 배웠던 정렬방법
//버블정렬, 선택정렬, 삽입정렬 => O(n^2) 
//퀵정렬 , 병합정렬, 힙정렬  => O(n*logn)
//하지만 이것보다 더욱 빠르게 정렬을 해야한다면 어떻게 할까요?
//계수 정렬 !!
//하지만 계수정렬은 "**범위 조건"이 있을 경우에 한하여 굉장히 빠른 알고리즘이다.
//그 속도가 무려 O(N)


//**5이하(*범위)의 자연수 데이터들을 오름차순으로 정렬하세요
//1,3,2,4,3,2,5,3,1,2,3,4,4,3,5,1,2,3,5,2,3,1,4,3,5,1,2,1,1,1

//단 이것의 경우 데이터에 의존을 많이 하는것을 볼수 있다. 왜냐하면 데이터의 값에 의해 들어갈 배열의 위치가 정해지기 떄문에!!
//예를들어 1,3,2,4,3,2,5,3,1,2,3,4,4,3,5,1,2,3,5,2,3,1,4,3,5,1,2,1,1,1,9999 처럼 
//하나라도 9999가 있으면 count[9999]가 필요하다..


//따라서 해쉬맵을 이용하면 오히려 더 좋은 결과로써 카운팅을 할수 있다.

public class Counting_Sort {

	public static void main(String[] args) {

		Counting_Sort();
		System.out.println();
		Counting_Sort2();


	}
	public static void Counting_Sort() {

		int count[]=new int[5];
		int array[] = {1,3,2,4,3,2,5,3,1,2,3,4,4,3,5,1,2,3,5,2,3,1,4,3,5,1,2,1,1,1};

		for(int i=0; i<count.length; i++) {
			count[i] =0;
		}

		for(int i=0; i<array.length; i++) {
			count[array[i]-1]++;
		}
		for(int i=0; i<5; i++) {
			if(count[i] !=0) {
				for(int j=0; j<count[i]; j++) {
					System.out.print(i+1);
				}
			}
		}

	}




	//HashMap을 이용해봄
	public static void Counting_Sort2() {

		int[] array= {1,3,2,4,3,2,5,3,1,2,3,4,4,3,5,1,2,3,5,2,3,1,4,3,5,1,2,1,1,1,9999};


		HashMap<Integer, Integer> hm = new HashMap<>();

		for(int key : array) hm.put(key, hm.getOrDefault(key, 0)+1);

		for(int key :hm.keySet()) {

			int value = hm.get(key);

			for(int i=0; i<value; i++) {
				System.out.print(key);
			}

		}


	}
}
