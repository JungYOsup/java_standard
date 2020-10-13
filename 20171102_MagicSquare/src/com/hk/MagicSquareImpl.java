package com.hk;

public abstract class MagicSquareImpl implements IMagicSquare {

	protected int[][] magic;
	@Override
	public abstract void makeMagic();
	
	public MagicSquareImpl(int n ) {
		magic = new int [n][n];
	}
	
	

	

	public int[][] getMagic() {
		return magic;
	}

	@Override
	public void printMagic() {
		MagicSquare_Check chk = new MagicSquare_Check();
		
		
		System.out.println("마방진의 실패여부?  " +(chk.isCheck(magic)?"실패":"완성"));
		
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic.length; j++) {
				System.out.print(magic[i][j] +"\t");
						
			}
			System.out.println();
			
			
		}

	}

}
