package course.Teoria.leituraDeArquivo;

import java.io.File;
import java.util.Scanner;

public class ManipulandoInfos {


	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		File path = new File(sc.next());
		System.out.println("getName: " + path.getName());
		System.out.println();
		System.out.println("getParent: " + path.getParent());
		System.out.println();
		System.out.println("getPath: " + path.getPath());
		sc.close();
	}
	
	
}
