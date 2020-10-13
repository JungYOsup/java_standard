package min.edu.practice;

public class Nonstatic2 {
	
	public void nostatic2() {
		Usestatic.usestatic();
		
		Nonstatic ns = new Nonstatic();
		
		double b = 3.15;
		int i = 65;
		
		int c = (int)b;
		byte d = 5;
		int a = d;
		
		char f = 65;
		System.out.println(f);
		ns.nonstatic();
	}
	
	

}
