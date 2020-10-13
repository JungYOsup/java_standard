
public class Bubble_Sort {

	//버블정렬은 시간복잡도에서 O(n^2)으로 Selection_Sort와 같지만 , 계속적으로 위치를 바꿔줘야한다는것에서 시간이 더 걸린다.
	//Selection_Sort는 최소 값을 찾아서 한번 위치를 바꿔주면 되지만 , 버블정렬은 계속적으로 위치를 바꿔줘야한다.
	//즉 코드인 temp = array[j];
	//array[j] = array[j+1];
	//array[j+1] = temp;
	//가 여러번 작동한다.
	
	public static void main(String[] args) {
		
		Bubble_Sort();
	}
	
	public static void Bubble_Sort() {
		int i , j , temp;
		int[] array = {1,5,8,3,2,6,7,9,10,4}; //길이 10 , index 9 
				
		for(i=0; i<array.length; i++) {
		
			for(j=0; j<array.length-i; j++) {
				
				if(array[j+1]<array[j]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		for(i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}
}
