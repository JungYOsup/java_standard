package min.edu;

public class UpDown_Random {
	
	//랜덤한 숫자를 만드는 메소드
	public int random() {
		int ran = 0;
		
		ran = (int)((Math.random()*50)+0.1);//1~50까지 랜덤하게골라줌
		
		return ran;
	}

}
