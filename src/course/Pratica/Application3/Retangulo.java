package course.Pratica.Application3;

public class Retangulo {

	double width;
	double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return (width + height)*2;
	}

	public double diagonal() {
		return Math.hypot(width, height);
	}

}
