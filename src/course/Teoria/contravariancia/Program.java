package course.Teoria.contravariancia;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		List<Object> myObj = new ArrayList<Object>();
		myObj.add("Nathalia");
		myObj.add("Nicolau");
		
		List<? super Number> myNum = myObj;
		
		myNum.add(3);
		myNum.add(2.5);
		
		//Number x = myNum.get(0); ADD FUNCIONA GET NÃO
		
		
	}
	
}
