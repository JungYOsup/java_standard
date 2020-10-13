package min.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ShallowCopy {

	
		public static void main(String[] args) {
			int a =10;
			int b = a+10; //immutale;(변화가 불가능하다)
			System.out.println(a+":"+b);
			
			
			
			int[] arrayO = {1,2,3,4}; //mutable(변화가가능하다)
			int[] arrayC = arrayO;
			System.out.println(Arrays.toString(arrayO));
			System.out.println(Arrays.toString(arrayC));
			
			arrayC[0] =100;
			
			System.out.println(Arrays.toString(arrayO));
			System.out.println(Arrays.toString(arrayC));
			
		}
}
