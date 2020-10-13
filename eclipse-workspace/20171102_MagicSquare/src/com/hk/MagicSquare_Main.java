package com.hk;

public class MagicSquare_Main {
	
	public static void main(String[] args) {
	/*	OddMagicSquare odd = new OddMagicSquare(3);
		odd.makeMagic();
		int[][] magic = odd.getArray();*/
		
		/*int[][] check = new int[5][2];
		System.out.println(check[0].length); //해당 x의 y의 갯수 출력
		System.out.println(check.length);// x, 세로의 칸수를 출력
		MagicSquare_Check chk = new MagicSquare_Check();
		EvenMagicSquare even = new EvenMagicSquare(4);
		even.makeMagic();
		int[][] magic = even.getMagic();
		
		System.out.println("마방진의 실패여부?  " +(chk.isCheck(magic)?"실패":"완성"));
		
		for (int i = 0; i < magic.length; i++) {
			for (int j = 0; j < magic.length; j++) {
				System.out.print(magic[i][j] +"\t");
						
			}
			System.out.println();
			
			
		}*/
		
		/*IMagicSquare magic = new OddMagicSquare(3);
		magic = new EvenMagicSquare(4);
		magic.makeMagic();
		magic.printMagic();*/
		
		/*IMagicSquare magic = MagicSquare_Factory.factory();
		if(magic ==null) //null은 Heap 영역에 생기지 않았기 때문에 
		{
			System.out.println("마방진 생성에 실패하였습니다.");
		}
		magic.makeMagic();
		magic.printMagic();
		
		
	}*/
		MagicSquare_Factory magicFactory = MagicSquare_Factory.getInstance();
		IMagicSquare magic = magicFactory.factory();
		if(magic ==null) //null은 Heap 영역에 생기지 않았기 때문에 
		{
			System.out.println("마방진 생성에 실패하였습니다.");
		}
		magic.makeMagic();
		magic.printMagic();
		
		

}
}
