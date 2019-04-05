package course.Teoria.ClassesEMetodos.SemSerStatic;

public class Calculator {

	public final double PI = 3.14;

	public double circunference(double ratius) {
		return 2.0 * PI * ratius;
	}

	public double volume(double ratius) {
		return 4.0 * PI * Math.pow(ratius, 3) / 3;
	}
}
