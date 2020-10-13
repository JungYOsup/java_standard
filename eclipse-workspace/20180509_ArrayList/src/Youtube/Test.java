package Youtube;
//배열은
//PHP -> DYNAMIC(자동으로 늘어남)
//JAVA -> FIXED (자바에서는 배열이 고정되어있다)
//그러나 ArrayList는 
//배열이 DYNAMIC하게 동작한다. 값이 추가되면 사이즈도 자동으로 늘어남.
//그런데도 불구하고 입력시간은 O(1),검색시간도 O(1) 그 이유는 배열방이 다 차면 배열방의 크기를 2배(doubling) 늘려줄떄 n의 시간이 걸린다고 할때
//그 전에 데이터를 크기를 늘려준 배열방에 넣어줄때는 절반만 넣어주면 되기때문에 n/2 그리고 그전에는 n/4 ---- 이런식으로 나아가기때문이다.

public class Test {

	public static void main(String[] args) throws Exception {
		
		ArrayList al = new ArrayList();
		al.add("0");
		al.add("1");
		al.add("2");
		al.add("3");
		al.add("4");
		al.add("5");
		al.add("6");
		al.add("7");
		al.add("8");
		al.add("9");
		System.out.println(al.get(5));
		al.remove(5);
		System.out.println(al.get(5));
		
	}

}

class ArrayList{
	
	private Object[] data;
	private int size;
	private int index;
	
	public ArrayList() {
		this.size=1;
		this.data = new Object[this.size];
		this.index=0;
	}
	public void add(Object obj) {
		if(this.index==this.size-1) {
			doubling();
		}
		data[this.index]=obj;
		this.index++;
	}
	private void doubling() {
		
		this.size=this.size*2;
		Object[] newData = new Object[this.size];
		for(int i=0; i<data.length; i++) {
			newData[i] = data[i];
		}
		this.data =newData;
	}
	
	public Object get(int i) throws Exception{
		if(i>this.index-1) {
			throw new Exception("ArrayIndexOutOfBound");
		}else if(i<0) {
			throw new Exception("Negative Value");
		}else {
			return this.data[i];
		}
	}
	
	public void remove(int i) throws Exception{
		if(i>this.index-1) {
			throw new Exception("ArrayIndexOutOfBound");
		}else if(i<0) {
			throw new Exception("Negative Value");
		}
		for(int x=i; x<this.data.length-1; x++) {
			data[x] = data[x+1];
		}
		this.index--;
	}
	
}