package course.Teoria.HerançaEPolimorfismo.ExemploConta.Application;

import course.Teoria.HerançaEPolimorfismo.ExemploConta.Entities.Account;
import course.Teoria.HerançaEPolimorfismo.ExemploConta.Entities.BusinessAccount;
import course.Teoria.HerançaEPolimorfismo.ExemploConta.Entities.SavingsAccount;

// import course.Teoria.HerançaEPolimorfismo.ExemploConta.Entities.BusinessAccount;

public class Program {
	public static void main(String[] args) {

		Account acc = new Account(123, "Alex", 0.0);
		BusinessAccount bA = new BusinessAccount(102, "Maria", 0.0, 500.0);
		// loanLimit);
		// bA.deposit(value);
		// bA.withdrawn(value);
		// bA.loan(value);
		
		// UP CASTING DA SUB CLASSE PARA SUPERCLASSE
		Account acc2 = bA;
		Account acc3 = new BusinessAccount(125, "Jhonny", 20.0, 555.0);
		Account acc4 = new SavingsAccount(546, "Sam", 0.0, 1.01);
		
		// DOWN CASTING DA SUPER PARA A SUBCLASSE
		BusinessAccount bacc2 = (BusinessAccount) acc2;
		bacc2.loan(100);
		
		// BusinessAccount bacc3 = (BusinessAccount) acc4;
		//O PROBLEMA É QUE ACC4 É UMA SAVINGS ACCOUNT E NÃO UMA BUSINESS ACCOUNT
		
		//PRECISAMOS FAZER UM IF PARA "TESTAR" A INSTANCIA DA CLASSE
		
		if (acc4 instanceof BusinessAccount){
			BusinessAccount bacc3 = (BusinessAccount) acc4;
			bacc3.loan(100);
			System.out.println("Loan!");
			
		}
		
		if (acc4 instanceof SavingsAccount){
			SavingsAccount bacc3 = (SavingsAccount) acc4;
			bacc3.updateBalance();
			System.out.println("Updated!");
		}
 		
	} 
}
