package min.edu.pratice;
//개인의 정보인 이름 , 나이 , 주소
public class DTO_One {
	
	private String name; //이름
	private int age; //나이 
	private String address; // 주소
	
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "DTO_One [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
