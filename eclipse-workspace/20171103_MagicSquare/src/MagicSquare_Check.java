

//대각선 역대각산 가로 세로의 합이 같은지를 판별하는 클래스
public class MagicSquare_Check {
	
	
	private int[][]magic;
	
	
	//가로의 합 , 세로의 합 , 대각선의 합 , 역대각선을 1차원 배열에 넣어서 값이 같은지를 판별하는 메소드
	
	public boolean isCheck(int[][] magic) {
		
		boolean isc = false;
		
		this.magic = magic;
		
		int[] chkArray =new int[2*magic.length+2]; //가로갯수 x 새로갯수 + 대각선 , 역대각선
		
		for (int i = 0; i < magic.length; i++) {
			
			
			chkArray[i] = sumRow(i);
			chkArray[i+magic.length] = sumCol(i);
			
			
		}
		chkArray[magic.length*2] = sumDiagonal();
		chkArray[magic.length*2+1] = resumDiagonal();
		
		//배열에 들어간 값들을 인덱스 0을기준으로 하나씩 비교해서 같은지를 판별하는 메소드
		for (int i = 0; i < chkArray.length; i++) {
			
			if(chkArray[0] != chkArray[i]) {
				isc =true;
				break;
			}
		}
		
		return isc;
		
	}
	
	//가로의 합을 계산해주는 메소드
	private int sumRow(int x) {
		int sum =0;
		for (int y = 0; y < magic.length; y++) {
			
			sum+=magic[x][y];
		}
		return sum;
	}
	
	private int sumCol(int y) {
		int sum =0;
		for (int x = 0; x < magic.length; x++) {
			sum+=magic[x][y];
		}
		return sum;
	}
	
	private int sumDiagonal() {
		int sum=0;
		for (int i = 0; i < magic.length; i++) {
			sum+=magic[i][i];
		}
		return sum;
	}
	
	private int resumDiagonal() {
		int sum=0;
		for (int i = 0; i < magic.length; i++) {
			sum+=magic[i][magic.length-i-1];
		}
		
		return sum;
	}
	
	
	

}
