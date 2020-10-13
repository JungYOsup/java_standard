package min.edu;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Baseball_Main {

	public static void main(String[] args) {
			BaseBall_Pitcher pitcher = new BaseBall_Pitcher(5);
			BaseBall_Hiter hiter = new BaseBall_Hiter(5);
			
			int[] a =pitcher.getBox();
			int[] b =hiter.getBox();
			
			pitcher.Insert_Score();
			hiter.inser_Score();
			
			/*System.out.println(Arrays.toString(a));*/
			System.out.println(Arrays.toString(b));
			
			
	}

}
