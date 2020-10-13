package min.edu;

import java.sql.Date;

import javax.xml.crypto.Data;

public class Object_4th {	
	public static void main(String[] args) {
		
		IAM am = new IAM(); //참조
		int i =100; //기본
		String str = "string"; //참조지만 부모한테서 toString받은것을 "string"이 보이게overriding 했기때문에.
		
		System.out.println(am.toString()); // 결과값 min.edu.IAM@15db9742

		System.out.println(str.toString()); //string
		
		System.out.println(i); //기본타입은 집이 없다 
		
		System.out.println(am.getClass());
		System.out.println(str.getClass());
		
		Date dSQL = new Date(2017, 10, 25);
		java.util.Date dUtil = new java.util.Date(2017, 10, 25);
		System.out.println(dSQL.getClass());
		System.out.println(dUtil.getClass());
		
		System.out.println(am.hashCode());
		System.out.println(System.identityHashCode(am));
		
	}
	

}
