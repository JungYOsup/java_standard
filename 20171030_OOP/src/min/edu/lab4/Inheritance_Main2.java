package min.edu.lab4;

import javax.print.attribute.standard.MediaSize.Other;

import min.edu.AService;
import min.edu.IService;
import min.edu.Service;
import min.edu.Service_Other;

public class Inheritance_Main2 {

	public static void main(String[] args) {
		
		Service sv = new Service();
		sv.make2(); //자기 자신의 메소드
		sv.make1(); //부모의 메소드 
		
		AService av = new Service(); // Aservice 는 new 로 인스턴스화 할수가 없다 (astract니까)
		av.make1(); // 자기 자신의 메소드
		av.make2(); // 자식의 메소드
		
		IService iv = new Service(); // IService 는 new로 인스턴스화 할수가 없다. (interface니까)
		iv.make2(); // implements한클래스의 자식의 메소드
		iv.make1(); // 자식의 메소드
		
		
		IService iv2 = new Service_Other();
		iv2.make2();
		
		IService iv3 = new Service();
		IService iv4 = new Service();
		
		Service sv2 = (Service)iv3;
		/*Service_Other so = (Service_Other) iv3;*/
		
	
		
		

	}

}
