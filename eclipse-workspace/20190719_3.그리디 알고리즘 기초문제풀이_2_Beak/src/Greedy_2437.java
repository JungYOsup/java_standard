import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2437 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		int[] array = new int[num];
		
		
		for(int i=0; i<array.length; i++) {
			int weight = scan.nextInt();
			array[i] = weight;
		}
		
		Greedy_2437(array);

	}
	
	public static void Greedy_2437(int[] array) {
		Arrays.sort(array);
		
		int min = 1;
		
		for(int i=0; i<array.length; i++) {
			
			if(array[i]<=min) {
				min += array[i];
			}else {
				break;
			}
		
			
		}
		
		System.out.println(min);
		
		
	}
}
