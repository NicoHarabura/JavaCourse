package course.Pratica.Application4;

public class Funcion�rio {

	String name;
	double grossSalary;
	double tax;
	
	public double netSalary (){
		return grossSalary - tax;
	}
	
	public void increaseSalary (double percentage){
		grossSalary = grossSalary * (1 + percentage/100);
	}
}
