package course.Teoria.Array.ComProdutos;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos produtos serão adicionados?");
		int n = sc.nextInt();

		Produto[] vet = new Produto[n];

		double sum = 0;
		for (int i = 0; i < vet.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do produto: ");
			String name = sc.nextLine();
			System.out.println("Digite o preço do produto: ");
			double price = sc.nextDouble();
			vet[i] = new Produto(name, price);
			sum += vet[i].getPrice();
		}

		System.out.printf("O total é : R$%.2f", sum);

		sc.close();
	}
}
