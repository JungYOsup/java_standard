package com.hk;

import java.util.Scanner;

public class BaseBallGame {
	private int n; //배열의 크기
	private Pitcher pit; //컴퓨터
	private Hitter hit; //입력
	private Umppire ump; //비교판단 클래스
	
	public BaseBallGame(int n) {
		this.n = n;
		pit = new Pitcher(n);
		hit = new Hitter(n);
		ump = new Umppire();
	}
	public BaseBallGame() {
		this(3);
	}
	
	//게임을 시작하는 메소드
	public void startGame() {
		Scanner scan = new Scanner(System.in);
		String init = "Y";
		
		do {
			playGame();
			System.out.println("다시 게임을 진행하시곗습니까? Y or N" );
			init = scan.next();
			
			if(init.trim().toUpperCase().compareTo("N")==0) {
				System.out.println("다음에 다시 해주세요");
			}
			
		} while (init.trim().equalsIgnoreCase("Y"));
		
	}
	
	
	//게임 플레이하는 메소드
	public void playGame() {
		int count =0;
		int strike =0;
		int ball =0;
		
		pit.make(); //자동으로 숫자생성해서 배열에 넣어줌 
		
		ump.setpBall(pit.getbox()); //그 자동완성 해서 만들어준 배열을 비교판단을 위해 판단클래스배열에 넣어줌
		
		while (count != BaseBall_Const.ITERATOR) {
			count++;
			System.out.println(count +"번째 게임입니다.");
			
			hit.make();
			ump.sethBall(hit.getbox());
			
			strike = ump.Strike();
			ball = ump.Ball();
			
			System.out.printf("\n 당신이 맞춘 결과는 \n"+ "Strike : %d , Ball : %d 입니다",strike,ball );
			
			if (strike == BaseBall_Const.END_GAME) {
				
				break;
			}
		}
		
		if(strike == BaseBall_Const.END_GAME) {
			System.out.println("상대편의 숫자를 모두 맞추셨습니다");
		}
		else {
			System.out.println("아쉽게 10번의 횟수에 정답을 맞추지 못했습니다");
			System.out.printf("정답은? %s",pit.toString());
		}
		
		
	}
	
	

}
