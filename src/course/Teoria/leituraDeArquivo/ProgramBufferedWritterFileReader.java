package course.Teoria.leituraDeArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramBufferedWritterFileReader {

public static void main(String[] args) {
	
	String[] lines = new String[] {"Good Night", "Good Afternoon", "Good morning"};
	String path = "C:\\temp\\out.txt";
	
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
		for (String line : lines){
			bw.write(line);
			bw.newLine();
		}
	}
	catch (IOException e){
		e.printStackTrace();
	}
	
}	
}
