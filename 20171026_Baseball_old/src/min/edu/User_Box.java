package min.edu;

import java.util.Scanner;

public class User_Box {
	
	
	public int[] input(int a , int start , int end,boolean ch) {
		int[] inBox = null;
			if(ch) {
				while(true) {
					int[] tBox = input(a, start, end);
					if(!arrayCheck(tBox)) {
						System.out.println("중복이 되었습니다?");
						
					}else {
						inBox = tBox.clone();
						break;
					}
					
				}
			}
			else {
				inBox = input(a, start, end);
			}
		return inBox;
	}
	private int[] input(int a , int start , int end ) { // 배열의 크기 , 시작범위 , 끝범위
		int[] box = new int[a];
		int count = 0;
		
		while(true) {
			try {
				System.out.println("배열의 값을 입력해주세요 ");
				Scanner scan = new Scanner(System.in);
				
				int n = scan.nextInt();
				
					if(n>=start && n <=end) {
						box[count] =n;
						count++;
					}else {
						System.out.println("범위가 벗어 났습니다.");
					}
					
					if(count==a) {
						System.out.println("입력완료 / 수고하셨습니다 ");
						break;
					}
			} catch (Exception e) { //inputMissMatchException
				System.out.println("잘못된 형식입니다");
				break;
			}
				
			
		} // while 
		return box;
		
	}
	//중복검사
	//입력하면서 확인
	private boolean arrayCheck(int[] inBox) { // 중복이면 false
		boolean isc =true;
		for (int i = 0; i < inBox.length; i++) {
			for (int j = 0; j < inBox.length; j++) {
				if(i!=j && inBox[i] == inBox[j]) {
					isc = false;
				}
			}
			
		}
		return isc;
	}

}
