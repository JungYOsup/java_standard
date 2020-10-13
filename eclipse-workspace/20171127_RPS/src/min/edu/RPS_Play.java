package min.edu;



public class RPS_Play {
	private RPS_Computer com = new RPS_Computer();
	private RPS_User user = new RPS_User();
	private RPS_Compare compare = new RPS_Compare();
	
	
	//게임을 플레이하는 메소드
	public void playGame() {
		int ran = com.randomNum();//1~3까지의 랜덤숫자를 가져옴
		int a[] = com.computer();//중복확인후 배열을 만들어주는 메서드를 받는 변수
		String str = a[0]+":가위"+","+a[1]+":바위"+","+a[2]+":보";
		System.out.println(str);
		System.out.println("컴퓨터는"+a[ran-1]+"번호를 입력헀습니다");
		int userNum =user.user();//사용자가 랜덤숫자를 입력하는 메서드를 받는 변수
		

		
	
		
		
				
		
	}

}
