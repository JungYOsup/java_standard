package min.edu.magicsquare;

import java.util.Scanner;

public class MagicSquare_Factory {
	
	private static MagicSquare_Factory factory;
	
	
	private MagicSquare_Factory() {
	
	}
	
	public static MagicSquare_Factory getInstance() {
		
		if(factory == null) {
			factory = new MagicSquare_Factory();
		}
		return factory;
	}
	
	
	
	public IMagicSquare factory() {
		IMagicSquare magic = null;
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 숫자를 입력하시면 숫자에 맞는 마방진이 만들어집니다.");
		int n =scan.nextInt();
		
		if(n<3) {
			System.out.println("존재하지 않는 마방진입니다");
		}
		else if(n%2==1) {
			
			magic = new OddMagicSquare(n);
		}
		else if(n%4==0) {
			magic = new EvenMagicSquare(n);
		}
		else {
			System.out.println("현재 제작중에 있습니다.");
		}
		
		
		
		return magic;
	}
	
	
	

}
