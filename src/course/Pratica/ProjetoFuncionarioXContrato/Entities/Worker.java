package course.Pratica.ProjetoFuncionarioXContrato.Entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import course.Pratica.ProjetoFuncionarioXContrato.Entities.Enum.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel level;
	private Double baseSalary;

	// AGORA VAMOS COLOCAR AS RELAÇÕES = DEPARTMENT E CONTRACTS

	private Department departament; // AQUI MOSTRAMOS QUE UM TRABALHADOR POSSUI
									// UM DEPARTAMENTO!!!
	// AQUI MOSTRAMOS QUE UM TRABALHADOR POSSUI VARIOS CONTRATOS!!!
	private List<HourContract> contracts = new ArrayList<>(); // POR ISSO A
																// LISTA!!!
	// NAO ESQUECER DE INSTANCIAR A LISTA!!!

	public Worker() {

	}

	public Worker(String name, WorkerLevel level, Double baseSalary, Department departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
		// NAO INCLUIR O CONTEM MUITOS (LISTA) NO CONSTRUTOR!!!
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getLevel() {
		return level;
	}

	public void setLevel(WorkerLevel level) {
		this.level = level;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Department getDepartament() {
		return departament;
	}

	public void setDepartament(Department departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	// public void setContracts(List<HourContract> contracts) {
	// this.contracts = contracts;
	// } NAO PODEMOS TROCAR A LISTA!!!

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public Double income(int year, int month) {
		double sum = baseSalary;
		// É PRECISO VERIFICAR SE OS CONTRATOS SÃO DO ANO DIGITADO NOS PARAMETROS
		Calendar cal = Calendar.getInstance();
		for (HourContract c : contracts) {
			cal.setTime(c.getDate()); // DADA DO CAL RECEBE DATA DO CONTRATO
			int c_year = cal.get(Calendar.YEAR); // VARIÁVEL PARA COMPARAÇÃO
													// RECEBE ANO DO CONTRATO
													// (QUE ESTAVA NO C)
			int c_month = cal.get(Calendar.MONTH); // VARIÁVEL PARA COMPARAÇÃO
													// RECEBE MÊS DO CONTRATO
													// (QUE ESTAVA NO C)
			if (c_year == year && c_month == month) {
				sum += c.totalValue();
			}

		}

		return sum;

	}
}
