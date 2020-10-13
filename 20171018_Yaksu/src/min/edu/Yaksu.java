package min.edu;

//1.  약수들
//2. 약수의 갯수
//3. 약수의 합 
public class Yaksu {
	int count =0;
	int sum =0;
	
	
	
	//숫자를 입력받아 약수를 출력
	
	public void make(int n ) {
		System.out.printf("%d 약수\n",n);
		
		for (int i = 1; i < n; i++) {
			
			if(isCheck(n,i)) {
				System.out.println(i);
				
				
				count++;	 // 증가연산
								/* count
								 *  = count +1; //5칙연산
								count+=1; //단축연산 */
				sum += i;
							
				
			}
			
			
		}
		if(sum==n) {
			System.out.printf(" %d 는 완전수가 맞습니다 \n", n);
		}
		System.out.printf(" 약수의 개수는 : %d \n ",count);
		System.out.printf(" 총합의 개수는 : %d \n",sum);
		
		
		
	}// make 

	private boolean isCheck(int n, int i) {
		boolean isc = false;
		isc = (n%i==0)?true:false;
		// TODO Auto-generated method stub
		return isc;
	}
}
	
	
