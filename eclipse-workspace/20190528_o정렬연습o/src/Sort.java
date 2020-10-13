
// 가장 간단하지만 시간이 가장 오래걸리는 비효율적인 정렬방법으로 
// 시간복잡도는 O(n^2)이 걸린다.

public class Sort {

	static int [] array = {5,2,3,1,4};

	public static void main(String[] args) {

		//Bubble_Sort();
		//Selection_Sort();
		//Insert_Sort();

		Quick_Sort(array, 0, array.length-1);
		print();


	}

	public static void print() {

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		System.out.println();
	}

	public static void Bubble_Sort() {

		int i,j,temp;



		for(i=0; i<array.length; i++) {

			for(j=0; j<array.length-i-1; j++) {

				if(array[j]>array[j+1]) {
					temp = array[j+1];
					array[j+1] = array[j];
					array[j] = temp;
				}

			}

		}

		print();


	}

	public static void Selection_Sort() {

		int i,j,temp,min,index = 0;

		for(i=0; i<array.length; i++) {

			min = 9999;
			for(j=i; j<array.length; j++) {

				if(min>=array[j]) {
					min = array[j];
					index = j;
				}

			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
		}

		print();
	}

	public static void Insert_Sort() {

		int i,j,temp;

		for(i=0;i<array.length-1;i++) { //i = 3까지

			for(j=i; j>=0; j--) {

				if(array[j]>array[j+1]) {
					temp=array[j+1];
					array[j+1]=array[j];
					array[j]=temp;
				}
			}

		}

		print();
	}

	public static void Quick_Sort(int[] array , int start, int end) {


		int i = start+1;
		int key = start;
		int j = end;
		int temp =0;

		if(i>=j) {
			return;
		}

		while(i<j) {

			while(i<=end&&array[key]>array[i]) {
				i++;
			}

			while(j>=start&&array[key]<array[j]) {
				j--;
			}

			if(i<j) {

				temp = array[i];
				array[i]=array[j];
				array[j]=array[temp];
			}else {

				temp = array[key];
				array[key] = array[j];
				array[j]= temp;

			}

		}

		Quick_Sort(array, 0, i-1);
		Quick_Sort(array, j+1, end);



	}
}
