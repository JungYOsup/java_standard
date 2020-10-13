package min.edu;
/*★★★★★★★

 ☆★★★★★

 ☆☆★★★

 ☆☆☆★

 ☆☆★★★

 ☆★★★★★

 ★★★★★★★*/


public class Practice8 {
	
	public static  void practice8(int n) {
		int j2 = 3;
		for(int i=0; i<n; i++) {
			
				for (int j = 0; j < (n/2)-j2; j++) {
					System.out.print("☆");
					
				}// X표시
				
				for (int j = 0; j < 2*j2+1; j++) 
				{
					System.out.print("★");
					
				}
				System.out.println("\n");
				
				if(i<3) {
					j2--;
				}
				else {
					j2++;
				}

		}//층수
		
	}

}
