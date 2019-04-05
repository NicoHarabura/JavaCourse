package course.Pratica.ExercicioCondicional05;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int id = sc.nextInt();
		int quant = sc.nextInt();
		double total;
		if (id == 1) {
			total = quant * 4.0;
		} else if (id == 2) {
			total = quant * 4.5;
		} else if (id == 3) {
			total = quant * 5.0;
		} else if (id == 4) {
			total = quant * 2.0;
		} else {
			total = quant * 1.50;
		}

		System.out.printf("Total: R$ %.2f", total);

		sc.close();
	}
}
