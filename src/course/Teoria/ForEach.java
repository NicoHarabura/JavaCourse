package course.Teoria;

public class ForEach {

	// for (Tipo apelidoDosElementos : cole��oQueSer�Percorrida){
	// COMANDO1;
	// COMANDO2;
	// }

	public static void main(String[] args) {

		String[] vect = new String[]{"Maria", "Jo�o", "Nicolau"};
		
		for (int i = 0; i<vect.length; i++){
			System.out.println(vect[i]);
		}
		
		for (String name : vect){
			System.out.println("---------------------------------------------------");
			System.out.println(name);
		}
		
	}
}
