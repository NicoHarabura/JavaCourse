package course.Teoria.ClassesEMetodos.Static;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio: ");

		double ratius = sc.nextDouble();
		
		System.out.println(Calculator.circunference(ratius));
		System.out.println(Calculator.volume(ratius));
		System.out.println(Calculator.PI);
				
		sc.close();
	}
}
