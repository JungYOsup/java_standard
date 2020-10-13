package Youtube;

//치환: 문자열의 치환이랑 문자열안에 문자들을 나열에서 만들수 있는 수를 치환이라고 한다.
//ex) abc를 치환하면 -> abc, bac , cab , acb , bca , cba
//그렇다면 어떻게 하면 치환에 걸리는 시간을 구할수 있을까?
//abc의 화면에 호출되는 가짓수 = 3! (3*2*1) 
//abc의 재귀함수에 의해 도는 횟수 = 3번 = 문자열의 길이 
//총횟수 3*3! (문자열의 길이를 N이라 고 했을때 N*N!)

//함수 안에서 걸리는 시간
//맨 마지막에서 화면에 호출될때 걸리는 시간 N 
//for문도는 시간 N
//따라서 2N의 시간이 걸리지만 상수 제거 하여 결국에는 N만큼의 시간이 걸림

//따라서 O(N*N*N!)이 걸림 
//O(N^2*N!)
public class Test {
	
	public static void main(String[] args) {
		
		
		String a = "abc";
		
		
		
		purmutation("abc", "");
		
		
		
		
	}
	
	public static void purmutation(String str , String prefix) {
		
		if(str.length()==0) {
			System.out.println(prefix); //abc
		}else {
			
			for(int i=0; i<str.length(); i++) {
				String rem =str.substring(0, i) + str.substring(i+1);   
				
				purmutation(rem, prefix+str.charAt(i));
			}
			
		}
		
	}
}
