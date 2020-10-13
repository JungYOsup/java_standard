package min.edu.lab4;

public class Process {
	
	//메소드를 작성시에는 3가지 필수
	//접근제어자 ,반환타입,메소드명 () {}
	
	 public void print1() {
		 System.out.println("출력1");
	 }
	 
	 public void print2(int n) //Parameter: 중간에 값을 가지고 있다가 값을 전달 해주는값 (=매개변수) 
	 {
		 System.out.println(n);
	 }
	 
	 public void print3(int n , boolean b) {
		 System.out.println(n+""+b);
		 
	 }

}
