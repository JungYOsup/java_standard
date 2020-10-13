package com.hk;

import java.util.Arrays;
import java.util.Scanner;

// 배열의 길이에 갯수만큼 입력을 하여 그 입력값이 배열에 들어가되 , 들어가기전에 판별을 통해서 들어간다.

public class Hitter extends BaseBall_Comm {
	
	
	
	Scanner scan = new Scanner(System.in);
			
	/*private int []box;*/
	
	public Hitter(int n) {
		super(n);
		/*box = new int[n];*/
	}
	
	/*public int[] getBox() {
		return box;
	}*/

	/*public Hitter() {
		this(3);
		
	}*/
	//숫자를 입력받는 메소드
	public int[] makeNum() {
		int []temp = new int[box.length];		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개를 입력해주세요");
		String s = scan.next();
		
		System.out.println("입력하신 숫자는? \t" +s);
		
		//예외경우(내가입력한값이 배열의 수보다 긴경우, 공백일경우)
		
		while (s.trim().equals("")|| s.length() != box.length) {
			System.out.println("==다시 입력해 주세요==");
			s=scan.next();
		}
		
		
		//입력받은숫자가 문자열 숫자이기 때문에 문자열을 문자형으로 바꾼다음 char인 0을빼주어서
		//인트로 프로모션해버린다음 인트배열에 넣어줌
		for (int i = 0; i < temp.length; i++) {
			temp[i] = s.charAt(i)-'0'; // char a = '10' char b = '5'라고 할때 a-b는 int 5가나옴 (자동으로 프로모션)
			
		}
		
		return temp;
		
		
	}
	//입력한 값을 판별후에 배열에 넣어주는 메소드
	public void make() 
	{ 
		Arrays.fill(box, -1);
		System.arraycopy(makeNum(), 0, box, 0,box.length );
	
		
		for (int i = 0; i < box.length; i++) {
			
			if(isSame()) {//중복판단
				System.out.println("중복이 되엇습니다");
				System.arraycopy(makeNum(), 0, box, 0,box.length );
			}
			else {
				break;
			}
			
		}
		
			
		
	}
	
	//내가 입력한 값이 중복되어있는지 판단하는 메소드
	public boolean isSame() {
		boolean isSame = false;
		
		for (int i = 0; i < box.length; i++) {
			
			for (int j = 0; j < box.length; j++) {
				
				if(box[i]==box[j]&&i<j) //배열을 비교해서 중복되어있으면 true를 리턴 중복 안되었으면 false를 리턴
				{
					isSame = true;
								
				}
				
			}
			
		}
		
	
		
		return isSame;
	}

	/*@Override
	public String toString() {
		return Arrays.toString(box);
	}*/
	
	

}
