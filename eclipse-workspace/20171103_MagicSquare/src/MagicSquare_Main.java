
public class MagicSquare_Main {

	public static void main(String[] args) {
		
		
		MagicSquare_Factory magicFactory = MagicSquare_Factory.getInstance();
		IMagicSquare magic = magicFactory.factory();
		
		if(magic ==null) {
			System.out.println("마방진 생성에 실패하였습니다");
		}
		magic.makeMagic();
		magic.printMagic();
		
	}

}
