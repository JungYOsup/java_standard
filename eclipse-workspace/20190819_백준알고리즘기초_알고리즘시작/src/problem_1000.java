import java.util.Scanner;

//1. 두 정수 A와 B를 입력받은 다음 A+B를  출력
//Error
//전자 - Runtime Error
//후자 - Success

public class problem_1000 {

	
//	public static void main(String[] args) throws IOException {
//
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//		int a = Integer.parseInt(br.readLine());
//
//		int b = Integer.parseInt(br.readLine());
//	
//		bw.write(a+b+"\n");
//		
//		bw.flush();
//		bw.close();
//		
//		
//		
//		
//	}
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println(a+b);
		
		
	}

}
