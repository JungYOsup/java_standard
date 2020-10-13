import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;



//1.정렬 : 버블정렬 , 선택정렬, 삽입정렬 , 퀵정렬 , 병합정렬 //끝
//2.Heap , 계수정렬  // 끝
//3.Stack , 너비우선탐색, 깊이우선탐색, //이해 
//4.Union-Find, 크루스칼 알고리즘 , 이진트리의 구현과 순화 , Dynamic Programming

public class Practice {

	public static void main(String[] args) {

		//		int[] array = {3,2,1,5,4};
		//		int[] array2 = {5,4,2,7,6,1,3};
		//		int[] array3 = {7,4,2,5,3,1,9};
		//		int[] array4 = {8,2,3,1,4,5,6,9};
		//		int[] array5 = {5,4,2,1,3};
		//		int[] array6 = {7,6,8,3,5,9,10};
		//		int[] array7 = {5,4,3,2,1,1};

		//		Bubble_Sort(array);
		//		System.out.println();
		//		Selection_Sort(array2);
		//		System.out.println();
		//		Insert_Sort(array3);
		//		System.out.println();
		//		Quick_sort(array4, 0, array4.length-1);
		//
		//		for(int k : array4) {
		//			System.out.print(k);
		//		}
		//		System.out.println();
		//		Merge(array5, 0, array5.length-1);
		//		for(int k : array5) {
		//			System.out.print(k);
		//		}

		//		Heap_Sort(array6);
		//
		//		for(int k : array6) {
		//			System.out.print(k);
		//		}
		//		System.out.println();
		//
		//		Calculation_Sort(array7);


		//		int[] array8 = new int[11];
		//
		//		for(int i=1; i<=10; i++) { //1~8까지 들어가네 ~ 
		//			array8[i] = i; 
		//		}
		//
		//		System.out.println(Arrays.toString(array8));
		//
		//		UnionParent(array8, 1, 2);
		//		UnionParent(array8, 2, 3);
		//		UnionParent(array8, 3, 4);
		//		UnionParent(array8, 5, 6);
		//		UnionParent(array8, 6, 7);
		//		UnionParent(array8, 7, 8);
		//
		//
		//		System.out.println(FindParent(array8, 4, 5));
		//		System.out.println("부모는"+ array8[2]);
		//
		//		UnionParent(array8, 4,5);
		//
		//		System.out.println(FindParent(array8, 4, 5));

		ArrayList<Edge> v = new ArrayList<>();

		v.add(new Edge(1,7,12));
		v.add(new Edge(1,4,28));
		v.add(new Edge(1,2,67));
		v.add(new Edge(1,5,17));
		v.add(new Edge(2,4,24));
		v.add(new Edge(2,5,62));
		v.add(new Edge(3,5,20));
		v.add(new Edge(3,6,37));
		v.add(new Edge(4,7,13));
		v.add(new Edge(5,6,45));
		v.add(new Edge(5,7,73));

		Collections.sort(v, new Comparator<Edge>() {

			@Override
			public int compare(Edge arg0, Edge arg1) {

				if(arg0.value>arg1.value) {
					return 1;
				}else if(arg0.value<arg1.value) {
					return -1;
				}else {
					return 0;
				}
			}
		});

		for(Edge a : v) {
			System.out.println(a.value);
		}
		
		//3. 정렬된 순서에 맞게 그래프에 포함시킨다.
		
		
		int Num = 7;
		
		int[] parent = new int[Num+1];
		
		
		for(int i=1; i<parent.length; i++) {
			parent[i] = i;
		}
		
		int sum =0;
		
		for(int i=0; i<v.size(); i++) {
			//사이클인지 확인
			if(!FindParent(parent, v.get(i).node[0], v.get(i).node[1])){
				sum +=v.get(i).value;
				UnionParent(parent,  v.get(i).node[0], v.get(i).node[1]);
			}
		}
		System.out.println(sum);
		




	}

	public static void Bubble_Sort(int[] array) {

		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}


