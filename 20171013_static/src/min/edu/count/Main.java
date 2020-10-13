package min.edu.count;

public class Main {
		public static void main(String[] args) {
			A a1 =new A();
			a1.s="가";
			a1.count=10;
		
			A a2 =new A();
			a2.s="나";
			a2.count+=100;
		/*	a1 = null;
			a2 = null;*/
			byte b1 =127;
			byte b2 =1;
			byte s =((byte) (b1+b2));
			int a = 10;
			int b =01000;
			int c = 0x100000;
			char d = '\uffff';
			char h = '\u0041';
					
			int f = 0xffff;
			boolean g =true;
			
			String o =Integer.toBinaryString(65);
			String z =Integer.toHexString(h);
			String y =Integer.toOctalString(65);
			
			System.out.println(o);
			System.out.println(z);
			System.out.println(y);
			
	
		/*	System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);
			System.out.println(f);
			System.out.println(g);*/
			
			
			/*System.out.println(a1.count);
			System.out.println(a2.count);
			System.out.println(A.count);
			*/
		}
}
