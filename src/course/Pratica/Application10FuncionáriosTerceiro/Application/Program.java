package course.Pratica.Application10FuncionáriosTerceiro.Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import course.Pratica.Application10FuncionáriosTerceiro.Entities.Employee;
import course.Pratica.Application10FuncionáriosTerceiro.Entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many employees?: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++){
			System.out.println("Enter #"+(i+1)+" employee data:");
			System.out.println("Employee is outsourced: y/n?");
			char op = sc.next().charAt(0);
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Worked hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per hour: ");
			Double valuePerHour = sc.nextDouble();
			if (op == 'y'){
				System.out.println("Additional charges: ");
				double additionalCharges = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharges);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			System.out.println("-----------------------------------");
		}
		
		System.out.println("PAYMENTS:");
		for (Employee e : list){
			System.out.println(e.getName()+" - R$" + e.payment());
		}
		
		sc.close();
	}
}
