package course.Pratica.Exercicio01;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {

		int a, b;

		System.out.println("Entrada:");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();

		int soma = a + b;

		System.out.println("Saída:%n Soma = " + soma);

		sc.close();
	}
}
