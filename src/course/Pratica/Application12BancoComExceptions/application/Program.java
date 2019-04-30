package course.Pratica.Application12BancoComExceptions.application;

import java.util.Scanner;

import course.Pratica.Application12BancoComExceptions.model.entities.Account;
import course.Pratica.Application12BancoComExceptions.model.exceptions.ValueException;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try{
		System.out.println("Enter account data -- ");
		System.out.println("Number: ");
		int number = sc.nextInt();
		System.out.println("Holder: ");
		String holder = sc.next();
		System.out.println("Initial Balance: ");
		double balance = sc.nextDouble();
		System.out.println("Withdraw limit: ");
		double withdrawLimit = sc.nextDouble();
		Account acc = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		acc.withdraw(sc.nextDouble());
		
		System.out.println("New balance: " + acc.getBalance());
		
		}
		catch (ValueException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e){
			System.out.println("Unexpected Error!");
		}
		sc.close();
	}

}
