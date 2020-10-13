package min.edu;

import java.io.DataOutput;
import java.util.Scanner;

public class input_Data {
	//TODO 10. 개인정보를 입력
	public DTO_One inputValue() {
		//TODO 11. 개인정보를 담을 객체(그릇)을 생성함
		DTO_One dto = new DTO_One(); // 3개 값을 담을 수 있는 객체
		Scanner scan = new Scanner(System.in);
		System.out.println("개인정보를 입력해주세요");
		System.out.println("ex) 이름 , 나이 , 주소 ");
		String in =scan.nextLine(); //내가 쳤던 한줄을 가져온다.
		//TODO 12. 문자열로 입력받은 " ,  , "를 java.lang.String 의 split 을 통해서 잘라내여 String 배열로 만듬.
		String[] val = in.split(",");
		dto.name =val[0];
		//TODO 13. 문자열 숫자를 숫자(int)로 변경하는 메소드르 실행 하여 입력하는 곳(DTO_ONE)의 타입과 맞춰 준다.
		dto.age =Integer.parseInt(val[1]); // val[1] 이 String 이므로 int 로 바꿔줌
		dto.address =val[2];
		
		//TODO 14. 최종적으로 담겨진 DOT_ONE을 리턴(주소를 전달한다)한다.
		
		return dto;
		
	}

}
