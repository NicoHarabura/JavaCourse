package course.Teoria.Basico;

import java.util.Scanner;

public class TreinamentoIfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		sc.close();
		
		int maior;
		
		if (a >= b && a >= c){
			maior = a;
		} else if (b >= c) {
			maior = b;
		} else {
			maior = c;
		}
		
		System.out.println("Higher = " + maior);
	}
}
