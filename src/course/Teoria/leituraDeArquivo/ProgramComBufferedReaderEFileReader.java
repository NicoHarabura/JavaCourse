package course.Teoria.leituraDeArquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProgramComBufferedReaderEFileReader {

	public static void main(String[] args) {
		String path = "C:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try{
			fr = new FileReader(path);
			br = new BufferedReader(fr);
			String line = br.readLine();
			while (line != null){
				System.out.println(line);
				line = br.readLine();
				
			}
		}
		catch (IOException e){
			System.out.println("ERROR: " + e.getMessage());
		}
		finally {
			try{
				if (fr != null){
					fr.close();
			}
				if (br != null){
					br.close();
				}
			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		
	}
}
