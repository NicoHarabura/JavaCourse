package course.Teoria.Matriz;

import java.util.Scanner;

public class MatrizExemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho da matriz: ?x?");
		int n = sc.nextInt();
		int m = sc.nextInt();

		int[][] mat = new int[n][m];

		System.out.println(
				"Agora digite os numeros que serão colocados na matriz (primeiro as linhas depois as colunas): ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println("Elementos na diagonal: ");
		for (int i = 0; i < mat.length; i++) {
			System.out.println(mat[i][i] + " ");
		}

		
		int count = 0;
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] < 0) {
					count++;
				}
			}
		}

		System.out.println("Quantidade de elementos negativos: " + count);
		
		
		sc.close();
	}
}
