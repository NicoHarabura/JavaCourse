package course.Pratica.Application5;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estudante estudante1 = new Estudante();
		
		
		System.out.println("Digite o nome do aluno: ");
		estudante1.name = sc.nextLine();
		
		System.out.println("Digite as 3 notas: ");
		estudante1.n1 = sc.nextDouble();
		estudante1.n2 = sc.nextDouble();
		estudante1.n3 = sc.nextDouble();
		
		estudante1.somar();
		System.out.println(estudante1.aprovarReprovar());
		
		sc.close();
	}
}
