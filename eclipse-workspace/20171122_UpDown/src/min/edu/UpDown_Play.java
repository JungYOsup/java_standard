package min.edu;

import java.util.Scanner;

public class UpDown_Play {
	 private UpDown_Input input = new UpDown_Input(); //메모리 보호 및 보안성 유지를 위해 private 및 인스턴스변수로 만듬
	 private UpDown_Random random = new UpDown_Random();
	 private UpDown_Compare com = new UpDown_Compare();
	
	//게임을 시작하는 메소드
	public void startGame() {
		this.playGame();
		System.out.println("게임을 다시 시작하시겠습니까? Y/N");
		Scanner scan = new Scanner(System.in);
		String choice = scan.next();
		
		if (choice.equalsIgnoreCase("y")) {
			this.startGame();
		}
		else {
			System.out.println("게임을 중단하셧습니다");
		}
		
		
		
		
	}
	//다른곳에서는 게임이 어떻게 플레이되는지 알지 못하게 private 해줌
	//게임을 플레이하는 메소드
	private void playGame() {
		
		int n =input.input();
		int ran =random.random();
		System.out.println(ran);

		while(true) {//무한반복

			if(n!=ran) {
				com.compare(n, ran); 
				n =input.input();
			}
			else {
				System.out.println("정답입니다.");
				break;
			}
			
		}
			

	}

}
