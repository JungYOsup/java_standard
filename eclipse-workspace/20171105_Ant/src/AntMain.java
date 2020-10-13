	
public class AntMain {

	public static void main(String[] args) {
		
		Ant_Sequence ant = new Ant_Sequence();
		String change ="1";
		for (int i = 0; i < 5; i++) {
			
			String a =ant.antprocess(change);
			change= a;
			System.out.println(change);
		}
	}
}
