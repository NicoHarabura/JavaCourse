package course.Teoria.wildcards.application;

import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		
		List<Integer> meusInts = Arrays.asList(2,8,9);
		printList (meusInts);
		
		List<String> minhasStr = Arrays.asList("maria", "joão", "pedro");
		printList (minhasStr);
	}
	
	public static void printList (List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}
	
}
