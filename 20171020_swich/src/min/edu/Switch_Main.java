package min.edu;

public class Switch_Main {

		public static void main(String[] args) {
			//swirch~case문
			//선택문 입력받은 값과 같은 값이 있는 경우 실행
			//fall throw :작동
			//반드시 break;
			//ex)1.7 이상에서는 String도 가능
			//    ApI 정수만을 사용하라고 되어있음(정수만비교됨 , 그러나 1.7버전 이상에서는 String 가능)
			int key = 10;
			
			switch (key) {
				case 8 :
					System.out.println("숫자 8입니다");
				
					
				case 9 :
					System.out.println("숫자 9입니다");
				
				
				
				case 10 :
					System.out.println("숫자 10입니다");
					
				default:
				System.out.println("다른 숫자입니다");
				
			}
		}
		
		public void check() {
			String str = "A";
			switch (str) {
			
			case "A":
				System.out.println("문자열도 비교됩니다.");
				break;

			default:
				break;
			}
		}
}
