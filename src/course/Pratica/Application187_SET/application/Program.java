package course.Pratica.Application187_SET.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import course.Pratica.Application187_SET.entities.Instrutor;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Instrutor> set = new HashSet<>();

		System.out.println("Quantos estudantes no curso A? ");
		int numA = sc.nextInt();
		if (numA != 0) {
			System.out.println("Digite o id de cada um dos alunos:");
		}

		for (int i = 0; i < numA; i++) {
			int idAluno = sc.nextInt();
			set.add(new Instrutor('A', idAluno));
		}

		System.out.println("Quantos estudantes no curso B? ");
		int numB = sc.nextInt();
		if (numB != 0) {
			System.out.println("Digite o id de cada um dos alunos:");
		}

		for (int i = 0; i < numB; i++) {
			int idAluno = sc.nextInt();
			set.add(new Instrutor('B', idAluno));
		}

		System.out.println("Quantos estudantes no curso C? ");
		int numC = sc.nextInt();
		if (numC != 0) {
			System.out.println("Digite o id de cada um dos alunos:");
		}

		for (int i = 0; i < numC; i++) {
			int idAluno = sc.nextInt();
			set.add(new Instrutor('C', idAluno));
		}

		System.out.println("Total de estudantes: " + set.size());

		sc.close();

	}

}
