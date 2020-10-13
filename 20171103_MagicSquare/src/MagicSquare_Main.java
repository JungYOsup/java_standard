
public class MagicSquare_Main {
	
	public static void main(String[] args) {
		OddMagicSquare odd =new OddMagicSquare(3);
		odd.makeMagic();
		int[][] array = odd.getOdd();
		
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j <array.length; j++) {
				System.out.print(array[i][j] +"\t");
			}
			System.out.println();
		}
	}

}
