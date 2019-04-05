package course.Teoria.Basico;

public class ConversãoImplícita {

	public static void main(String[] args) {

		int a = 5, b = 2;
		double result;

		result = a / b;

		System.out.println(result);

		result = (double) a / b;
		
		System.out.println(result);

		String num = "33";

		// a = (int)num;

		a = Integer.parseInt(num);
		System.out.println(a);

		result = Double.parseDouble(num);
		System.out.println(result);
	}
}
