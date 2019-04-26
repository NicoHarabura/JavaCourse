package course.Pratica.Application11CalcImposto.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import course.Pratica.Application11CalcImposto.entities.Contribuinte;
import course.Pratica.Application11CalcImposto.entities.PessoaFisica;
import course.Pratica.Application11CalcImposto.entities.PessoaJuridica;

public class Program {

	public static List<Contribuinte> contribuintes = new ArrayList<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos contribuintes serão adicionados?");
		int n = sc.nextInt();
		System.out.println("DIGITE OS DADOS---");
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Pessoa Física ou Juridica?\nf/j?");
			sc.nextLine();
			char op = sc.nextLine().charAt(0);
			System.out.println("Nome: ");
			String nome = sc.nextLine();
			System.out.println("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			if (op == 'f'){
			System.out.println("Gastos com Saúde: ");
			double gastoSaude = sc.nextDouble();
			contribuintes.add(new PessoaFisica(nome, rendaAnual, gastoSaude));
			} else {
				System.out.println("Numero de funcionários: ");
				int numFunc = sc.nextInt();
				contribuintes.add( new PessoaJuridica(nome, rendaAnual, numFunc));
			}
		}
		System.out.println("TAXA INDIVIDUAL");
		for (Contribuinte c : contribuintes){
			System.out.println(c.getNome()+": R$"+c.calcImposto());
		}
		System.out.println();
		System.out.println("TOTAL ARRECADADO");
		double sum = 0;
		for (Contribuinte c : contribuintes){
			sum += c.calcImposto();
		}
		System.out.println(sum);
		

		sc.close();
	}
}
