package min.edu;

import min.edu.practice.Nonstatic;
import min.edu.practice.Usestatic;

public class Main {

	public static void main(String[] args) {
		
		
		Usestatic.usestatic();
		Nonstatic ns = new Nonstatic();
		ns.nonstatic();
		
		hh();

	}
	
	public static void yosup() {
		
	}
	protected static void insup() {
		
	}
	private static void hh() {
		
		byte a =120;
		byte b =7;
		int ab= (int)(a+b);
		int cd = a+b;
		
		double h = 1;
		int g =(int)1.1;
		byte f =10;
		
		char c =65;
		int index = c;
		
		
		System.out.println(h);
		System.out.println(g);
		System.out.println(index);
		
	}
	
	
	}
	
	


