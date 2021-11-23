import java.io.FileWriter;
import java.io.IOException;

public class TesteEscrita2 {

	public static void main(String[] args) throws IOException {

		
		
//		OutputStream fos = new FileOutputStream("lorem.txt");
//		
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem1.txt");
		
		fw.write("Escrita utilizando JAVA.io");
		
		// PULAR LINHA
		fw.write("\n");
		
		// PULAR LINHA
		fw.write(System.lineSeparator());
		
		fw.write("Nova linha escrita");
		
		
		fw.close();
		
	}

}
