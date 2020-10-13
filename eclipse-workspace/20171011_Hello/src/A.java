
public class A {


	boolean checkPalindrome(String inputString) {

		if(inputString.length()%2==0){
			
			
			return false;
		}else{
			boolean isS=false;
			char[] array = inputString.toCharArray(); 

			for(int i=0; i<inputString.length(); i++){

				isS= array[i]==array[inputString.length()-i-1]?true:false;
				
				System.out.println(isS);
			}
			
			return isS;

		}
	}



}
