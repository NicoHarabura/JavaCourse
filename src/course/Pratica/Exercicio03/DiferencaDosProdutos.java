package course.Pratica.Exercicio03;

import java.util.Scanner;

//DIFERENCA = (A * B - C * D)

public class DiferencaDosProdutos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a, b, c, d;

		System.out.println("Digite os valores para A, B, C, D:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		int dif = a * b - c * d;

		System.out.println("DIFERENÇA = " + dif);

		sc.close();
	}
}
