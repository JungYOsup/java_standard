import java.util.Scanner;

public class Greedy_1439 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		
		Greedy_1439(num);
		

	}
	
	public static void Greedy_1439(String num) {
		
		int count =0;
		int count2 = 0;
		
		int index = 0;
		
		char[] array = num.toCharArray();
		
		for(int i=0; i<num.length()-1; i++) { //7
			
			if(array[i]!=array[i+1]) {
				
				if(array[i]=='0') {
					count++;
				}else if(array[i]=='1') {
					count2++;
				}
							
			}
			index = i;
			
						
		}
		
		//마지막 부분 Check 
		if(array[index+1]=='0') {
			count++;
		}else {
			count2++;
		}
		
		System.out.println(Math.min(count, count2));
		
		
		
	}

}
