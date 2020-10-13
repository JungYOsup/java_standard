package min.edu;

public class StringCompare {
	public static void main(String[] args) {
		String str1 = "HanKyung";
		String str2 = new String("HanKyung");
		String str3 = "Han" + "Kyung";
		String s1 = "Han";
		String s2 = "Kyung";
		String str6= s1+s2;
		double d = 5.1425;
		Object o = d;
		int io = (int)(double)o;
		
/*		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str6));
		
		System.out.println(str1 == str2);
		System.out.println(str2 == str3);
		System.out.println(str3 == str6);*/
		
	/*	System.out.println(str1.intern().hashCode());
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());*/
		System.out.println(str2.toString()==str3.toString());
		/*System.out.println(str3.toString());*/
		
		System.out.println(str6.intern().hashCode());
		System.out.println(str2.toString() == str3.toString());
	}

}
