package min.edu;

public class Member_DTO {

	private String name;
	private int age;
	
	public Member_DTO(String n , int a ) {
		name = n;
		age = a;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Member_DTO [name=" + name + ", age=" + age + "]";
	}
	
	

}
