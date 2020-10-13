package min.edu;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {

		
			//JCF는 참조타입만 입력이 가능하다 , 따라서 <> 안에 기본타입 안됨 
			List<Integer> list = new ArrayList<Integer>();
			//		List<int> list = new ArrayList<int>(); 이거 안됨

			list.add(1);
			list.add(2);
			list.add(3);
			list.add(3);
			System.out.println(list.size());
			System.out.println(list.get(0));
			System.out.println("----------------------------");
			list.remove(1);
		System.out.println(list);

		}

	}

