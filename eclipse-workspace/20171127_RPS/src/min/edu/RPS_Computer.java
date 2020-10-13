package min.edu;



public class RPS_Computer {
	int[] comNum = new int[3];//[0,0,0]
	
	//1~3까지 랜덤으로 숫자를 만들어주는 메소드
	public int randomNum() {
		int n = (int)((Math.random()*2)+1.1); //1,2,3 //((Math.random()*2)+1.1)은 안좋은 방법.. why Math.random이 0.9999가 나와야지 3이되기때문에;;
													  //그런데 0.9999가 나올 확률이 상대적으로 적다. 이거 우짜지.. 다른방법 생각해보자
		
		return n;
	}
	
	
	//중복확인후 배열을 만드는 메서드
	public int[] computer() {
				
		int count=0;
				
		while(count!=comNum.length) {//count와 배열의 길이가 같아지지않을떄까지 계속 된다. 같아지면 빠져나옴
		
			int ran=randomNum(); 
			
			if(!ischecked(ran)) {
				
				comNum[count++] = ran;
				
			}
		}
		return comNum;
			
						
			
	}
	//중복을 막기위해 판별하는 메소드
	public boolean ischecked(int i) {
		boolean ischeck = false;
		
		for (int j = 0; j < comNum.length; j++) {
			if(comNum[j]==i) {//만약 배열에 있는 숫자가 넣어줄 숫자와 일치할 경우 true로 리턴해준다.
				ischeck=true;
			}
		}
		
		
		return ischeck;
		
	}

}
