package course.Teoria.Basico;

import java.util.Locale;
import java.util.Scanner;

public class ScannerExemploDeFlush {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); //Para poder digitar ponto
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		System.out.println(num);
		
		sc.nextLine();// aqui foi feito o flush!!!!		
		String texto = sc.nextLine();
		System.out.println(texto);
		
		char gender = sc.next().charAt(0); //sc.next recebe String. por isso converti para Char
		System.out.println(gender);
		
		String code = sc.next();
		char letter = code.charAt(0);
		int digit = Integer.parseInt(code.substring(1));
		System.out.println(code);
		System.out.println(letter);
		System.out.println(digit);
		
		double num2 = sc.nextDouble();
		System.out.println(num2);
		
		String name = sc.next();
		char sex = sc.next().charAt(0);
		int age = sc.nextInt();
		double height = sc.nextDouble();
		System.out.println(name);
		System.out.println(sex);
		System.out.println(age);
		System.out.println(height);
		
		sc.close();
	}
}
