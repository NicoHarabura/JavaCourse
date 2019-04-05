package course.Teoria.ClassesEMetodos.SemSerStatic;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Calculator calc = new Calculator();

		System.out.println("Digite o valor do raio: ");
		double ratius = sc.nextDouble();
		System.out.println(calc.circunference(ratius));
		System.out.println(calc.volume(ratius));
		System.out.println(calc.PI);

		sc.close();

	}

}
