package course.Pratica.Application1ComPOO.Entities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Triangle x, y;
		x = new Triangle();
		y = new Triangle();

		System.out.println("Digite os lados do triangulo X: ");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		System.out.println("Digite os lados do triangulo Y: ");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();

		double areaX = x.calcularArea();
		double areaY = y.calcularArea();

		System.out.printf("Area do triangulo X �: %.2f", areaX);
		System.out.printf("%nArea do triangulo Y �: %.2f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O maior triangulo � o X");
		} else {
			System.out.println("O maior triangulo � o Y");
		}
	}
}
