import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array = {3, 5, 7, 11, 13, 2, 9, 6};
			//{2 ,3, 5, 7, 11, 13, 9, 6}
		insertfunction(array, 4, 2);
		insertfunction(array, 5, 9);
		insertfunction(array, 6, 6);
		
	}
	
	public static void insertfunction(int[] array,int rightIndex,int value) {
		
		
		int insert=0;
		for(int i=rightIndex;  i>=0&&array[i]>value; i--){ //여기서 주의할점은 array[i]>value && i>=0; 와  i>=0&&array[i]>value; 의 차이점이다
			//전자의 경우는 i=0일때 조건이 성립하고 실행된다음 i=-1일때 array[-1]>value 조건이 i>=0보다 먼저 실행되므로 좋은 코딩이라 볼수 없다.
			//그러나 후자의 경우 i=-1일때 i>=0이 먼저 실행되므로 좋은 코딩이라고 할수있다. 
			
			array[i+1] = array[i];
			insert = i;
		}
		
		array[insert]=value;
		
		System.out.println(Arrays.toString(array));
		
	}

}
