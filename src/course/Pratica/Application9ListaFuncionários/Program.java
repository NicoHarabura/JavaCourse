package course.Pratica.Application9ListaFuncionários;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos funcionarios serão cadastrados?");
		int n = sc.nextInt();

		List<Funcionario> list = new ArrayList<>();

		System.out.println("-----------------------------------------");
		for (int i = 0; i < n; i++) {

			System.out.println("Digite o id do funcionario: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.println("Digite o nome do funcionario: ");
			String name = sc.nextLine();
			System.out.println("Digite o salario desse funcionaro: R$");
			Double salary = sc.nextDouble();

			list.add(new Funcionario(id, name, salary));
			System.out.println("-----------------------------------------");
		}

		for (Funcionario x : list) {
			System.out.println(x.toString());
		}
		System.out.println("-----------------------------------------");

		System.out.println("Digite o id do funcionario que receberá o aumento: ");
		Integer idSearch = sc.nextInt();
		

		System.out.println("-----------------------------------------");

		Funcionario emp = list.stream().filter(x -> x.getId() == idSearch).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse funcionário não existe!");
		} else {
			System.out.println("Digite a porcentegem desse aumento: ");
			Double percentage = sc.nextDouble();
			emp.aumentarSalario(percentage);
		}

		for (Funcionario x : list) {
			System.out.println(x.toString());
		}
		System.out.println("-----------------------------------------");

		sc.close();
	}
}
