package min.edu;

public class Area_Calculation_Process {
	
	public void choice_Area (int choice) {
		AreaImpl cal =null;
		
		
		
		switch (choice) {
		case 1:
			AreaImpl cube = new Cube_Area();
			/*cube.setX(25.0);  
			cube.setY(2.0);
			
			cube.make();
			cube.print();*/
			
			
			break;
		
		case 2:
			
			
			AreaImpl triangle = new Triangle_Area();
			/*triangle.setX(25.0);
			triangle.setY(2.0);
			
			triangle.make();
			triangle.print();*/
			
			/*Triangle_Area triangle = new Triangle_Area();
			triangle.setX(25.0);
			triangle.setY(2.0);
			
			triangle.make();
			triangle.print();*/
			
			
			break;

		} //switch
		
		cal.setX(10.1);
		cal.setY(20.0);
		cal.make();
		cal.print();
		
	}

}
