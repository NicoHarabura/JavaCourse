package course.Pratica.Application2;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Product produto;
		// produto = new Product();

		Product produto = new Product();

		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		produto.name = sc.nextLine();
		System.out.println("Preço: ");
		produto.price = sc.nextDouble();
		System.out.print("Quantidade em estoque: ");
		produto.quantity = sc.nextInt();

		System.out.println("Dados do Produto: \n" + produto.toString());
		// System.out.println(produto); TAMBEM FUNCIONA DEPOIS DE SOBREPOR O
		// toSTRING!!!

		System.out.println();
		System.out.print("Digite quantos produtos vai adicionar: ");
		produto.addProduct(sc.nextInt());

		System.out.println("Dados atualizados: \n" + produto.toString());

		System.out.println();
		System.out.println("Digite agora a quantidade que será removida: ");
		produto.removeProduct(sc.nextInt());

		System.out.println("Dados atualizados: \n" + produto.toString());

		sc.close();

	}
}
