/**
 * 라이트봇을 실행시키는  main을 가진 클래스 
 * @author 정요섭
 *
 */
public class Play_LightBot {

	/**
	 * 메인메소드(에플리케이션 실행시 처음 실행 됨)
	 * @param args
	 */
	public static void main(String[] args) {

		Function_LightBot bot =new Function_LightBot();
		
		for(int i=0; i<3; i++) {
			bot.pro1();
		}
	
		
		Function_LightBot.pro1();

	}


}
