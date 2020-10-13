package min.edu.rab4;

import min.edu.AService;
import min.edu.IService;
import min.edu.Service;
import min.edu.Service_Other;

public class Inheritance_Main {

	public static void main(String[] args) {
		
		
		
		
		
		//OCP (Open Closed Principle
		//실행시키는 이름은 고정시키고 작동되는 소스는 자유롭게 작성
		
		Service s1 = new Service();//자식의이름으로 자식을 만듬 //실질적으로는 부모의 주소를 받는다.
		                                              //모든클래스는 Object를 상속받음 그리고 부모생성자가 만들어져야만 자식생성자가 만들어짐
		AService s2 = new Service();//2번째 부모의 이름으로 자식을 만듬
		IService s3 = new Service();//1번째 부모의 이름으로 자식을 만듬
		
		//생성되는 객체를 instance와 상관없이 참조되는 타입에 따라서 사용 범위가 정해짐.
		
		s1.make1();//부모의 make1(); 
		s1.make2();//자신의 make2(); 
		
		s2.make1();//자신의 make1(); 
		s2.make2();//자신의 make2(); 지만 자식의 기능을 씀(오버라이딩 되었기때문에) 
		
		s3.make1(); //자신의 make1(); 지만 Aservice의 기능을 씀 (오버라이딩 되서)
		s3.make2(); //자신의 make2(); 지만 Service의 기능을 씀 (오버라딩 되서)
		
		//즉 우리는 여기서 최상위 부모인 interface로 변수타입을 선언해주면 서로 연관되어있는 클래스(하위클래스)
		//의 메소드를 쓸수 있다는 장점이 있다.
		//즉 한번의 객체선언 IService s3 = new Service(); 만으로 그 자식들의 메소드를 씀
		
		IService o1 = new Service();
		IService o2 = new Service_Other();
		//IService o3 = new AService();를 할경우 
		//-> abstract클래스는 new 선언이 가능하지만(abstract는 생성자가 있으므로) 모양이 이상하므로 쓰지 않는다.
		//-> IService 04 = new IService()?? //불가능 //인터페이스는 생성자가 없으므로 new 선언이 안됨	
		o1.make2();
		o2.make2();
		
		
		Service changeO2 = (Service)o2;  //오류발생 (필기참조)
		Service_Other changeO1 =(Service_Other)o1; // 오류발생 (필기참조)
		
		Object obj = o1; // 최상위 부모클래스인 Object로의 업케스팅은 가능하다.
		obj = o2;
	
	
	}
	
	

}
