package course.Pratica.Application5;

public class Estudante {

	String name;
	double n1, n2, n3, soma;

	public double somar() {

		return soma = n1 + n2 + n3;

	}

	public String aprovarReprovar() {
		if (soma < 60) {
			double dif = 60 - soma;
			return "Reprovado\n" + "Faltam: " + dif + " pontos.";			
		} else {
			return "Aprovado";
		}
	}
}
