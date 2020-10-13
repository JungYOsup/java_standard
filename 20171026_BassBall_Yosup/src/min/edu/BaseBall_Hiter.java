package min.edu;

import java.util.Random;
import java.util.Scanner;


public class BaseBall_Hiter extends BaseBall {
	
	
	public BaseBall_Hiter(int n ) {
			super(n);
	}
	
	public BaseBall_Hiter() {
			this(3);
	}
	
	@Override // 배열의 랜덤값을 넣어주는 메소드
	protected void make() {
		
		for (int i = 0; i < box.length; i++) {
			int score = (int)(Math.random()*9)+1;
			
			box[i] = score;
			
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	

	

}
