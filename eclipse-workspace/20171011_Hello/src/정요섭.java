import java.util.Arrays;

public class 정요섭 {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5};
		int[] array2 = array.clone();
		
		array2[0]=4;
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(array2));
		
		int[] array3 = new int[6];
		
		System.arraycopy(array, 0, array3, 0, 5);
		
		System.out.println(Arrays.toString(array3));
		
		Integer b = new Integer(10);//참조타입
		int result = b.compareTo(20);
		System.out.println("크기를 비교하자"+ result);
		
		
	}
	


}

