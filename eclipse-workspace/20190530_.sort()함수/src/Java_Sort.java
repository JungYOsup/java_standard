import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class Java_Sort {

	public static void main(String[] args) {

		//1. 내림차순 첫번째 방법
		int[] sample = new int[]{1,2,3,4,5};
		int size = sample.length;
		int[] reverseSample = IntStream.range(0,size).map(i -> sample[size-i-1]).toArray(); //Output: [5, 4, 3, 2, 1] //내림차순
		
		//2. 내림차순 두번째 방법(reverseOrder는 Primitive타입은 사용할수 없으므로 배열을 Integer로써 사용했다.)
		Integer[] sample2 = {1,2,3,4,5};
		Arrays.sort(sample2,Collections.reverseOrder());
		
		
				
		for(int i=0; i<sample.length;i++) {
			System.out.print(reverseSample[i]);
			
		}
		System.out.println();
		for (int j = 0; j < sample2.length; j++) {
			
			System.out.print(sample2[j]);
		}
	}


}
