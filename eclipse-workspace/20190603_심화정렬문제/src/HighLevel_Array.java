import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
//주어지는 문자열의 길이는 50을 넘지 않는다.


//1.길이가 짧은 것부터
//2.길이가 같으면 사전 순으로


//(1) 알파벳 소문자 소문자로 이루어진 단어 -> 대문자일경우 소문자로 바꿔주는 작업 
//(2) 문자열의 길이는 50이 넘지 않는다. -> 50이 넘을경우 break해야겠다.
//(3) 문자열의 20,000-> 20000이 넘을경우 break
//(4) 단어의 개수가 2만 이내이므로 , 최대 걸리는 시간은 4억이네.. 따라서 순서를 정렬 할때 버블,선택,삽입은안돼고 , 퀵도 안될것 같고, 병합이나, sort, 힙, 계수(?)

// 그런데 계수를 쓸수 잇을까 계수는 제한이 필요하다 했음 , 예를들어 5 이하의 숫자를 나열할때.
// 계수는 안될듯 !! 왜냐하면 제한이 안돼잖아 문자열이 !

//그러면 병합이나 , sort , 힙

//또한 첫번째가 같으면 2번째를 비교하고 2번째가 같으면 3번째를 비교해야하네..?(사전순)

//입력 
//13
//but
//i
//wont
//hesitate
//no
//more
//no
//more
//it
//cannot
//wait
//im
//yours

//출력 
//i
//im
//it
//no
//but
//more
//wait
//wont
//yours
//cannot
//hesitate


public class HighLevel_Array {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int Num=scan.nextInt();

		String[] array = new String[Num];

		for(int i=0; i<Num; i++) {

			String value = scan.next();
			array[i]=value;
		}

//		Basic_Sort(array);
		Sort(array);



	}

	//sort함수를 이용해보자.

	public static void Basic_Sort(String[] array) {
		Arrays.sort(array);

		for(String value : array) {
			System.out.println(value);
		}
	}
	public static void Sort(String[] array) {

		//Comparator - 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용. 
		//기본정렬은 : 오름차순 , 사전식


		//그렇다면 Comaprtor을 쓰면은 기본적으로 오름차순 , 사전식을 전재가 깔려있고
		//거기다가 길이가 짧으면 우선적으로 나오게
		Arrays.sort(array, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				if(o1.length()>o2.length()) {
					return 1; //양수면 길이가 짧은게 먼저 나오고
				}else if(o1.length()<o2.length()) { // 음수면 길이가 긴것이 뒤에나옴
					return -1;
				}else {//만약 길이가 같을경우 사전순
					return o1.compareTo(o2); //즉 즉 no , im , it 같은 경우 서로 비교를 해서 음수가 나오는것이 뒤로나오고 양수가 나오면 앞으로나옴
					//즉 이말은 사전식으로 나오게 리턴값을 준다는것이다 why? a는 유니코드가 61이고 b는 62이다 따라서 이 둘을 비교하면 -1이 나오는데 
					//그렇다면 02가 뒤에나온다는것이다.
				}
			}

			//따라서 길이가 짧은게 우선순위 , 그리고 길이가 길면 우선순위가 떨어지고 , 그것도 아니면 즉 길이가 같을경우 사전식

		});

//		for(int i=0; i<array.length; i++) {
//			System.out.println(array[i]);
//		}


		//조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
		for(int i=0; i<array.length; i++) {

			//if(array[i+1].equals(array[i])) continue; //이렇게 할경우 같으 단어가 여러개반복해서 입력할수 계속 Continue가 진행되어 결과값이 안나옴
			if(i>0&&array[i-1].equals(array[i])) continue; //따라서 이렇게 해주어야지 여러개가 반복입력하더라도 한개라도 나올수 있는것임

			System.out.println(array[i]);
		}
	}
}




//	public static void Merge(String[]array, int start, int middle , int end) {
//
//		int i = start;
//		int j = middle+1;
//		int k = start;
//
//		while(i>=middle&&j>end) {
//
//			if(sorted[i].length()>sorted[j].length()) {
//				sorted[k]=sorted[j];
//				j++;
//			}else if(sorted[i].length()==sorted[j].length()) {
//				
//				//사전순으로..까지 작성을 한다면 코드가 너무 길어질것 같은데.. 				
//			}else {
//				sorted[k]=sorted[i];
//				i++;
//			}
//			k++;
//
//
//		}
//
//		if(i>middle) {
//
//			for(int t=j; t<=sorted.length; t++) {
//				sorted[k]=sorted[t];
//			}
//
//		}else {
//
//			for(int t=i; t<=sorted.length; t++) {
//				sorted[k]=sorted[t];
//			}
//		}
//
//		for(int t=0; t<sorted.length; t++) {
//			array[t]=sorted[t];
//		}
//
//
//
//	}
//
//	//먼저 길이를 비교하고 , 길이가 같으면 사전순
//	public static void Merge_Sort(String[] array, int start, int end) {
//
//
//		while(start>end) {
//
//			int middle = (start+end)/2;
//			Merge_Sort(array, start, middle);
//			Merge_Sort(array, middle+1, end); 
//
//
//			Merge(array, start, middle, end);
//
//
//		}
//
//
//
//
//	}




