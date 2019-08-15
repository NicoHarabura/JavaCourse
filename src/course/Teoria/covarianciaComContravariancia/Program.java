package course.Teoria.covarianciaComContravariancia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		List<Integer> myInts = Arrays.asList(3, 8, 9);
		List<Double> myDoub = Arrays.asList(3.5, 4.8, 9.2);
		List<Object> myObj = new ArrayList<Object>();

		copy(myInts, myObj);
		printList(myObj);
		copy(myDoub, myObj);
		printList(myObj);

	}

	public static void copy(List<? extends Number> source, List<? super Number> destiny) {
		for (Number n : source) {
			destiny.add(n);
		}
	}

	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.print(obj + ", ");
		}
		System.out.println();
	}

}
