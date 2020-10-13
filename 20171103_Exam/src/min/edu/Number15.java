package min.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Number15 {
	private List<Dto> list;
	private Dto dto;
	Process pr = new Process();
	
	public Number15() {
		list = new ArrayList<Dto>();
	}
	public void addDTO() {
		String[] name = {"하늘","바람","별","꿈"};
		int count=0;
		
		for(String s : name) {
			dto = new Dto(count++ ,s);
			list.add(dto);
		}
	}
	public List<Dto> getList(){
		return list;
	}

}
