package min.edu.pratice;

import java.util.Scanner;

public class Passport_Main {
	
	public static void main(String[] args) {
		//Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		//개인정보를 입력하는 객체 선언 
		input_Data in = new input_Data();
		System.out.println("몇명의 친구를 등록하겟습ㅂ니까?");
		int num =scan.nextInt();
		//입력받은 num에 따른 배열 클래스를 초기화한다.
		DTOs dtos = new DTOs(num);
		
		for (int i = 0; i < num; i++) {
			
			DTO_One one = in.input();
			//입력받은 한개의 DTO_One 즉 개인정보를 for문을 통해 배열의 수만큼 넣어줌
			dtos.dto[i]=one;
			
		}
		
		for (int i = 0; i < num; i++) {
			
			DTO_One a = dtos.dto[i];
			
			
			System.out.println(a.toString());
		}
		
		
		
	}

}
