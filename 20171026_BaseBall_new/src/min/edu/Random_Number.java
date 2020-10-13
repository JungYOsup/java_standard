package min.edu;

public class Random_Number {
	
	private int[] box = new int[3];
	
	
	
	
	
	//랜덤을 생성해줌
	private void randomNum() {
		int index=0;
		
		while(true) {
			int n =(int)(Math.random()*9)+1;
			if(isCheck(n)==0) {
				box[index++] = n;
			}
			
			if(index == box.length) {
				
				break;
			}
			
		}
		
		
	}
	
	// 랜덤을 입력할때 중복 체크 
	private int isCheck(int num) {
		int isc = 0;
		
		for (int i = 0; i < 3; i++) {
			
			if(box[i]==num) {
				isc = 1;
			}
			
			
			
		}
		
		
		return isc;
		
	}

}

