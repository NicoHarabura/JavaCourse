package course.Teoria.Application3ExemploClasseAbstrata.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import course.Teoria.Application3ExemploClasseAbstrata.entities.Circulo;
import course.Teoria.Application3ExemploClasseAbstrata.entities.Forma;
import course.Teoria.Application3ExemploClasseAbstrata.entities.Retangulo;
import course.Teoria.Application3ExemploClasseAbstrata.entities.enums.Color;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Forma> lista = new ArrayList<>();
		
		System.out.println("Quantas formas serão adicionadas?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++){
			System.out.println("É um retangulo ou um circulo?\nr/c?");
			sc.nextLine();
			char op = sc.nextLine().charAt(0);
			System.out.println("Digite as informações da forma #"+(i+1)+":");
			System.out.println("Cor (BLACK,BLUE,RED): ");
			Color cor = Color.valueOf(sc.nextLine());
			if (op == 'r'){
				System.out.println("Digite a altura: ");
				double altura = sc.nextDouble();
				System.out.println("Agora o comprimento: ");
				double comprimento = sc.nextDouble();
				lista.add(new Retangulo(cor, comprimento, altura));
			} else {
				System.out.println("Digite o raio: ");
				double raio = sc.nextDouble();
				lista.add(new Circulo(cor, raio));
			}
			
			
		}
		
		System.out.println();
		System.out.println("Areas das figuras:");
		
		for (Forma f : lista){
			System.out.println(String.format("%.2f", f.area()));
		}
		
		sc.close();
	}

}
