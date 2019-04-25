package course.Teoria.ClassesEMetodos.Abstrata;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		
		List<Account> lista = new ArrayList<Account>();
		
		lista.add(new SavingsAccount("teste", 100.00, 10.00));
		lista.add(new BusinessAccount("teste", 500.00, 100.00));
		double sum = 0.0;
		for (Account account : lista) {
			sum += account.getSaldo();
			
		}
		
		System.out.println(sum);
		
		for (Account account : lista) {
			account.deposit(10.0);
		}
		
		for (Account account : lista) {
			System.out.println(account.getSaldo());
		} 
		
	}
	
	

}
