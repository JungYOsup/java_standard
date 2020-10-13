package com.hk;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 숫자를 입력하는 클래스
 * @author Owner HK
 * @since20171031
 * @version 1.0B
 *
 */

public class Hitter extends BaseBall_Comm {
	
	//최종적으로 입력된 배열을 가지고 있는 변수 
	/*private int[] gong;*/
	
	/*public Hitter() {
		this(3);
	}*/

	//default 생성자
/*	public int[] getGong() {
		return gong;
	}*/
	
	//오버로딩 된 생성자
	public Hitter(int n ) {
		super(n);
//		gong = new int[n];
	}
	
	//숫자를 입력 받는 메소드
	private int[] makeNum() {
		int[] temp = new int[gong.length];
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력해 주세요");
		String s = scan.next(); // next 와 nextline 의 차이점을 알자 (next는 그 문자열만 가져오지만 nextline 은 문자열과 문자열 사이에 공백이 있을경우 그 공백까지 가지고온다)
		
		System.out.println("입력하신 숫자는? \t"+s);
		
		while (s.trim().equals("") || s.trim().length()!=gong.length) {
			
			System.out.println("-- 다시 입력해주세요 --");
			s= scan.next();
			
		}
		for (int i = 0; i < temp.length; i++) {
			/*temp[i] =s.charAt(i)-'0';  //char 배열에 있는것을 -'0' 을 해주어서 int형으로 프로모션을 한다음에 int 배열에 넣어줌 
*/			
			temp[i] = Character.getNumericValue(s.charAt(i)); // char를 int 로 바꿔주는 API
			
		}
		
		
		return temp;
		
	} //makeNum
	
	public void make() {
		Arrays.fill(gong, -1); // 배열에 값이 입력 되어 있는지 확인하기 위해 -1을 넣어줌 (기본값은 0 )
		int n = gong.length;
		System.arraycopy(makeNum(), 0, gong, 0 , n); //Deep copy
		
		/*gong = makeNum().clone();*/
		while (true){
			
			if(isSame()) { //중복판단
				System.out.println("중복이 되었습니다. 다시입력하세요");
				System.arraycopy(makeNum(), 0, gong, 0 , n); // 
					
			}
			else {
				break;
			}
			
		}
		
		
	}
	//배열에 중복되는 값이 있는지 판단 // 중복이면 true , 아니면 false
	private boolean isSame() {
		boolean isc = false;
		int n = gong.length;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n; j++) {
				
				if(i!=j && gong[i] == gong[j]) {
					isc = true;
				}
				
			}
		}
		return isc;
	}// isSame
/*
	@Override
	public String toString() {
		String s = "[";
		int n = gong.length;
				for (int i = 0; i < n-1; i++) //배열이 3일때 처음이랑 두번째거 입력해주고
				{
					s+=String.format("%d,", gong[i]);
					
				}
				s+= String.format("%d]", gong[n-1]); //3번쨰껄 여기다 입력해주어서 모양을 맞춰줌
		return s;
	}//toString
	
	public void print() {
		System.out.print("[");
		
		int n = gong.length;
		for (int i = 0; i < n-1; i++) {
			System.out.printf("%d",gong[i]);
			
		}
		
		System.out.printf("%d]",gong[n-1]);
		
		
		
	}*/
	
	
	
	

}
