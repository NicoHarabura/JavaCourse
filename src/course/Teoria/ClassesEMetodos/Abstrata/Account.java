package course.Teoria.ClassesEMetodos.Abstrata;

public abstract class Account {

	protected String nome;
	protected Double saldo;

	public Account() {

	}

	public Account(String nome, Double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void deposit(double value) {
		saldo += value;
	}

	public void withdraw(double value) {
		saldo -= value;
	}

}
