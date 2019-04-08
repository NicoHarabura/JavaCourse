package course.Teoria.HerançaEPolimorfismo.ExemploConta.Entities;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); // PUXA O CONSTRUTOR DA CLASSE MÃE
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double value) {
		if (value <= loanLimit) {
			balance += value - 10;
		}
	}

	@Override
	public void withdrawn(double value) {
		super.withdrawn(value);
		balance -= 2.0;
	}
}
