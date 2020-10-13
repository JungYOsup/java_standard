import java.util.Arrays;
import java.util.Scanner;

public class Greedy_1080 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int g = scan.nextInt();
		int s = scan.nextInt();

		int[][] array = new int[g][s];
		int[][] array2 = new int[g][s];

		for(int i=0; i<g; i++) {
			for(int j=0; j<s; j++) {
				array[i][j] = scan.nextInt(); 
			}
		}

		for(int i=0; i<g; i++) {
			for(int j=0; j<s; j++) {
				array2[i][j] = scan.nextInt(); 
			}
		}

		Greedy_1080(array,array2);

	}

	public static void Greedy_1080(int[][] array,int[][] array2) {
	
		
		
		
		
		
		
	}
		
		
		
//		for(int i=0; i<array.length; i++) {
//
//			for(int j=0; j<array[i].length; j++) {
//
//				if(array[i][j]==0) {
//					array[i][j] = 1;
//				}else{
//					array[i][j] = 0; 
//				}
//
//			}
//		}
//		
//		int min =0; 
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				
//				if(array[i].equals(array2[i])) {
//					min++;
//				}else {
//					min = -1;
//				}
//				
//			}
//		}
//		
//		System.out.println(min);
		

	
	




}
