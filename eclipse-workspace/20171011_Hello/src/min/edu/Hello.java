package min.edu;


public class Hello {
	public static void main(String[] args) {

		int[] inputArray = {5, 3, 6, 7, 9};


		System.out.println(avoidObstacles(inputArray));

	}

	public static int avoidObstacles(int[] inputArray) {

		int minimum = 0;
		int count=0;
		for(int j=2; j<41; j++) {
			for(int i=0; i<inputArray.length; i++) {

				if(inputArray[i]<j) {
					count++;
					continue;
				}else {
					
					if(inputArray[i]%j==0) {
						count=0;
						break;
					}else {
						count++;
					}
				
				}
										
			}
			if(count==inputArray.length) {
				minimum=j;
				break;
			}
		}

		return minimum;
	}





}


















