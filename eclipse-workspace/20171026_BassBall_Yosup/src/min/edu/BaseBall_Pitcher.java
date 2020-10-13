package min.edu;

import java.util.Random;

public class BaseBall_Pitcher {
	private int[] box; //숫자를 넣을 박스를 초기화
	
	public int[] getBox() {
		return box;
	}
	// 정해진 박스의 공간
	public BaseBall_Pitcher() {
			this(3);
	}
	// 내가 입력한 만큼 생기는 박스의 공간
	public BaseBall_Pitcher(int n ) {
			box = new int[n];
			
			
	}
	
	//박스에 랜덤인 숫자를 넣는 메소드
	
	public void Insert_Score() {
		int count =0;
								
			while(true) {
				

				int score = (int)(Math.random()*9)+1;
				if(!isCheck(score)) { // 상자안에있는 숫자와 일치하지 않을경우 false이므로 if문을 돌리기 위해 ! 를 해줌 
					
					box[count++] = score;
					
					
				}
				
				if(count == box.length)
					break;
				
			}
				
			
					
		
	}
	
		
	//박스에 중복이 있는지를 판단하는 것
	public boolean isCheck(int n ) {
		boolean check = false;
		
		
		for (int i = 0; i < box.length; i++) {
			if(box[i]==n) { // 내가 랜덤으로 넣은 수가 박스안에 있는 숫자와 일치할경우 
				check =true;
			}
		}
			
		return check;
		
	}
	
	
	
    

}
