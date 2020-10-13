package min.edu;

import java.util.Scanner;

public class inputNumber {
		
		/**
		 * Lab4에서 만든 정수를 받는 메소드 
		 * @return 입력 숫자
		 */
		public static int scannerNum() {
			int n=0;
			Scanner scan = new Scanner(System.in);
			n= scan.nextInt();
			return n;
		}
}
