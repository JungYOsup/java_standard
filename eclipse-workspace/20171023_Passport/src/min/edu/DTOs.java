package min.edu;

// 개인정보 여러개를 담고 있는 객체
public class DTOs {	
	//TODO 5. 맴버필드를 초기화한다. DTO_ONe[]Dtos = null;
	DTO_One[] dtos;
	 // 클래스를 초기화 할때 몇명의 정보를 입력할지 크기를 입력해줌
	
	//TODO 6. 생성자를 호출 
	public DTOs(int num) { 
		//TODO 7. 맴버필드의 배열에 크기를 입력받아 선언 
		dtos = new DTO_One[num];
	}

}
