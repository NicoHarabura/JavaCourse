package course.Pratica.Application7Banco;

public class Conta {

	private int numConta;
	private String nome;
	private double saldo;

	public Conta(int numConta, String nome, double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		this.saldo = saldo;
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

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor - 5;
	}

	public String toString() {
		return "Numero da conta: "
				+ numConta
				+ "\nNome do titular: "
				+ nome
				+ "\nSaldo atual: R$"
				+ String.format("%.2f", saldo);
	}

}
