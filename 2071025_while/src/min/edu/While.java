package min.edu;

public class While {

	public static void main(String[] args) {
		
		//while 은 무한 반복문이다.
		
		int count =0;
		
		while(true) {
			System.out.println(count++);
			
			if(count==7) {
				break;
			}
		}
		
		//do~~while
		
		/*do {
			System.out.println("실행");
		} while (false);{

	}*/

}
}
