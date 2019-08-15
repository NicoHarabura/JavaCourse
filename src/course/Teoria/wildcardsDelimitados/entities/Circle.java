package course.Teoria.wildcardsDelimitados.entities;

public class Circle implements Shape {

	private double ratius;

	public Circle(double ratius) {
		this.ratius = ratius;
	}

	public double getRatius() {
		return ratius;
	}

	public void setRatius(double ratius) {
		this.ratius = ratius;
	}

	@Override
	public double area() {
		return Math.PI*Math.pow(ratius, 2);
	}

}
