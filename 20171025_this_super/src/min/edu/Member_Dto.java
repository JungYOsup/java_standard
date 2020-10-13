package min.edu;
//** 참고 DTO(Data Transfer object)   //무언가담을수 있는 객체를 만드는구나, 은닉화를 해야하는구나
//       		VO(valuable object)         //무언가담을수 있는 객체를 만드는구나, 은닉화를 해야하는구나
//        	  Bean // 기능이 있는 DTO
public class Member_Dto extends Comm_Dto {
//super는 부모의 인스턴스필드와 부모의 메서드를 지칭할때 쓴다.
		private static final int KEY;  //
		
		static //static 생성자 
		{
			KEY =1000;
			System.out.println(KEY);
		}
		String name;
		String address;
		
		public Member_Dto() {
			super(10); //부모의 생성자를 호출한다.
			System.out.println("자식생성자 실행");
		}
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name; //this는 내 클래스를 의미한다. 그래서 내것의 인스턴스필드 , 메서드를 쓸때는 this를 붙여준다.
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		
		
		public void make() {
			this.print(); 
			super.getAge();
			super.setAge(10);
		}
		
		@Override
		public void print() {
			super.print();
		}
		
		
	

}
