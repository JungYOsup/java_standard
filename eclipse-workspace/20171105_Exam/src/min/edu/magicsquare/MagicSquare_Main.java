package min.edu.magicsquare;

import java.util.Arrays;

public class MagicSquare_Main {
	
	
	public static void main(String[] args) {
		
		MagicSquare_Factory fac = MagicSquare_Factory.getInstance();
		
		IMagicSquare imagic=fac.factory();
		
		if(imagic ==null) {
			System.out.println("마방진을 만들수 없습니다.");
		}
		
		imagic.makeMagic();
		imagic.printMagic();

}
}
