package course.Pratica.Application3;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Retangulo retangulo = new Retangulo();
		
		System.out.println("Insira a largura e a altura do retangulo: ");
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		System.out.println("Area = " + retangulo.area());
		System.out.println("Perimetro = " + retangulo.perimeter());
		System.out.println("Diagonal = " + retangulo.diagonal());
	}
}
