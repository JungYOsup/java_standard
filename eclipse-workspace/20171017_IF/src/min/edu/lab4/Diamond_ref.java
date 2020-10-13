package min.edu.lab4;

public class Diamond_ref {
	
	int j2 =0;// 변하는 값, j2 변수를 통해서 증가 혹은 감소
	
	public void diamond3(int n) { // 7

		for (int i = 0; i <n; i++) { //0


			for (int j = 0; j < n/2-j2; j++) {
				
				System.out.print("☆");

			}//흰색 for

			for (int j = 0; j < 2*j2+1; j++) {
				System.out.print("★");

			}//검은색 for 
			System.out.println("\n");
			
			/*check(i,n/2);*/
			
			
			 /*j2=(i<n/2)? ++j2 : --j2;*/
			 
			 
			 check2(i,n/2);
		   /* if(i<n/2) {
				j2++;
				
			}
			else {
				j2--;
			}*/

		} //층수 for
	} // diamond3
	
	private int check2(int n,int m) {
		
		return (n<m)? j2++:j2--;
		
	}
	
	private void check(int n , int m) {
		if(n<m) {
			j2++;
			
		}
		else {
			j2--;
		}
	}
	

}
