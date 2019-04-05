package course.Pratica.Application10Matriz;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho da matriz: ");
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] mat = new int[m][n];

		System.out.println("Digite os numeros na matriz");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("Digite o numero que precisa ser pesquisado: ");
		int x = sc.nextInt();

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println(i + " " + j);
					// UP
					if (i - 1 >= 0) {
						System.out.println("UP: " + mat[i - 1][j]);
					}
					// Left
					if (j - 1 >= 0) {
						System.out.println("LEFT: " + mat[i][j - 1]);
					}
					// DOWN
					if (i + 1 <= mat.length) {
						System.out.println("DOWN: " + mat[i + 1][j]);
					}
					// RIGHT
					if (j + 1 <= mat[i].length) {
						System.out.println("RIGHT: " + mat[i][j + 1]);
					}
				}
			}
		}

		sc.close();
	}
}
