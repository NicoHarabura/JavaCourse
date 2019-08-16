package course.Teoria.sets.application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>(); // HashSet TreeSet

		set.add("Notebook");
		set.add("Tv");
		set.add("Tablet");

		// set.remove("Notebook");
		// set.removeIf(x -> x.charAt(0) == 'T');
		set.removeIf(x -> x.length() > 3);

		for (String s : set) {
			System.out.println(s);
		}

	}

}
