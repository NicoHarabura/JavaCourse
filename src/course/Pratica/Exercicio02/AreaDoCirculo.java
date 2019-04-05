package course.Pratica.Exercicio02;

import java.util.Locale;
import java.util.Scanner;

//area = pi . raio2
//Considere o valor de pi = 3.14159

public class AreaDoCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o valor do raio:");
		double raio = sc.nextDouble();

		double pi = 3.14159;

		double area = pi * Math.pow(raio, 2);

		System.out.printf("A = %.4f", area);

		sc.close();
	}
}
