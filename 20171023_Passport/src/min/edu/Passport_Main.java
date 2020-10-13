package min.edu;

import java.util.Arrays;
import java.util.Scanner;

public class Passport_Main {
	
	public static void main(String[] args) {
		
		//TODO 01. Scanner 객체 생성
		Scanner  scan = new Scanner(System.in);
		//TODO 02. 입력을 하는 메소드가 있는 input_Data()의 객체를 인스턴스화
		input_Data in =new input_Data();
		System.out.println("몇명의 친구를 등록하겠습니까?");
		//TODO03. 1번의 생성된 입력 객체를 통해 int 값을 받음
		int number = scan.nextInt();
		
		//TODO 04. 여러개의 DTO(개인정보 저장공간)을 저장할 배열 클래스를 초기화한다.
		DTOs inDtOs = new DTOs(number);
		//TODO 08. 개인정보 입력 횟수만큼 반복 시켜줌
		for (int i = 0; i < number; i++) {
			DTO_One one = in.inputValue();
			//TODO 15. 입력받은 한개의 DTO_One을 DTO_One 을 여러개 담는 DTOs에 담는다 (inDto의 맴버필드인 Dto_one)
			inDtOs.dtos[i] =one;
		}
		System.out.println(Arrays.toString(inDtOs.dtos));
		
		
		for (int i = 0; i < number; i++) {
			//TODO 09. 개인정보를 입력ㅂ다은 메소드를 실행 (input_Data 클래스에 위치)
			DTO_One a = inDtOs.dtos[i];
			
			System.out.printf("이름 = %s , 나이 =%d , 주소 = %s ",a.name,a.age,a.address);
		}
	}
	

}
