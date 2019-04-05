package course.Teoria.Array;

import java.util.Scanner;

public class ArrayMedia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite quantas pessoas serão medidas: ");
		int n = sc.nextInt();

		double[] vet = new double[n];
		double avg = 0, sum = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Digite a altura: ");
			vet[i] = sc.nextDouble();
			sum += vet[i];
		}

		avg = sum / n;
		System.out.printf("A media das alturas é: %.2f\n", avg);

		sc.close();
	}
}
