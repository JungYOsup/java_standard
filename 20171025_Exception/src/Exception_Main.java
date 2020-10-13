import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_Main {
	
	public static void main(String[] args) {
		
		
		while (true) {
			try {
				//입력이 아닌 수학적인 예외를 처리함.(ex) 10/0을 넣었을때 그 계산에서 수학적 오류가 발생)
				int result = inputNum() / inputNum();
				System.out.println(result);
				break;
			} 
			catch (ArithmeticException | InputMismatchException e) //or (Exception e)
			{
				System.out.println("다시입력하세요");
				System.err.println(e.toString());
				e.printStackTrace(); //예외가 발생시 예외를 추적해주는곳(원래는 오류가 발생하면 돌아가지 않는다에서 끝나지만 jvm에서 알아서 추적해줌)
			} finally {
				System.out.println("입력");

			} 
		}
		
	}
	
	public static int inputNum() {
		int n=0;
		System.out.println("값을 입력해주세요");
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		
		return n;
		
	}

}
/*	try {
			Class.forName("");
		} catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}*/
