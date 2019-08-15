package course.Teoria.wildcardsDelimitados.application;

import java.util.ArrayList;
import java.util.List;

import course.Teoria.wildcardsDelimitados.entities.Circle;
import course.Teoria.wildcardsDelimitados.entities.Rectangle;
import course.Teoria.wildcardsDelimitados.entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> minhasShapes = new ArrayList<>();

		minhasShapes.add(new Circle(2.0));
		minhasShapes.add(new Rectangle(2.0, 2.0));

		System.out.println("Total de areas: " + String.format("%.2f", totalAreas(minhasShapes)));

		List<Circle> meusCirculos = new ArrayList<>();
		meusCirculos.add(new Circle(3));
		meusCirculos.add(new Circle(2));
		
		System.out.println("Total de areas: " + String.format("%.2f", totalAreas(meusCirculos)));

	}

	public static double totalAreas(List<? extends Shape> list) {
		double sum = 0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
