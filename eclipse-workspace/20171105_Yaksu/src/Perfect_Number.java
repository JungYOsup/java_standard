
public class Perfect_Number {
	
	
	//친화수를 판별하는 메소드
	
	public void friendly(int n) {
		
		
		for (int i = 2; i <= n; i++) {
			int a = i;
			int b =sum(a);
			int c =sum(b);
			
			if(a==c&&a<b) {
				System.out.println(a+"와"+b+"는 친화수이다.");
			}
		}
		
				
	}
	
	//약수인지 판별하는 메소드
	public boolean isCheck(int a, int b) {
		boolean check =false;
		
		if(a%b==0) {
			check =true;
		}
		return check;
		
	}
	
	//약수를 판별하고 그 약수의 합을 구하는 메소드
	
	public int sum(int n) {
		int sum=0;
		
		for (int i = 1; i < n; i++) {
			
			if(isCheck(n, i)) {
				sum+=i;
			}
			
		}
						
		return sum;
		
	}

}
