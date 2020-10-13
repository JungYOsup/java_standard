package min.edu;

import java.util.Scanner;

public class Coffee_Scan {

	public static int scan() {
		int a = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("돈을 넣어주세여");
		a = scan.nextInt();
		
		
		return a;
	}
	
	public static int scan2() {
		int b = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 선택해주세요");
		b = scan.nextInt();
		
		
		return b;
		
	}
}
