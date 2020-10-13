
public class MagicSquare_Check {
	private int [][] magic;
	
	public MagicSquare_Check() {
	
	}
	
	
	public boolean isCheck(int[][] magic) {
		boolean isc = false;
		int [] array = new int[magic.length*2+2];
		this.magic =magic;
		
		for (int i = 0; i < magic.length; i++) {
			
			array[i] = sumRow(i); // 0 1 2 3
			array[magic.length+i] = sumCol(i); //4 5 6 7
		}
		array[magic.length*2] = sumDiagonal(); //8 
		array[magic.length*2+1] = sumRevDiagonal();//9 
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[0]!=array[i]) { // 값이 다르면 true로 리턴해줌
				isc = true;
				
				break;
			}
			
		}
		return isc;
		
	}
	
	
	private int sumRow(int x) {
		int sum =0;
		for (int y = 0; y < magic.length; y++) {
			sum +=magic[x][y]; 
		}
		
		return sum;
	}
	
	private int sumCol(int y) {
		int sum=0;
		for (int x = 0; x < magic.length; x++) {
			sum +=magic[x][y];
		}
		return sum;
	}
	private int sumDiagonal() {
		int sum=0;
		for (int i = 0; i < magic.length; i++) {
			sum += magic[i][i];
		}
		return sum;
	}
	private int sumRevDiagonal() {
		int sum=0;
		for (int i = 0; i < magic.length; i++) {
			sum += magic[i][magic.length-1-i];
		}
		return sum;
	}
	
	
	
	

}
