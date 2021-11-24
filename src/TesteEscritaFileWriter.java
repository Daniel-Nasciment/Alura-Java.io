import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class TesteEscritaFileWriter {

	public static void main(String[] args) throws IOException {

		
//		OutputStream fos = new FileOutputStream("lorem.txt");
//		
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		
//		BufferedWriter bw = new BufferedWriter(osw);
		
		FileWriter fw = new FileWriter("lorem1.txt", Charset.forName("UTF-8"));
		
		fw.write("Escrita utilizando JÁVA.io");
		
		// PULAR LINHA
		fw.write("\n");
		
		// PULAR LINHA
		fw.write(System.lineSeparator());
		
		fw.write("Nova linha escrita");
		
		
		fw.close();
		
	}

}
