package Coding_Test;


public class Test1 {

	public static void main(String[] args) {

		int arr[] = {1,1,3,3,0,8,8,1,1};
		
		
		int result[] = solution(arr);
		
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
			
		}

		


	}

	public static int[] solution(int[] arr) {

		int[] answer2 = new int[arr.length];
		
		int index = 0;
		int check = 0;
		
		int init = arr[0];
		answer2[index] = init;

		for(int i=0; i<arr.length-1; i++) {

			if(arr[i]!=arr[i+1]) {
				answer2[++index] = arr[i+1];
				check++;
			}

		}
		
		int[] answer = new int[check+1];
		
		for(int i=0; i<check+1; i++) {
			
			answer[i] = answer2[i];
		}
		
		
		
		
		return answer;

	}

}
