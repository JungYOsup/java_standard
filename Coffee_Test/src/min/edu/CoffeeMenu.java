package min.edu;

import java.util.Scanner;

public class CoffeeMenu {
	
	public static void menu() {
		int[] a = {300,800,1000,1200};
		
		System.out.printf("0번 아메리카노:%d원, 1번 라떼:%d원 , 2번 마끼야또:%d원 ,3번 카푸치노:%d원 \n",a[0],a[1],a[2],a[3]);
		
		
		
			
	}
	
	public static int menu(int number) 
	{
		int[] a = {300,800,1000,1200};
		int coffeevalue = a[number];
		
		
		return coffeevalue;
			
	}

}
