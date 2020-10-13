package min.edu.freindly.friendly2;

public class Perfect_Number {
	
	//친화수인지를 알려주는 메소드
	
	 public void friendlyScore(int n) {
		 for (int i = 2; i <=n; i++) {
			 int a = i;
			 int b = yaksuSum(a);
			 int c = yaksuSum(b);
			 
			 
			 if(a==c && a<b) {
				 System.out.println(a +"와" +b+"는 친화수 입니다.");
			 }
			
		}
	 }

	
	
	//약수인지를 판별하는 메소드
	public boolean isCheck(int a, int b) {
		boolean ischeck =false;
		
		if(a%b==0) {
			ischeck =true;
		}
		
			
		return ischeck;
	}
	
	
	//약수인지를 판별하여 약수의 합을 구하는 메소드
	
	public int yaksuSum(int a) {
		int sum =0;
		
		for (int i = 1; i < a; i++) {
			
			if(isCheck(a, i)) {
				sum+= i;
			}
		}
		
		return sum;
	}

}
