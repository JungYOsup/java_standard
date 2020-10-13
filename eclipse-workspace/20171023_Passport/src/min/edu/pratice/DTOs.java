package min.edu.pratice;
// 개인의 정보들을 가지고 있는 객체
public class DTOs {
	
	DTO_One[] dto; // 인스턴스 변수를 초기화 DTO_One[] dto = null;
	
	//생성자 호출 
	//입력받은 num값에 따라 이름 , 나이 , 주소를 가진 배열을 선언
	public DTOs(int num) {
		// 입력받은 num값에 따라 배열을 선언 
		dto = new DTO_One[num];
	}

}
