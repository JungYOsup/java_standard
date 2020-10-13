package min.edu;

public class Perfect_Number {
	
	//친화수란 : A의 진약수의 합이 B이고, B의 진약수의 합이 A인 값을 의미한다.
	//진약수란 자기자신을 제외한 모든 약수를 의미한다.
	
	
	public void friendlyScore(int n) {
		
		for(int i=2; i<=n; i++) {
			int a =i;
			int b =yaksuSum(a);
			int c =yaksuSum(b);
			
			if(a==c&&a<b) {
				System.out.println(a+"와"+b+"는 친화수입니다.");
			}
		}
		
	}
	
	
	
	//입력한 수의 약수를 판별해주는 메소드
	public boolean isCheck(int n, int a) {
		boolean check = false;
		
			
			if(n%a==0) {
				check =true;
			}
			
		
			
		return check;
	}
	
	//2부터 입력한 값 의 약수를 구한뒤 약수의 합을 구하는 메소드
	
	public int yaksuSum(int n) {
		int sum =0;
		
		for (int i = 1; i <= n/2; i++) {
			
			if(isCheck(n,i)) {
				sum+= i;
			
			}
									
		}
		
		
		
		return sum;
		
	}
	
	
	

}
