package course.Pratica.Exercicio04;

import java.util.Locale;
import java.util.Scanner;

public class SalarioFuncionario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero do funcionário, quantas horas ele trabalhou e o valor recebido por hora: ");
		int id = sc.nextInt();
		double hours = sc.nextDouble();
		double sal = sc.nextDouble();

		System.out.println("NUMBER = " + id);
		double salario = hours * sal;
		System.out.printf("SALARY = %.2f", salario);

		sc.close();
	}
}
