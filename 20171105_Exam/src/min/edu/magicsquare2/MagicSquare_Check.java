package min.edu.magicsquare2;

public class MagicSquare_Check {
	private int[][] magic;
	public MagicSquare_Check() {
		
	}
	
	public boolean isCheck(int[][] magic) {
		int [] array = new int[magic.length*2+2];
		boolean isc = false;
		
		for (int i = 0; i < magic.length; i++) {
			
			array[i] = sumRow(i);
			array[i+magic.length]=sumCol(i);
			
		}
		array[magic.length*2] = sumDiagonal();
		array[magic.length*2+1] = sumRevDiagonal();
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[0] !=array[i]) {
				isc= true;
				break;
			}
			
		}
		
		
		
		return isc;
	}
	
	//가로배열의 합
	private int sumRow(int x) {
		int sum =0;
		for (int y = 0; y < magic.length; y++) {
			sum += magic[x][y];
			
		}
		return sum;
	}
	//세로배열의합
	private int sumCol(int y) {
		int sum=0;
		
		for (int x = 0; x < magic.length; x++) {
			sum += magic[x][y];
			
		}
		return sum;
	}
	//대각선의 합
	private int sumDiagonal() {
		int sum =0;
		
		for (int i = 0; i < magic.length; i++) {
			sum+= magic[i][i];
			
		}
		
		return sum;
	}
	
	//역대각선의 합
	private int sumRevDiagonal() {
		int sum=0;
		for (int i = 0; i < magic.length; i++) {
			sum+= magic[i][magic.length-1-i];
			
		}
		return sum;
	}

}
