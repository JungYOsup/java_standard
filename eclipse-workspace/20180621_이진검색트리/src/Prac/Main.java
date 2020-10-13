package Prac;

public class Main {
	
	public static void main(String[] args) {
		
		int[] array = new int[10];
		
		for(int i=0; i<array.length; i++) {
			array[i] = i;
		}
		
		Binary_Tree_Prac tree = new Binary_Tree_Prac(array);
		tree.searchBTree(tree.root, 2);
		
	}
		
	
	
}
