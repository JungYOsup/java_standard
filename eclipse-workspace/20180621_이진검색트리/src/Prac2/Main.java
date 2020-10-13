package Prac2;


public class Main {


	public static void main(String[] args) {


		int[] array = new int[10];

		for(int i=0; i<array.length; i++) {
			array[i] = i;
		}
		
		Binart_Tree_Parc2 a = new Binart_Tree_Parc2(array);
		
		a.String_Prac(a.root, 3);

		
	}
}
