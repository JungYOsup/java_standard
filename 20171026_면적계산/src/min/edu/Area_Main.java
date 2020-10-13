package min.edu;

import java.util.Scanner;

public class Area_Main {
	
	public static void main(String[] args) {
		
		
		String chk ="";
		Area_Calculation_Process process = new Area_Calculation_Process();
		
		do {
			System.out.println("필요한 계산 면적을 선택하세요");
			System.out.println("1번 사각형 2. 삼각형");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			process.choice_Area(n);
			System.out.println("다른 면적도 계산 하시겠습니까?");
			
			chk = scan.next().toUpperCase(); // 입력한 스트링을 입력받음 , (nextline은 문자열 사이의 공백까지 가져옴) but next는 공백이 나오면 잘라버림 
			
			
			
		} while (chk.compareToIgnoreCase("Y")==0);
		
		
		
		
		
		
		
		
		
		/*Cube_Area cube = new Cube_Area();
		Triangle_Area triangle = new Triangle_Area();
		triangle.setX(25.0);
		triangle.setY(2.0);
		
		triangle.make();
		triangle.print();
		
		cube.setX(25.0);
		cube.setY(2.0);
		
		cube.make();
		cube.print();*/
	}

}
