package course.Teoria.ClassesEMetodos.Abstrata;

public class SavingsAccount extends Account {

	protected Double earnings;

	public SavingsAccount(String nome, Double saldo, Double earnings) {
		super(nome, saldo);
		this.earnings = earnings;
	}

	public SavingsAccount() {
		super();
	}

	public void earningsTotal(double percentage) {
		earnings = saldo * percentage / 100;
		saldo += earnings;
	}

	public Double getEarnings() {
		return earnings;
	}

}
