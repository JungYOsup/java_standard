package min.edu;

public class VariableMain {

	public static void main(String[] args) {
		
		VariableClass a1 =new VariableClass(10);
		VariableClass a2 = new VariableClass(5);
		System.out.println(a1.number);
		System.out.println(a2.number);
		
		System.out.println(VariableClass.count);
		System.out.println(a1.val);
	}

}
