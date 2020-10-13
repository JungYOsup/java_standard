package Prac;

import java.util.Arrays;

public class InsertSorter_Prac {


	public static void main(String[] args) {

		int[] array = {3,6,4,1};
		insertSorter(array);
		
		System.out.println(Arrays.toString(array));
		

	}

	public static void insertSorter(int[] array) {

		for(int i=1; i<array.length; i++) {

			insertmove(array, i);
		}

	}

	public static void insertmove(int[] array,int key) {

		int temp = array[key];
		for(int i=key-1; i>=0; i--) {

			if(temp<array[i]) {
				array[i+1] = array[i];
			}else {
				array[i+1]=temp;
				break;
			}
			if(i==0) {
				array[0]= temp;	
			}
		}

	}
}



