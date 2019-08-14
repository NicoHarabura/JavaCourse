package course.Teoria.defaultMethods.application;

import java.util.Scanner;

import course.Teoria.defaultMethods.services.ServicoTaxa;
import course.Teoria.defaultMethods.services.ServicoTaxaEUA;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor e quantos meses para pagar: ");
		double valor = sc.nextDouble();
		int meses = sc.nextInt();

		ServicoTaxa stb = new ServicoTaxaEUA(1.0);
		double pagamento = stb.pagamento(valor, meses);

		System.out.println("Após " + meses + " meses, será pago: ");
		System.out.println(String.format("%.2f", pagamento));

		sc.close();

	}

}
