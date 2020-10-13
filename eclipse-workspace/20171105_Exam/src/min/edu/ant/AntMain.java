package min.edu.ant;

public class AntMain {
	
	
	public static void main(String[] args) {
		Ant_Sequence as = new Ant_Sequence();
		String change = "1";
		for (int i = 0; i < 5; i++) {
			String b= as.antProcess(change);
			change = b;
			
			System.out.println(b);
		}
		
	}

}
