package min.edu;
//36. Interface
/* - 상속강요
 *  -abstract 는 일반클래스 추상/추상메소드 (키워드 extends ) 
 *  -Interface는 추상메소드만의 집합
 *                    접근제어자를 사용할시 protected , private 는 아예 사용을 못함 (상속이 무조건적인 필수이기 때문이다)
 *                    생성자가 없음 (new가 안됨)
 *                    맴버필드를 선언하면 자동으로 static final 이 붙음 
 *                    키워드 : implements ("상속"이라고하지말자)
 *                    다중으로 implements가 가능함 
 *                    Interface는 클래스가아니라 "Interface"이다.
 *                    
 */
public interface Interface_Area {
	
	String str = "정요섭"; //자동으로 static final 화 됨 , 그렇기에 값을 넣을수 없음 
	
	public void make();
	void print();
	public void test();
	
	
	
	
	

		
}
