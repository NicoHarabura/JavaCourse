package course.Pratica.Application9ListaFuncionários;

public class Funcionario {

	private Integer id;
	private String name;
	private Double salary;

	public Funcionario(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary(Double salary) {
		return salary;
	}

	public void aumentarSalario(Double percentage) {
		salary += salary * percentage / 100.0;
	}

	public String toString() {
		return 	"-----------------------------------------"
				+ "\nID: " + id 
				+ "\nName: " + name
				+ "\nSalary: R$" + String.format("%.2f", salary);
	}
}
