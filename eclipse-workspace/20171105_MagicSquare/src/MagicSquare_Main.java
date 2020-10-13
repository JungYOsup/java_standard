
public class MagicSquare_Main {
	
	public static void main(String[] args) {
		
		MagicSquare_Factory fac = MagicSquare_Factory.getInstance();
		IMagicSquare magic = fac.factory();
		if(magic == null) {
			System.out.println("마방진을 실행할수 없습니다.");
		}
		magic.makeMagic();
		magic.printMagic();
		
		
		
		

}
}
