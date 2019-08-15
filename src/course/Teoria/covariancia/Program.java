package course.Teoria.covariancia;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Integer> myInt = new ArrayList<Integer>();
		myInt.add(3);
		myInt.add(4);
		myInt.add(10);
		
		List<? extends Number> listNum = myInt;
		
		listNum.get(0);
		
		//listNum.add(3);  ACEITA GET MAS NÃO ACEITA ADD
		
	}
	
}
