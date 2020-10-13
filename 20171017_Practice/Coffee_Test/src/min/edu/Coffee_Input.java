package min.edu;

public class Coffee_Input {


	public static void coffeemenu(int n) {



		if(n<300) {
			System.out.println("돈이 부족합니다.\n");
			Coffee_Scan.scan();

		}
		else {
			menu(n);
		}


	}

	{






	}

	public static void menu(int n) {
		int[] a = {300,800,1000,1200};

		for (int i = 0; i < a.length; i++) {

			if(n>=a[i]) {


				System.out.printf("1번 아메리카노: %d, 2번 라떄: %d , 3번 마끼: %d ,4번 우유 : %d \n",a[0],a[1],a[2],a[3]);
				Coffee_Scan.scan2();
			}

		}




	}

}
