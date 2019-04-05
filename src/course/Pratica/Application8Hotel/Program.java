package course.Pratica.Application8Hotel;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Hospede[] vect = new Hospede[10];
		System.out.println("Cadastrar hospede?\ns/n?");
		char op = sc.next().charAt(0);

		for (int i = 0; op == 's' && i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome do hospede: ");
			String name = sc.nextLine();
			System.out.println("Digite o numero do quarto: ");
			int quarto = sc.nextInt();
			vect[quarto] = new Hospede(name, quarto);
			System.out.println("Gostaria de cadastrar mais um hospede?\ns/n?");
			op = sc.next().charAt(0);
		}
		
		for ( int i = 0; i < vect.length; i++){
			if (vect[i]!= null){
				System.out.println(vect[i].getQuarto()+": "+vect[i].getNome());
			}
		}

		sc.close();
	}
}
