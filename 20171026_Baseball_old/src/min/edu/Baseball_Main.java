package min.edu;

import java.util.Arrays;

public class Baseball_Main {
	
	
	public static void main(String[] args) {
		User_Box user = new User_Box();
		int[] rBox = user.input(3, 1,9,true);
		System.out.println(Arrays.toString(rBox));
		
		/*Random_Box ran = new Random_Box();
		int[] rBox = ran.getBox();
		System.out.println(Arrays.toString(rBox));*/
	}

}
