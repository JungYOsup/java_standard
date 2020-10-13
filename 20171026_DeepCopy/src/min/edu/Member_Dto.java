package min.edu;

public class Member_Dto implements Cloneable{
	
	
	
	public Member_Dto(String name, String address) {
		super(); // ?
		this.name = name;
		this.address = address;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException // throw 를 던지면 실행된곳에서 try~catch를 해야함
	{
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		return "Member_Dto [name=" + name + ", address=" + address + "]";
	}

	private String name;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	

}
