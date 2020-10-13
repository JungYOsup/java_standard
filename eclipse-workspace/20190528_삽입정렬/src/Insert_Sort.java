// 1,5,10,8,7,6,4,3,2,9 를 오름차순으로 나타내어라

// _ 1 _ 앞 뒤에 5의 위치를 지정해주면 1 뒤에 있어야 하므로 
// 1,5가 된다

// 10은 _1_5_ 이 3군데(_)의 위체중 어디에 들어가야할까 5뒤에 들어간다
// 1,5,10 

// 8은 _1_5_10_ 이 4군데(_)의 위치중 어디에 들어가야할까? 5뒤에 들어간다.

// 1,5,8,10 

// 이런식으로 값을 어느위치에 삽입하느냐가 바로 Insert Sort이다.

// 버블 선택보다 속도가 빠르다 why? 이미 위치를 알고 있기 때문

// 그리고 이미 정렬된 상태일경우 훨씬 선택정렬이 빠르다 . -> 이것은 손으로 나타내서 확인해보자
// ex ) 2,3,4,5,6,7,8,9,10,1 일경우 


public class Insert_Sort {

	public static void main(String[] args) {
		Insert_Sort();
	}
	
	public static void Insert_Sort() {
		
		int i,j,temp;
		int[] array = {5,1,10,8,7,6,4,3,2,9};
		
		for(i=0; i<array.length-1; i++) {
			
			j=i;
//			for(j=i; j>-1; j--) {
//				
//				if(array[j]>array[j+1]) {
//					temp = array[j];
//					array[j] = array[j+1];
//					array[j+1] = temp;
//							
//				}
//			}
			
			while(array[j]>array[j+1]) {
				temp = array[j];
				array[j] = array[j+1];
				array[j+1] = temp;
				j--;
			}
			
		}
		
		for(i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		
		
	}

}
