package min.edu;

public class Abstract_Main {

	public static void main(String[] args) {
		// abstract는 작성되지 않은 추상메소드가 있기 때문에
		// new 를 하지 말아라
		Abstract_Class ac = new Abstract_Class() {
		};
		
		
		Child_Class child = new Child_Class();
		
		child.make();
		child.print();
		
	}

}
