package course.Teoria.ClassesEMetodos.Static;

public class Calculator {

	public static final double PI = 3.14;
	
	public static double circunference (double ratius){
		return 2 * PI * ratius;
	}
	
	public static double volume ( double ratius){
		return 4.0 * PI * Math.pow(ratius, 3) / 3;
	}
}
