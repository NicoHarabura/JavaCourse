package course.Pratica.Application7Banco;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Você deseja criar uma conta com um deposito inicial: s/n ?");

		char resposta = sc.next().charAt(0);

		System.out.println("Digite o número da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular da conta: ");
		String nome = sc.nextLine();

		Conta account = new Conta(numConta, nome, 0);

		if (resposta == 's') {
			System.out.println("Digite o valor do depósito: R$ ");
			double valor = sc.nextDouble();
			account.depositar(valor);
		}

		System.out.println("Informações da conta:\n" + account.toString());

		account.depositar(200);
		System.out.println("Informações da conta:\n" + account.toString());

		account.sacar(500);
		System.out.println("Informações da conta:\n" + account.toString());

		account.setNome("Nicolau Harabura Girio");
		
		sc.close();

	}
}
