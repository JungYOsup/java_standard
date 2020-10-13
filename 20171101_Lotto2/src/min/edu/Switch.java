package min.edu;

public class Switch {
	Auto auto = new Auto();
	Half_Auto_Num half = new Half_Auto_Num();
	Manual manu = new Manual();
	int[] a=null;
	

	public int[] select(int n) {
		
		switch (n) {
		case 1:
			a=auto.makeLotto();
			break;
		case 2:
			a=half.makeLotto();
			break;
		case 3:
			a=manu.makeLotto();
			break;

		default:
			break;
		}
		
		return a;
	}

}
