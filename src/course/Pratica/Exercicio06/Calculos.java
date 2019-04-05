package course.Pratica.Exercicio06;

import java.util.Locale;
import java.util.Scanner;

public class Calculos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double a, b, c;
		double pi = 3.14159;

		System.out.println("Digite três valores: ");

		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double areaT = a * c / 2;
		double areaC = pi * Math.pow(c, 2);
		double areaTr = ((a + b) * c) / 2;
		double areaQ = Math.pow(b, 2);
		double areaR = a * b;

		System.out.printf("TRIANGULO: %.3f", areaT);
		System.out.printf("%nCIRCULO: %.3f", areaC);
		System.out.printf("%nTRAPEZIO: %.3f", areaTr);
		System.out.printf("%nQUADRADO: %.3f", areaQ);
		System.out.printf("%nRETANGULO: %.3f", areaR);

		sc.close();
	}
}