		for(int k : array) {
			System.out.print(k);
		}
	}

	public static void Selection_Sort(int[] array) {

		int min;
		int index=0;

		for(int i=0; i<array.length; i++) {
			min =9999;
			for(int j=i; j<array.length; j++)
				if(array[j]<min) {
					min = array[j];
					index = j;
				}

			int temp = array[i];
			array[i] = array[index];
			array[index] = temp;

		}

		for(int k : array) {
			System.out.print(k);
		}

	}

	//이미 정렬된 상태에서 좋은 정렬 기법 
	public static void Insert_Sort(int[] array) {


		for(int i=1; i<array.length; i++) {

			for(int j=i; j>0; j--) {

				if(array[j]<array[j-1]) {
					int temp = array[j];
					array[j] = array[j-1];
					array[j-1] = temp;
				}
			}
		}

		for(int k : array) {
			System.out.print(k);
		}


	}
	public static void Quick_sort(int[] array,int start , int end) {



		int pivot = start;
		int i = start+1;
		int j = end;

		if(i>j) {
			return;
		}

		while(i<=j) {

			while(i<j&&array[pivot]>array[i]) {
				i++;
			}
			while(j>=0&&array[pivot]<array[j]) {
				j--;
			}

			if(i<j) {

				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

			}else {

				int temp = array[pivot];
				array[pivot] = array[j];
				array[j] = temp;

			}

			Quick_sort(array, 0, j-1);
			Quick_sort(array, j+1, end);

		}


	}

	static int num = 100;
	static int[] sorted= new int[num];

	public static void Merge(int[] array,int start , int end) {


		if(start<end) {

			int middle = (start+end)/2;

			Merge(array, start, middle);
			Merge(array, middle+1, end);

			Merge_Sort(array,start,middle,end);
		}




	}

	public static void Merge_Sort(int[] array, int start ,int middle, int end) {

		int i = start;
		int j = middle+1;
		int k = start;

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

		if(i>middle) {
			for(int t=j; t<=end; t++) {
				sorted[k] = array[t];
				k++;
			}
		}else{
			for(int t=i; t<=middle; t++) {
				sorted[k] = array[t];
				k++;
			}
		}


		for(int t=0; t<=end; t++) {
			array[t] = sorted[t];
		}


	}

	public static void Heap_Sort(int[] array) {


		//Heap 알고리즘 
		for(int i=1; i<array.length; i++) {

			int c = i;
			do {

				int root = (c-1)/2;
				if(array[root]<array[c]) {
					int temp = array[root];
					array[root] = array[c];
					array[c] = temp;
				}
				c = root;

			}while(c!=0);

		}


		//Heap 

		for(int i=array.length-1; i>=0; i--) {

			int temp = array[i];
			array[i] = array[0];
			array[0] = temp;

			int root = 0;
			int c = 1;

			do {
				c=root*2+1;

				if(c<i-1&&array[c]<array[c+1]) {
					c++;
				}

				if(c<i&&array[root]<array[c]) {
					int temp2 = array[c];
					array[c] = array[root];
					array[root] = temp2;
				}

				root = c;

			}while(c<i);

		}


	}

	public static void Calculation_Sort(int[] array) {

		int[] cal_sort = new int[5];

		for(int i=0; i<cal_sort.length; i++) {
			cal_sort[i]=0;
		}

		for(int i=0; i<array.length; i++) {
			cal_sort[array[i]-1]++;
		}

		System.out.println(Arrays.toString(cal_sort));


		for(int i=0; i<cal_sort.length; i++) {

			for(int j=0; j<cal_sort[i]; j++) {
				System.out.print(i+1);
			}

		}
	}

	public static int getParent(int[] array , int x) {

		if(array[x] == x) return x;
		return array[x] = getParent(array, array[x]);
	}

	public static void UnionParent(int[] array, int x , int y) {

		x = getParent(array, x);
		y = getParent(array, y);

		if(x<y) array[y] = x;
		else array[x] =y ;


	}

	public static boolean FindParent(int[] array, int x , int y) {

		x = getParent(array, x);
		y = getParent(array, y);

		if(x==y) return true;
		return false;
	}

	public static int Fibonacci(int x) {
		if(x==1) return 1;
		if(x==2) return 1;
		
		return Fibonacci(x-1) + Fibonacci(x-2);
	}
	
	static int num2 =100;
	static int d[] = new int[num2];
	
	public static int Dynamic_Fibonacci(int x) {
		
		if(x==1) return 1;
		if(x==2) return 1;
		
		if(d[x]!=0) return d[x];
		return d[x] = Fibonacci(x-1) + Fibonacci(x-2);
		
		
		
	}

	

}

class Node{
	
	Node left;
	Object object; 
	Node right;
	
	public Node(Node left , Object object , Node right) {
		this.left = left;
		this.object = object;
		this.right = right;
		
	}
}

class Tree{
	
	Node root;
	
	public Tree() {
		root = null;
		
	}
	public Node getRoot() {
		return root;
	}
	public void setRoot() {
		this.root = root;
	}
	
	public Node makeTree(Node left , Object object , Node right) {
		
		Node newNode = new Node(left,object,right);
		
		return newNode;
	}
	
	
	
}
