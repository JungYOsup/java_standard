import java.util.Scanner;

public class Tileling_2133 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.println();
		
		
	}
	static int[] d = new int[1001];
	
	public static int Tile_ling(int x) {
		
		if(x==0) return 1;
		if(x==1) return 0;
		if(x==2) return 3;
		
		if(d[x] != 0) return d[x];
		
		int result = Tile_ling(x-2)*3;
		
		for(int i=3; i<=x; i++) {
			
			if(i%2==0) {
				result += 2*(Tile_ling(x-i));
			}
		}
		
		return d[x] = result;
		
	}
}

