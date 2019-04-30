package course.Teoria.TratamentoExcecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTratamentoDeExcecoes {

	public static void method1() {
		System.out.println("***START METHOD1***");
		method2();
		System.out.println("***END METHOD1***");
	}

	public static void method2() {
		System.out.println("***START METHOD2***");
		Scanner sc = new Scanner(System.in);
		try {
			String vect[] = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vect[posicao]);
		} catch (InputMismatchException e) {
			System.out.println("Entrada inválida!");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
		}

		sc.close();
		System.out.println("***END METHOD2***");
	}

	public static void main(String[] args) {

		method1();

		System.out.println("FIM DO PROGRAMA");

	}

}
