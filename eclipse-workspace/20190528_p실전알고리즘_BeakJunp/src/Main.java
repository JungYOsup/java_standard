import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 

		int size = scan.nextInt();
		if(size>1000)return;
		int [] array = new int[size];

		for(int i=0; i<size; i++) {
			int value = scan.nextInt();
			if(value>1000)return;
			array[i] = value;
		}

		Array_2750(array,0,array.length-1);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}

	}
    	public static void Array_2750(int[] array, int start, int end) {
		
		////Arrays.sort(array);
		
		if(start>end) {
			return;
		}
		
		int i = start+1;
		int j = end;
		int key = start;
		int temp = 0;
		
		while(i<j) {
			
			while(i<=end&&array[key]>array[i]) {
				i++;
			}
			while(j>=start&&array[key]<array[j]) {
				j--;
			}
			
			if(i<j) {
				temp = array[i];
				array[i]=array[j];
				array[j]=temp;
			}else {
				temp= array[j];
				array[j] = array[key];
				array[key] =temp;
			}
			
			Array_2750(array, start, j-1);
			Array_2750(array, j+1, end);
			
			
		}
	}
	}