package course.Teoria.ClassesEMetodos.Abstrata;

public class BusinessAccount extends Account{

	protected double limit;

	public BusinessAccount(String nome, Double saldo, double limit) {
		super(nome, saldo);
		this.limit = limit;
	}

	public BusinessAccount() {
		super();
	}

	public double getLimit() {
		return limit;
	}

		
}
