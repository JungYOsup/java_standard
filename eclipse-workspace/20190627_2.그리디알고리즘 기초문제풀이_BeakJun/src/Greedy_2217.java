import java.util.Arrays;
import java.util.Scanner;

public class Greedy_2217 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int [] array= new int[num];
		for(int i=0; i<num; i++) {
			int MaxWeight = scan.nextInt();
			array[i] = MaxWeight;		
		}
		
		
		Arrays.sort(array);
		
		Greedy_2217(array);
		
				
		
	}
	
	public static void Greedy_2217(int[] array) {
		
		int min =0;
		for(int i=0; i<array.length; i++) 
		{
			
			if(min < array[i]*(array.length-i)) {
				min = array[i]*(array.length-i);
			}
			
		}
		System.out.println(min);

		
	}

}
