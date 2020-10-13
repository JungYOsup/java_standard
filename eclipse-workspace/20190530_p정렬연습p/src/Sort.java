
public class Sort {

	static int number = 10;
	static int[] sorted = new int[number];

	public static void main(String[] args) {
		int[] array = {4,3,2,1,5};
//		BubbleSort();
//		System.out.println();
//		SelectionSort();
//		System.out.println();
//		InsertSort();
//		System.out.println();
//		QuickSort(array, 0, array.length-1);
//
//		for(int i=0; i<array.length; i++) {
//			System.out.print(array[i]);
//		}
//		System.out.println();
		
		MergeSort(array, 0, array.length-1);
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		
		
	}
	public static void BubbleSort() {

		int[] array = {4,3,2,1,5};

		int i,j,temp;

		for(i=0; i<array.length; i++) {
			for(j=0; j<array.length-1-i; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		for(int t=0; t<array.length;t++) {
			System.out.print(array[t]);
		}


	}

	public static void SelectionSort() {

		int[] array = {4,3,2,1,5};
		int i,j,temp,min,index=0;

		for(i=0; i<array.length; i++) {

			min = 9999;

			for(j=i; j<array.length; j++) {

				if(min>array[j]) {
					min = array[j];
					index = j;
				}
			}

			temp = array[i];
			array[i]=array[index];
			array[index]=temp;

		}

		for(int t=0; t<array.length;t++) {
			System.out.print(array[t]);
		}

	}

	public static void InsertSort() {
		int[] array = {4,3,2,1,5};
		int i,j,temp;

		for(i=0; i<array.length-1; i++) {

			for(j=i; j>=0; j--) {

				if(array[j]>array[j+1]) {
					temp =array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}

		}
		for(int t=0; t<array.length;t++) {
			System.out.print(array[t]);
		}

	}

	public static void QuickSort(int[] array, int start, int end) {

		int i=start+1;
		int key=start;
		int j=end;
		int temp=0;


		if(start>=end) {
			return;
		}

		while(i<=j) {

			while(i<=end && array[key]>=array[i]) {
				i++;
			}
			while(j>start && array[key]<=array[j]) {
				j--;
			}

			if(i<j) {

				temp =array[i];
				array[i]=array[j];
				array[j]=temp;
			}else {
				temp = array[j];
				array[j]=array[key];
				array[key]=temp;

			}


		}

		QuickSort(array, start, j);
		QuickSort(array, j+1, end);


	}


	public static void Merge(int[]array, int start,int middle, int end) {

		int i=start;
		int j=middle+1;
		int k=start;



		while(i<=middle&&j<=end) {

			if(array[i]<=array[j]) {
				sorted[k]=array[i];
				i++;
			}else {
				sorted[k]=array[j];
				j++;

			}
			k++;
		}	
		if(i<middle) {
			for(int t =i; t<=middle; t++) {
				sorted[k]=array[t];
				k++;
			}
		}else {
			for(int t =j; t<=end; t++) {
				sorted[k]=array[t];
				k++;
			}
		}


		for(int t=0; t<=end; t++) {
			array[t]=sorted[t];
		}








	}
	public static void MergeSort(int[]array, int start, int end) {

		int i = start;
		int j = end;

		while(i<j) {

			int middle = (i+j)/2;

			MergeSort(array, i, middle);
			MergeSort(array, middle+1,j);

			Merge(array, start, middle, end);
		}



	}




	public static void HeapSort(int[] array) {
		
		//Heap 알고리즘 정렬
		for(int i=1; i<array.length; i++) {
			
			int c =i;
			
			do {
				int root = (c-1)/2;
				if(array[root]<array[c]) {
					int temp = array[root];
					array[root]=array[c];
					array[c]=temp;
				}
				c=root;
				
			}while(c!=0);
			
		}
		

		for(int i=array.length-1; i>=0; i--) {

			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;
			
			int root=0;
			int c=1;
			
			do {
				c=2*root+1;
				
				if(c<i-1&&array[c]<array[c+1]) {
					c++;
				}
				
				if(c<i&&array[root]<array[c]) {
					int temp2= array[root];
					array[root]=array[c];
					array[c]=temp2;
				}
				root=c;
				
				
			}while(c<i);
			
		}
		
		
		
		
		
		


	}





}
