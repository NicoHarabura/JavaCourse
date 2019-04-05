package course.Pratica.Application6;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o preço do dolar e a quantidade que deseja comprar: ");
		System.out.printf("%.2f", CurrencyConventer.Converter(sc.nextDouble(), sc.nextDouble()));
		
		sc.close();
	}
}
