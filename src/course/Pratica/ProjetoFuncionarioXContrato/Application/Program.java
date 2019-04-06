package course.Pratica.ProjetoFuncionarioXContrato.Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import course.Pratica.ProjetoFuncionarioXContrato.Entities.Department;
import course.Pratica.ProjetoFuncionarioXContrato.Entities.HourContract;
import course.Pratica.ProjetoFuncionarioXContrato.Entities.Worker;
import course.Pratica.ProjetoFuncionarioXContrato.Entities.Enum.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		// CRIAR FORMATAÇÂO DE DATA PARA O CONTRATO
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		// INSTANCIANDO TRABALHADOR -------------------------
		System.out.println("Digite os dados do funcionario");
		System.out.println("Departamento: ");
		String workerDepartment = sc.nextLine();
		System.out.println("Nome: ");
		String workerName = sc.nextLine();
		System.out.println("Nivel (JUNIOR, MID_LEVEL, SENIOR): ");
		String workerLevel = sc.nextLine();
		System.out.println("Salario base: ");
		Double workerSalary = sc.nextDouble();

		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary,
				new Department(workerDepartment));
		// ---------------------------------------------------

		// ADICIONANDO OS CONTRATOS

		System.out.println("Digite quantos contratos serão adicionados:");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite as informações do contrato # " + (i+1) + ": ");
			System.out.println("Data de criação (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(sc.next());
			System.out.println("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.println("Quantidade de horas: ");
			int hours = sc.nextInt();
			// COM ESSES DADOS PODEMOS INSTANCIAR O CONTRATO
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			// ADICIONAR CONTRATO A LISTA (ASSOCIANDO ELE ASSIM, AO FUNCIONARIO)
			worker.addContract(contract);
		}

		System.out.println("Digite o mes e ano para calcular o salario total (MM/YYYY):");
		String monthAndYear = sc.next();
		// RECORTANDO STRING
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		int year = Integer.parseInt(monthAndYear.substring(3));

		System.out.println("Dados do funcionário -");
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: " + worker.getDepartament());
		System.out.println("Nivel: " + worker.getLevel());
		System.out.println("Renda  para " + monthAndYear + " é de R$" + String.format("%.2f", worker.income(year, month)));

		sc.close();
	}
}
