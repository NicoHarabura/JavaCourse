package course.Teoria.leituraDeArquivo;

import java.io.File;
import java.util.Scanner;

public class GerenciarPastas {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite o nome da pasta: ");
	String srtPath = sc.next();
	
	File path = new File(srtPath);
	
	File[] folders = path.listFiles(File::isDirectory);
	
	System.out.println();
	for (File folder : folders){
		System.out.println(folder);
	}
	
	File[] files = path.listFiles(File::isFile);
	
	System.out.println();
	for (File file : files){
		System.out.println(file);
	}
	
	System.out.println();
	
	boolean success = new File(srtPath + "\\pastaCriada").mkdirs();
	System.out.println("Pasta criada com sucesso: " + success);
	
}
	
}
