package course.Teoria.ClassesEMetodos;

public class BoxingUnBoxingWrappers {

	public static void main(String[] args) {
		
		int x = 20;
		
		Object obj = x;
		
		
		System.out.println(obj);
		
		int y = (int) obj;
		
		System.out.println(y);
		
		Integer obj2 = x; //INTEGER É UMA WRAPPER CLASS!!!
		
		int z = obj2;
		
	}
}
