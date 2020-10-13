package min.edu.magicsquare;
// 가로 4, 세로 4, 대각선 , 역대각선의 합을 통해 마방진인지 판단하는 메소드
public class MagicSquare_Check {
	
	private int[][] magic;
	
	
	
	public boolean isCheck(int[][] magic) {
		boolean isc = false;
		this.magic =magic;
		
		int[] array = new int[magic.length*2+2];//10
		
		for (int i = 0; i < magic.length; i++) {
			
			array[i] = sumRow(i); //0 1 2 3
			array[i+magic.length] = sumCol(i); // 4 5 6  7 
			
		}
		array[magic.length*2] = sumDiagonal(); // 8 
		array[magic.length*2+1] = sumRevDiagonal(); // 9
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[0]!=array[i]) {
				isc =true;
				break;
			}
		}	
		
				
		return isc;
	}
	
	//가로줄의 합을 구하는 메소드
	
	private int sumRow(int x) {
		int sum =0;
		
		for (int y = 0; y < magic.length; y++) {
			sum+= magic[x][y];
		}
		
			
		return sum;
	}
	//세로의 합을 구하는 메소드
	private int sumCol(int y) {
		int sum =0;
		
		for (int x = 0; x < magic.length; x++) {
			sum+= magic[x][y];
			
		}
		
		return sum;
		
	}
	
	//대각선의 합을 구하는 메소드
	private int sumDiagonal() {
		int sum=0;
		
		for (int i = 0; i < magic.length; i++) {
			sum+= magic[i][i];
			
		}
		
		return sum;
		
	}
	
	private int sumRevDiagonal() {
		int sum=0;
		
		
		for (int i = 0; i < magic.length; i++) {
			sum+=magic[i][magic.length-1-i];
			
		}
		return sum;
	}

}
