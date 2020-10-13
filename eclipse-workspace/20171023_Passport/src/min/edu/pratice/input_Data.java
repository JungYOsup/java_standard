package min.edu.pratice;

import java.util.Scanner;

public class input_Data {
	// 값을 입력받아 배열을 만들고 , 그 배열에 각 정보들을 집어넣음
	public static DTO_One input() {
		Scanner scan = new Scanner(System.in);
		DTO_One done = new DTO_One(); // 개인정보 입력 및 출력을 위한 객체 선언
		
		System.out.println("이름 , 나이 , 주소");
		String a =scan.nextLine(); // 이름 , 나이 ,주소를 입력받는 nextLine()
		String[] b =a.split(","); // 입력받은 이름 , 나이 , 주소를 ","로 나누어 배열에 저장한다.
		
		done.setName(b[0]);
		done.setAge(Integer.parseInt(b[1]));
		done.setAddress(b[2]);
		
		return done;
		
		
		
		
		
	}
	
	
	
	

}
