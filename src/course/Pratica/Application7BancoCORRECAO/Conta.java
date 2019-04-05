package course.Pratica.Application7BancoCORRECAO;

public class Conta {

	int numConta;
	String nome;
	double saldo;

	public Conta(int numConta, String nome, double value) {
		super();
		this.numConta = numConta;
		this.nome = nome;
		depositar(value);
	}

	public Conta(int numConta, String nome) {
		super();
		this.numConta = numConta;
		this.nome = nome;
	}

	public int getNumConta() {
		return numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void depositar (double value){
		saldo += value;
	}
	
	public void sacar (double value){
		saldo -= value + 5;
	}
	
	public String toString (){
		return "Numero da conta: "
				+ numConta
				+ "\nNome do titular: "
				+ nome
				+ "\nSaldo atual: R$"
				+ String.format("%.2f", saldo);
	}

}
