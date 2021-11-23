import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita {

	public static void main(String[] args) throws IOException {

		
		
		OutputStream fos = new FileOutputStream("lorem.txt");
		
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		
		BufferedWriter bw = new BufferedWriter(osw);
		
		bw.write("Escrita utilizando JAVA.io");
		bw.newLine();
		bw.newLine();
		bw.write("Nova linha escrita");
		
		
		bw.close();
		
	}

}
