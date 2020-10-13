package com.hk;

import java.util.Scanner;

/**
 * 숫자야구 게임의 Controller
 * @author Owner
 *
 */
public class BaseBallGame {
	
	private int n; // 배열의 크기
	private Hitter hBall; // 입력
	private Pitcher pBall;// 컴퓨터
	private Umppire ump; //비교판단 클래스
	
	public BaseBallGame() {
		this(3);
	}
	
	public BaseBallGame(int n) {
		this.n = n;
		hBall = new Hitter(n);
		pBall = new Pitcher(n);
		ump = new Umppire();
		
	}
	
	public void startGame() {
		Scanner scan = new Scanner(System.in);
		String init = "Y"; // 게임의 진행 여부를 판단.
		
		do {
			playGame(); // 게임을 진행시켜 줌
			System.out.println("다시 게임을 진행 하시겠습니까? Y or N");
			 init = scan.next();
			
			//메세지
			 if(init.trim().toUpperCase().compareTo("N")==0) {
				 //trim().compareToignoreCase("N") 라고 넣어줘도 됨
				 //trim().equalsIgnorecase("N");
				 System.out.println("다음에 또 도전해주세요");
			 }
			
		} while (init.trim().equalsIgnoreCase("Y"));
		
	}

	private void playGame() {
		int count =0; //게임 진행 횟수
		int strike = 0;
		int ball =0;
		
		//자동생성 숫자를 생성함
		pBall.make();
		
		//비교 판단 클래스에 입력해 둠 
		ump.setpBall(pBall.getGong());
		
		/*System.out.println(pBall);*/
		
		while (count != BaseBall_Const.ITERATOR) {
			count++; //게임 횟수증가
			System.out.println("\""+count+ "번째\"게임 입니다");
			// 입력받음
			hBall.make();
			System.out.println(hBall);
			//비교 판단 클래스에 입력해 둠
			ump.sethBall(hBall.getGong());
			
			//비교판단 결과를 가져옴
			strike = ump.strike();
			
			ball = ump.ball();
			
			System.out.printf("\n 당신이 맞춘 결과는 \n"+"[Strike :%d, Ball: %d]", strike,ball);
			
			//게임 결과에 따른 종류
			if(strike == BaseBall_Const.END_GAME) {
				break;
			}
		}
		// 종료결과를 발표함
		if(strike ==BaseBall_Const.END_GAME) {
			System.out.println("상대편의 숫자를 맞췄습니다");
		}else {
			System.out.println("아쉽게 10번의 횟수에 정답을 맞추지 못했습니다");
			System.out.printf("정답은? %s", pBall.toString());
			
		}
		
		
	}// while
	
	
	
	
	
	

}
