package min.edu;

public class Member_Main {

	public static void main(String[] args) {
//		Member_DTO dto = new Member_DTO();
//		dto.name= "홍길동";
//		dto.age = 20;
		
		Member_DTO dto = new Member_DTO("홍길동", 20);
		
		dto.setAge(11);
		dto.setName("홍길동");
		
		System.out.println(dto.getAge());
		System.out.println(dto.getName());
		System.out.println(dto);
		dto.toString();
		
		
		
	}

}
