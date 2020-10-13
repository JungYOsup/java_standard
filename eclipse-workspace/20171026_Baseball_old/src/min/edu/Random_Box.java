package min.edu;

public class Random_Box {
	
	private int[] box; //인스턴스변수 선언

	public Random_Box() {
		this(6);
		
		//box = new int[3];
		
	}
	public Random_Box(int n ) {
		
		box = new int[n];
		randomNum();
	}
	
	//랜덤을생성
	//방법
	//1. 다입력하고 확인
	//2. 입력하면서 확인
	//여기서는 다 입력하고 확인을 하겠다.
	
	private void randomNum() {
		int index = 0;
		while(true) {
			int n =(int)(Math.random()*50)+1; //random은 0.1~ 0.9 까지 나오므로 *9 해주고 
			                                                 //(int)해줘서 정수로 만들어줌, 그러면 8까지 나오는데 9까지 나오게 하기 위해 +1
			if(!isCheck(n)) { // 중복을 판단 중복이면 false
				box[index++] = n;
				
			}
			if(index == box.length ) {
				
				break;
			}
		}
	}
	
	//랜덤을 입력할때 중복 검사
	private boolean isCheck(int num) {
		boolean isc = false;
		
		for (int i = 0; i < box.length; i++) {
			if(box[i]==num) {
				isc = true;
			}
			
		}
		
		return isc;
		
	}
	
	
	public int[] getBox() {
		return box;
	}

}
