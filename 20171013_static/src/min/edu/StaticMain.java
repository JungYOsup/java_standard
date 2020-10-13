package min.edu;

public class StaticMain {
// 1.static 메소드에서 non-static , static 메소드들을 호출할수 있는지
	
	public static void main(String[] args) 
	{
		StaticMain sm = new StaticMain();
		sm.make();
		
		print();
		

	}
	
	public  void make() {
		
	}
	
	public static void print() {
		
	}

}
