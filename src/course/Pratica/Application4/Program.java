package course.Pratica.Application4;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Funcion�rio funcionario = new Funcion�rio();
		
		System.out.println("Digite o nome do funcionario: ");
		funcionario.name = sc.nextLine();
		
		System.out.println("Digite o sal�rio bruto do funcion�rio: ");
		funcionario.grossSalary = sc.nextDouble();
		
		System.out.println("Digite o desconto no sal�rio: ");
		funcionario.tax = sc.nextDouble();
	
		System.out.println("Seu salario � : " + funcionario.netSalary());
		
		funcionario.increaseSalary(10.0);
		
		System.out.println("Seu salario � : " + funcionario.netSalary());

		sc.close();
		
		
		
	}
}
