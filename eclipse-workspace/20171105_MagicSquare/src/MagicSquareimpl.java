
public abstract class MagicSquareimpl implements IMagicSquare {
	
	protected int[][] magic;
	
	public MagicSquareimpl(int n)
	{
		magic = new int[n][n];
		
		
	}
	
	
	@Override
	public abstract void makeMagic(); 
		
	
	public int[][] getMagic() {
		return magic;
	}



	@Override
	public void printMagic() {
		MagicSquare_Check mc = new MagicSquare_Check();
		
		System.out.println("마방진 실패여부" + (mc.isCheck(magic)?"실패":"성공"));
		
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic.length; j++) {
				System.out.print(magic[i][j] +"\t");
				
				
			}
			System.out.println();
		}
		

	}

}
