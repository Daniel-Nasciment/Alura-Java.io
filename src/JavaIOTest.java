import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaIOTest {

	public static void main(String[] args) throws IOException {

		
		// PADRÃO CHAMADO: DECORATOR
		
		// TRANSFORMA O ARQUIVO EM BITS OU BYTES
		FileInputStream fis = new FileInputStream("lorem.txt");
		
		// TRANSFORMA BITS/BYTES EM CARACTERES
		InputStreamReader isr = new InputStreamReader(fis);
		
		// JUNTA CARACTERES DE UMA LINHA
		BufferedReader br = new BufferedReader(isr);
		
		
		System.out.println(br.readLine());
		
	}

}
