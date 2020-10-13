import java.util.Scanner;

public class MagicSquare_Factory {
	
	private static MagicSquare_Factory factory;
	private MagicSquare_Factory() {
		
	}
	
	public static MagicSquare_Factory getInstance() {
		if(factory ==null) {
			factory = new MagicSquare_Factory();
		}
		
		return factory;
	}
	
	
	public IMagicSquare factory() {
		IMagicSquare a =null;
		Scanner scan = new Scanner(System.in);
		System.out.println("원하는 마방진을 위해 숫자를 입력해주세요");
		int n= scan.nextInt();
		
		if(n<3) {
			System.out.println("존재하지 않는 마방진입니다");
		}
		else if(n%2==1) {
			a = new OddMagicSquare(n);
		}
		else if(n%4==0) {
			a = new EvenMagicSquare(n);
		}
		else {
			System.out.println("준비중입니다.");
		}
	
	
		return a ;
	}

}
