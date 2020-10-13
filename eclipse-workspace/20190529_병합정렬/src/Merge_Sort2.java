
public class Merge_Sort2 {
	
	
	static int number = 8;
	static int fake_array[] = new int[number];
	
	public static void main(String[] args) {
		
		int[] array= {4,5,3,2,1,6,7,8};
		
		Merge_Sort(array, 0, array.length-1);
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
		
	}
	
	public static void Merge(int[] array, int m, int middle, int n) {
		int i =m;
		int j =middle+1;
		int k =m;
		
		while(i<=middle&&j<=n) {
			if(array[i]<array[j]) {
				fake_array[k]=array[i];
				i++;
			}else {
				fake_array[k]=array[j];
				j++;
			}
			k++;
		}
		
		if(i>middle) {
			for(int t =j; t<=n; t++) {
				fake_array[k]=array[t];
				k++;
			}
		}else {
			for(int t =i; t<=n; t++) {
				fake_array[k]=array[t];
				k++;
			}
		}
		
		
		for(int t =0; t<=n; t++) {
			array[t] = fake_array[t];
		}
		
		
	}
	
	public static void Merge_Sort(int[] array, int m , int n) {
		
		if(m<n) {
			int middle = (m+n)/2;
			Merge_Sort(array, m, middle); //우선적으로 하나씩으로 나눈다.
			Merge_Sort(array, middle+1,n); //우선적으로 하나씩으로 나눈다.
			
			Merge(array,m,middle,n);// 마지막으로 합친다.
					
		}
		
	}

}
