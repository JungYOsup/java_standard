package min.edu.ifif;

public class IF_Class {
	
	public static void main(String[] args) {
		// 약수 : 자기 자신의 수를 제외한,1도 제외한  자신과 나누어 0이 되는 수 
		
		int number =1234500;
		
		for (int i = 2; i < number; i++) {
			
			if(number%i==0) {
				System.out.println(i);
			}
			
		}
		
		
		
		
		
		
		
		/*int n =2017;
		
		if(n%2!=1) {
			System.out.println("짝수임돠");
			
		}
		else {
			System.out.println("홀수임돠");
		}
		*/
		
		
		
		/*for (int i = 0; i < 11; i++) {
			
			
			if (i%2==1) {
				System.out.println(i);
			}else 
			{
				System.err.println(i);
			}
			
		}*/
		
	}

}
