package Kan;

public class palindrome_회문 {
	
	
	public static void main(String[] args) {
		
		
		System.out.println(palindrome("abbbba"));
		
	}
	
	//**재귀 알고리즘이 실제로 작동하려면 범위가 더 좁은 하위 문제가 base case에 도달하여 재귀함수가 끝날 수 있어야 합니다.
	public static boolean palindrome(String input) {
		
		
		//basecase(탈출조건)
		if(input.length()<=1) {
			return true;
		}
		
		String first = input.substring(0, 1);
		String last = input.substring(input.length()-1,input.length());
		
		if(!first.equals(last)) {
			return false;
		}else {
			
			String result = input.substring(1,input.length()-1);
			/*boolean isC = palindrome(result);
			return isC;*/
			
			return palindrome(result);
					
			/*palindrome(result); //이게 틀린이유 ex) abbca일때 첫번째 이 함수가 시작될때 두번째로 도는 함수에서 return false값을 반화하는데 그 값을 받아주는 변수가 없다. 그렇게 때문에 return true가 실행되어 true값이 나옴 답이 맞으려면 return되는 값을 받는 변수가 필요하다.  		 
			return true;*/
		}
		
			
		
	}

}
