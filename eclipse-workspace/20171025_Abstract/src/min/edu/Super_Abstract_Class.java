package min.edu;

// abstract(추상메소드)가 있는 클래스 
// 추상메소드 :{}가 없는 애들 , 
// class와 매소드에서 사용된다. 
// 상속강요, 구현강요

public abstract class Super_Abstract_Class {
	
	protected int result;
	
	public Super_Abstract_Class() {
	
	}
	
	public abstract void make(); // 이건 다른사람한테 요청
	
	public void print() //  내가만듬
	{
		System.out.println(result + "출력");
	}
	
	
	
	

}
