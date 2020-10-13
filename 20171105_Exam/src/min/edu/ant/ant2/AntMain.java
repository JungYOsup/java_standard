package min.edu.ant.ant2;

public class AntMain {
	
	public static void main(String[] args) {
		String change ="1";
		
		Ant_Sequence as = new Ant_Sequence();
		
		for (int i = 0; i < 5; i++) {
			String a = as.antProcess(change);
			change = a;
			System.out.println(change);
			
		}
	}

}
