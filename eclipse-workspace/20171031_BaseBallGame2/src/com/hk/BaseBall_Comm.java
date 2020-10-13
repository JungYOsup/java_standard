package com.hk;

import java.util.Arrays;

public abstract class BaseBall_Comm {
	protected int[] box;
	
	
	public BaseBall_Comm(int n) {
		box=new int[n];
		
	}
	public int[] getbox() {
		return box;
	}
	
	public abstract void make();
	
	
	@Override
	public String toString() {
		return "= [box=" + Arrays.toString(box) + "]";
	}
	
	
	
	
	
	
	

}
