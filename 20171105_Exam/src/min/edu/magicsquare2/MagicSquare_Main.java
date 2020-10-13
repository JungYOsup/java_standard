package min.edu.magicsquare2;

public class MagicSquare_Main {
	
	
	public static void main(String[] args) {
		int[][] array;
		OddMagicSquare om = new OddMagicSquare(3);
		EvenMagicSquare es = new EvenMagicSquare(4);
		es.makeMagic();
		array =es.getMagic();
		
		/*om.makeMagic();
		array=om.getMagic();*/
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + "\t");
				
			}
			System.out.println();
		}
	}

}
