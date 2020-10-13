package min.edu;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class LottoGame {
	private Auto auto;
	private Half_Auto_Num half;
	private Manual manu;
	private Switch sw = new Switch();
	ArrayList<int[]> a = new ArrayList<int[]>();
	
	
	
	
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
		
		int count=0;
		System.out.println("번호를 입력해주세요");
		while(count < Lotto_Const.LIMIT) {
			System.out.println("1번 자동 , 2번 반자동, 3번 수동");
			Scanner scan = new Scanner(System.in);
			int choice = scan.nextInt();
			
			a.add(sw.select(choice));
			
			//출력할수가 없다.  Arraylist 의 출력 하는방법 ? 주소가 아닌 값으로 ?
					
			
				
			count++;
			
		}
		
							
		
	}
	
	

}
