package min.edu;

public class Number37 {
	private static String aField = "";
	private String bField="";
	
	static {
		aField +="A";
		
	}
	{
		aField +="B";
		bField += "B";
		
	}
	public Number37() {
		aField += "C";
		bField += "C";
	}
	public void append() {
		aField +="D";
		bField+="D";
		

}
	public static void main(String[] args) {
		System.out.println(aField);
		Number37 mb = new Number37();
		mb.append();
		System.out.println(aField);
		System.out.println(mb.bField);
	}
}
