package YouTube;

//String vs Stringbuilder vs StringBuffer
//String vs Stringbuilder

//String으로 문자들을 + 할경우 시간복잡도는 O(Xn^2)이 걸린다.
//그러나 Stringbuilder의 append를 사용할 경우 덜 걸린다.

//String은 "정"+"요섭" 을 하게 될경우 (String은 사실 char의 모음이기 때문) "[정]"을담을 배열 , "[요][섭]"을 담을 배열
//"[정][요][섭]"을 담을 배열이 필요하나
//StringBuilder는 
//한배열에 사이즈만 점점 늘려주면서 "[정][요][섭]"을 담는다. 

//Stringbuilder vs StringBuffer
//StringBuilder는 동기화를 보장하지 X
//StringBuffer는 동기화를 보장하므로 시간이 상대적으로 느리지만 , 멀트 thread 환경에서는 동기화를 보장해야하므로 StringBuffer을 사용해야한다.
public class Test {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("sung");
		sb.append(" is");
		sb.append(" pretty");
		System.out.println(sb.toString());
	}
	
}
class StringBuilder{
	
	private char[] value;
	private int size;
	private int index;
	
	
	public StringBuilder() {

		size=1;
		value=new char[size];
		index=0;
	}
	
	public void append(String str) {
		if(str==null) str="null";
		int len = str.length();
		ensureCapacity(len);
		for(int i=0; i<str.length(); i++) {
			value[index] = str.charAt(i);
			index++;
			
		}
		System.out.println(size+", "+ index);
	}

	private void ensureCapacity(int len) {
		if(index+len>size) {
			size=(size+len)*2;
			char[] newValue = new char[size];
			
			for(int i=0; i<value.length; i++) {
				newValue[i] = value[i];
			}
			value = newValue;
		}
	}
	
	public String toString() {
		
		return new String(value,0,index);
	}
}