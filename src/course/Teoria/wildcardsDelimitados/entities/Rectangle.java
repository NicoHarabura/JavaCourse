package course.Teoria.wildcardsDelimitados.entities;

public class Rectangle implements Shape{

	private double height;
	private double width;
	
	public Rectangle(double height, double width) {
		super();
		this.height = height;
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return width;
	}

	public void setWeight(double weight) {
		this.width = weight;
	}
	
	@Override
	public double area() {
		return height*width;
	}
	
}
