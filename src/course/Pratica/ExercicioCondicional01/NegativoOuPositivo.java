package course.Pratica.ExercicioCondicional01;

import java.util.Scanner;

public class NegativoOuPositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		if (a < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("POSITIVO");
		}

		sc.close();
	}
}
