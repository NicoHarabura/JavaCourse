package course.Teoria.generics.application;

import java.util.Scanner;

import course.Teoria.generics.services.ServicoImpressao;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade: ");
		int n = sc.nextInt();
		System.out.println("Agora digite os elementos: ");
		ServicoImpressao<Integer> si = new ServicoImpressao<Integer>();
		for (int i = 0; i < n; i++) {
			si.addValor(sc.nextInt());
		}

		Integer x = si.primeiro();
		
		System.out.println();
		System.out.println(si.primeiro());
		System.out.println();
		si.imprimir();

		sc.close();

	}

}
