
public class Selection_Sort {
	public static void main(String[] args) {
		
		Selection_Sort();
	}
	
	public static void Selection_Sort() {
		
		int i, j, temp, min,index = 0;
		int [] array = {1,2,5,8,7,6,4,3,9,10};
		
		for(i=0; i<array.length; i++) {
			
			min = 9999;
			
			for(j=i; j<array.length; j++) {
				
				if(min>array[j]) {
					min=array[j];
					index = j;
				}
								
			}
			temp = array[i];
			array[i] = array[index];
			array[index] = temp;
					
		}		
		for(i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
