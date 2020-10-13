package min.edu;

public class AntMain {
	
	public static void main(String[] args) {
		String chage="1";
		Ant_Sequence ant = new Ant_Sequence();
		
		for (int i = 0; i < 5; i++) {
			
			String result=ant.antProcess(chage);
			chage =result;
			System.out.println(chage);
			
		}
		
		
		
	}

}
