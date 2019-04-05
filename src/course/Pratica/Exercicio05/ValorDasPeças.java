package course.Pratica.Exercicio05;

import java.util.Locale;
import java.util.Scanner;

public class ValorDasPeças {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int id;
		int quant;
		double price, total1, total2, total;

		System.out.println("Digite o código do produto 1, a quantidade e o preço unitário: ");

		id = sc.nextInt();
		quant = sc.nextInt();
		price = sc.nextDouble();

		total1 = quant * price;

		System.out.println("Digite o código do produto 2, a quantidade e o preço unitário: ");

		id = sc.nextInt();
		quant = sc.nextInt();
		price = sc.nextDouble();

		total2 = quant * price;

		total = total1 + total2;

		System.out.printf("TOTAL A PAGAR: R$ %.2f", total);

		sc.close();
	}
}
