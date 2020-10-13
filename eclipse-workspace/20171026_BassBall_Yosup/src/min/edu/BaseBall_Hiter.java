package min.edu;

import java.util.Scanner;

public class BaseBall_Hiter {
	
	
	private int[] box; // 숫자를 초기화 
	
	//정해진 숫자의 배열을 만듬 
	public BaseBall_Hiter() {
		this(3);
	}
	//내가 입력한 박스의 수를 만듬
	public BaseBall_Hiter(int n ) {
		box =new int[n];
	}
	
	public void inser_Score() {
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int input = scan.nextInt();
		
		int count =0;
		while(true) {
			if(!isCheck(input)) {
				
				box[count++] = input;
				
			}
			if(count == box.length) {
				break;
			}
			
		}
		
		
		
		
		
	}
	
	
	public int[] getBox() {
		return box;
	}
	
	public void setBox(int[] box) {
		this.box = box;
	}
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
