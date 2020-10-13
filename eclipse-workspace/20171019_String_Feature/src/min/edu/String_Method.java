package min.edu;

import java.util.Arrays;
import java.util.Scanner;

public class String_Method {
	//18. valueOf(Object);
	//모든타입을 문자열로 객체로 만들어 줌 
	
	public void valueOf_M() {
		int n = 100;
		char c ='K';
		double d =3.11;
		boolean b =true;
		Scanner scan =new Scanner(System.in);
		
		String_Method sm = new String_Method();
		System.out.println(sm);
		String nS = String.valueOf(n);
		String cS = String.valueOf(c);
		String dS = String.valueOf(d);
		String bS = String.valueOf(b);
		String obj = String.valueOf(scan);
		
		System.out.println(nS);
		System.out.println(cS);
		System.out.println(dS);
		System.out.println(bS);
		System.out.println(obj);
		
		
	}






	//17. trim();

	public void trim_M() {
		String str = "           korea       tt              ";
		String strT = str.trim();
		System.out.println(strT.length());
		System.out.println(str);
		System.out.println(strT);


	}


	//15. (1)toLowerCase(); , (2)toUpperCase();

	public void case_M() {
		String str ="abcDe";
		String strL = str.toLowerCase();
		String strU = str.toUpperCase();
		System.out.println(strL);
		System.out.println(strU);
	}

	//14. toCharArray();

	public void toCharArray_M() {
		String str ="CAT";
		char[] array = str.toCharArray();
		System.out.println(Arrays.toString(array));
	}







	//13.subString(index);
	public void subString_M() {
		String str = "한경닷컴 IT 교육센터";
		int idx = str.indexOf("교");
		System.out.println(idx);
		String obj = str.substring(8);
		System.out.println(obj);

		//IT만 잘라내자
		//i의 index는 5 ,T의 index는 6

		String obj1 =str.substring(5, 7);
		System.out.println(obj1);


	}
	//12. split(문자열);

	public void split_M() {
		String str ="Happy New Year";
		String [] obj =str.split("a");
		System.out.println(obj.length);
		for (int i = 0; i < obj.length; i++) {
			System.out.println(obj[i]);
		}
	}

	public void split_M2() {
		String str ="oop:foo:poo";
		String[] obj1 =str.split("o");
		for (int i = 0; i < obj1.length; i++) {
			System.out.println(obj1[i]);
		}
	}

	//11. replace(선택, 교체)

	public void replace_M() {
		String str ="happy";

		str = str.replace("ha", "pu");
		System.out.println(str);
	}




	//10. length();

	public void length_M() {
		String str = "korea";
		int n =str.length();
		System.out.println(n);
	}

	//7. indexOf(문자열) 
	//9. lastIndexIf(문자열)

	public void indeOfs_M() {

		String str = "happy";
		int n =str.indexOf('p');
		System.out.println(n);

		int b =str.lastIndexOf('p');
		System.out.println(b);
	}
	//실습
	//indexOf는 같은 값이 있는 문자를 찾아내서 해당 값의 index 번호를 반환한다.

	public int user_IndexOf(){
		String str = "happy";
		int a =0;

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='p') {

				a  = i;

			}

		}


		return a;
	}












	//6. equls(); //해쉬코드값으로 비교 //String은 Object 클래스에 의해 객체안의 값이 같다면 같은 hashode를 같도록 만듬 

	public void equals_M() {
		String str1 = "happy";
		String str2 = new String("happy");

		if(str1==str2) {
			System.out.println("==으로 비교할 수 있어요");
		}
		else if(str1.equals(str2)){
			System.out.println("String은 hashcode를 비교하는 equals를 사용해야 되요");
		}
		else {
			System.out.println("String은 다 비교 안되요");
		}

	}

	//5. contains(char or 문자열);

	public void contains_M() {
		String str ="happy";
		boolean isc = str.contains("a");
		System.out.println(isc);
		//실습
		//contains의 문법은 선행되어있는 문자열과 같은 문자가 있는지를 판단하는 메소드이다.
		//for문과 charAt 비교연산자 (==)를 이용하여 contains를 만들어보자
	}

	public boolean user_Contains() {
		boolean b=false;
		String str ="happy";

		for(int i=0; i<str.length(); i++) {
			if('a'==str.charAt(i)) {

				b= true;
			}

		}

		return b;
	}




	//4.concat(문자열)

	public void concat_M() {

		String str1 = "hap";
		String str2 = "py";
		String str3 = "happy";
		String result = str1.concat(str2);

		System.out.println(result == str3);


	}

	//2. compareTo(String 문자열);
	//3. compareToignoreCase(문자열);
	public void compareTo_M() {

		String strO = "Happy";
		String strC = "happy";

		int n =strO.compareTo(strC); 
		int b =strC.compareTo(strO);
		System.out.println(n); //H - h 


		int  k=strC.compareToIgnoreCase(strO);
		System.out.println(k);


	}



	//1.charAt(index 번호);

	public void charAt_M() {

		String str = "Happy"; //문자열

		/*String str2 = new String("Happy");*/

		for (int i = 0; i < str.length(); i++) {
			char c=str.charAt(i); // 문자형으로 
			/*System.out.println(c);*/
			int n =c;
			System.out.println(c+":"+n);
		}
	}


}
