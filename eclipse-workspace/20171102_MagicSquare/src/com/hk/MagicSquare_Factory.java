package com.hk;

import java.util.Scanner;

public class MagicSquare_Factory {
	
	private static MagicSquare_Factory factory;
	private MagicSquare_Factory() {}
	
	public static MagicSquare_Factory getInstance() {
		if(factory==null) {
			factory = new MagicSquare_Factory();
		}
		return factory;
	}
	
	public /*static */IMagicSquare factory() {
		
		IMagicSquare magic = null;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("생성하고자 하는 마방진 숫자를 입력하세요");
		int n =scan.nextInt();
		
		if(n<3) {
			System.out.println("마방진이 될 수 없는 수 입니다");
		}else if(n%2==1){ //odd
			magic = new OddMagicSquare(n);
		}else if(n%4==0) { // even
			magic = new EvenMagicSquare(n);
			
		}
		/*else if() { // n을 나누어 odd가 되는수 
			
		}*/
		else {
			System.out.println("개발진행중");
		}
		
		
		return magic;
	}
	

}
