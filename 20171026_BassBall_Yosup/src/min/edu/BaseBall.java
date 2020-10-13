package min.edu;

import java.util.Arrays;

public abstract class BaseBall {
	
	int[] box;
	
	
	public BaseBall(int n) {
		box = new int[n];
	}


	protected abstract void make();
	
		
	@Override
	public String toString() {
		return "BaseBall [box=" + Arrays.toString(box) + "]";
		
	}
	
	


}
