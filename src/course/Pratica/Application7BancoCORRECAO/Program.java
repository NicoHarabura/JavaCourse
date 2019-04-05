package course.Pratica.Application7BancoCORRECAO;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Conta account;

		System.out.println("Digite o numero da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome do titular da conta: ");
		String nome = sc.nextLine();
		System.out.println("Gostaria de realizar um deposito inicial?\ns/n ?");
		char op = sc.next().charAt(0);
		
		if (op == 's'){
			System.out.println("Digite o valor do deposito: ");
			double value = sc.nextDouble();
			account = new Conta(numConta, nome, value);
		} else {
			account = new Conta(numConta, nome);
		}
		System.out.println(account.toString());
		
		System.out.println("Digite o valor que deseja depositar: ");
		account.depositar(sc.nextDouble());
		System.out.println("\n"+account.toString());
		
		System.out.println("Digite o valor que deseja sacar: ");
		account.sacar(sc.nextDouble());
		System.out.println("\n"+account.toString());
		
		
		sc.close();
	}
}
