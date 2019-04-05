package course.Teoria.Application2Exemplo;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Product produto;
		// produto = new Product();
		
		Product p = new Product();

		System.out.println("Digite os dados do produto: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.println("Preço: ");
		double price = sc.nextDouble();
		

		Product produto = new Product(name, price);
		
		System.out.println("Dados do Produto: \n" + produto.toString());
		// System.out.println(produto); TAMBEM FUNCIONA DEPOIS DE SOBREPOR O
		// toSTRING!!!
		
		produto.setName("Computador");
		System.out.println(produto.getName());
		
		

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
