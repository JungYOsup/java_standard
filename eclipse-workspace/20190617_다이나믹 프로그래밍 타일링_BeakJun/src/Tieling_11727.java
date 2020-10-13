//문제
//
//2×n 직사각형을 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
//
//아래 그림은 2×17 직사각형을 채운 한가지 예이다.
//
//입력
// 
//
//첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
//
//
//
//
//
//출력 
//
//
//첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.



import java.util.Scanner;

public class Tieling_11727 {
	
	static int[] array = new int[1001];
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println(Tile_ling(x));
		
		
	}
	
	public static int Tile_ling(int x) {
		
		if(x==1) return 1;
		if(x==2) return 2;
		
		if(array[x] != 0 ) return array[x];
		return array[x] = (Tile_ling(x-1) + 2*Tile_ling(x-2)) % 10007;
		
	}
}
