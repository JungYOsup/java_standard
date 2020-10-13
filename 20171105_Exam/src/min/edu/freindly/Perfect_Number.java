package min.edu.freindly;

public class Perfect_Number {
	
	//친화수를 찾아주는 메소드
	public void friendlyScore(int n) {
		
		for (int i = 2; i <= n; i++) {
			int a =i;
			int b =yaksuSum(a);
			int c =yaksuSum(b);
			
			if(a==c&&a<b) {
				System.out.println(a+"와"+b+"는 친화수이다.");
			}
			
			
		}
		
		
	}
	
	
	//약수인지를 판별하는 메소드
	public boolean isCheck(int a , int b) {
		boolean isc = false;
		if(a%b==0) { // 약수이면 true로 리턴해준다.
			
			isc = true;
		
		}
		
		
		return isc;
		
	}

	//약수인지를 판별해서 더하는 메소드
	public int yaksuSum(int a) {
		int sum =0;
		
		for (int i = 1; i < a; i++) {
			
			if(isCheck(a, i)) {
				sum+=i;
			}
		}
		
		return sum;
		
	}
}
