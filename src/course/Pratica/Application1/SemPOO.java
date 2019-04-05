package course.Pratica.Application1;

import java.util.Scanner;

public class SemPOO {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os lados do triangulo X: ");
		double xX = sc.nextDouble();
		double yX = sc.nextDouble();
		double zX = sc.nextDouble();
		System.out.println("Digite os lados do triangulo Y: ");
		double xY = sc.nextDouble();
		double yY = sc.nextDouble();
		double zY = sc.nextDouble();

		double p = (xX + yX + zX) / 2.0;
		double areaX = Math.sqrt(p * (p - xX) * (p - yX) * (p - zX));

		p = (xY + yY + zY) / 2.0;
		double areaY = Math.sqrt(p * (p - xY) * (p - yY) * (p - zY));

		System.out.printf("Area do triangulo X �: %.2f", areaX);
		System.out.printf("%nArea do triangulo Y �: %.2f%n", areaY);

		if (areaX > areaY) {
			System.out.println("O maior triangulo � o X");
		} else {
			System.out.println("O maior triangulo � o Y");
		}
	}
}
