package min.edu;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoGame {
	private Auto auto;
	private Half_Auto_Num half;
	private Manual manu;
	
	
	
	public LottoGame(int n) {
		auto = new Auto(n);
		half = new Half_Auto_Num(n);
		manu = new Manual(n);
	}
	public LottoGame() {
		this(6);
		
		
	}
	
	//로또를 실행시켜주는 메소드
	public void LottoPlay() {
		
		auto.makeLotto();
		System.out.println(auto.toString());
		
		half.makeLotto();
		System.out.println(half.toString());
		manu.makeLotto();
		System.out.println(manu.toString());
		
				
			
				
			
			
		
		
		
						
		
	}

}
