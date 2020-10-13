package min.edu;

import java.util.Arrays;

//참조타입
//- 주소전달(pass by reference,mutable) // 주소를 전달되면 , 원본값이 같이 변경됨(mutable)
//Deep copy
// - 주소를 전달하기 때문에 주소에 접근해서 값을 변경할 경우
//   사용하고 있는 모든 변수의 값이 변경되어 적용된다.

public class DeepCopy {
	
	

	
	public static void main(String[] args) {
		/*Member_Dto dto = new Member_Dto("계백", "황산벌");
		System.out.println(dto);
		System.out.println(dto.hashCode()); // ?
		
		DTO_Chk dChk = new DTO_Chk();
		try {
			dChk.input((Member_Dto)dto.clone());
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	
		System.out.println(dto);
		System.out.println(dto.hashCode());
		*/
		
		//1. stack 에서 일어남 : 값을 가져와서 다른 배열에 넣어주는 방법 
		//2. heap 에서 일어남: Object를 통해 복사 함
		//3. memory 에서 일어남 : System Class를 통해서 복사해서 다른 배열에 넣어 줌 
		
		int[] array = {1,2,3,4};
		int[] cArray = array; //주소값 복사, shallow copy
		
		//1. stack : 값을 가져와서  다른 배열에 넣어줌
		
		int[] sArray = new int[array.length];
		
		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = array[i]; //DeepCopy
			
		}
		
		//2. heap 에서 일어남: Object를 통해 복사 함
		
		int[] oArray = array.clone();
		
		//3. memory 에서 일어남 : System Class를 통해서 복사해서 다른 배열에 넣어 줌 
		//System.arrayCopy(원본객체 , 원본객체 시작점 , 복사객체 , 복사객체 시작점 , 길이);
		int[] mArray = new int[10];
		System.arraycopy(array, 0, mArray, 2, 3);
		
		sArray[0] =100;
		oArray[0] =200;
		mArray[2] = 300;
		
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(sArray));
		System.out.println(Arrays.toString(oArray));
		System.out.println(Arrays.toString(mArray));
		System.out.println(Arrays.toString(array));
		
		
		
		
		
	}

	
	
	
	
	
}
