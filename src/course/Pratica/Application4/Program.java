package course.Pratica.Application4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcionário funcionario = new Funcionário();
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Digite o salário bruto do funcionário: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Digite o desconto no salário: ");
		funcionario.tax = sc.nextDouble();
	
		System.out.println("Seu salario é : " + funcionario.netSalary());
		
		funcionario.increaseSalary(10.0);
		
		System.out.println("Seu salario é : " + funcionario.netSalary());

		sc.close();
		
		
		
	}
}
