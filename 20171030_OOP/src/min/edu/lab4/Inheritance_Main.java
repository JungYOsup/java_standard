package min.edu.lab4;

import min.edu.AService;
import min.edu.IService;
import min.edu.Service;
import min.edu.Service_Other;

public class Inheritance_Main {

	public static void main(String[] args) {
		//OCP(Open Closed Principle)
		//실행시키는 이름은 고정시키고 작동되는 소스는 자유롭게 작성 
		
		Service s1 = new Service(); // 자식의 이름으로 자식을 만듬
				
		AService s2 = new Service(); // 두번쨰 부모의 이름으로 자식을만듬 //즉 Service의 주소가 아닌 가장 상위클래스 주소인 Object 주소를 받음(모든 클래스는 Object를 상속받았으니까) 
												 // 그렇기에 Object메소드와 AService 메소드를 사용할수 있다. 그런데 Aservice의 자식 클래스인 Service의 메소드는 쓸수없다. 그래서 print()는 쓸수 없는것이고 make2는 AService껄 호출한것이지만
		 										// 자식이 오버라이딩 했으므로 자식의 오버라이딩 한것을 가져다 쓴것이다.
		                                        
		
											
		                                         /*
		                                          *  메모리특징중: 1 자식이 생성되려면 부모가 먼저 생성되어야한다.
		                                          *                       2 자식의 설계도가 올라가려면 부모가 먼저 올라가야함
		                                          *                       3 생성된 주소는 부모의 주소 
		                                          *                       4. 설계도에 공계되어 있는 메소드만이 사용가능하다.
		                                          */
		                                                 
		
		IService s3 = new Service();// 최상위부모의 이름으로 자식을 만듬
		
		
		
		
		
		
		// 생성되는 객체를 instance와 상관없이 참조되는 타입(Service, AService , IService)에 따라서 사용범위가 정해짐
		
		s1.make1(); //부모꺼
		s1.make2(); //자신꺼
		
		s2.make1(); //부모꺼
		s2.make2(); //부모꺼 //부모꺼지만 부모의 make2()는 생성되지 않았기 떄문에 호출은 AService의 make2()로 호출하지만 기능이 없으므로 자동으로 자식꺼의 기능을 쓴다.
		
		s3.make1();  //최상위 부모 //알아서 부모의 make1()을 실행시켜주고
		s3.make2(); //최상위 부모 // 알아서 부모의 make2()를 실행시켜주지만 , 부모의 make2()는 기능이 존재하지 않으므로 자식의 make2()를 기능꺼를 쓴다.
		
		//즉 최상위 부모에는 껍대기 밖에 없지만 그 하위 부모와 자식들이 기능을 가지고 있으면 호출해서 쓸수 있다.
		
		
		IService o1 = new Service(); //최상위 부모의 이름으로 자식Service()를 만듬 
		
		IService o2 = new Service_Other();//최상위 부모의 이름으로 자식Service_Other를 만듬 
		
		o1.make2();
		o2.make2();
		
		// 계층구조
		Service changeO2 = (Service)o2; //같은계층이기 떄문에 문법적 오류가 발생하지 않는다, 그러나 원래 형태가 다르기 때문에 Class Exception이 발생한다.
		Service_Other changeO1 = (Service_Other) o1; //같은 계층이지만 원래 형태가 다르기 때문에 Class Exception이 발생한다.
		
		Object obj = o1;
		obj =o2; // 이렇게 업케스팅은 문제없지만 , 다운케스팅 할때는 명확하게 해야한다. (Object로 무엇이든 업케스팅할수 있다)
		
		//부모가 같으니까 이름이 같은것으로 실행시킬수 있다는 장점이 있다. 

		
		
		
	}

}
