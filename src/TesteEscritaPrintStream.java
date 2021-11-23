import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscritaPrintStream {

	public static void main(String[] args) throws IOException {

		
//		OutputStream fos = new FileOutputStream("lorem.txt");
//		
//		OutputStreamWriter osw = new OutputStreamWriter(fos);
//		
//		BufferedWriter bw = new BufferedWriter(osw);

		// FAZ A MESMA COISA QUE O WRITER
		//PrintStream ps = new PrintStream("lorem1.txt");
		
		PrintWriter ps = new PrintWriter("lorem1.txt");
		
		ps.println("Escrita utilizando JAVA.io");
		ps.println();
		ps.println("Nova linha escrita");
		ps.println("Nova linha escrita");
		
		// É IMPORTANTE SEMPRE FECHAR OS RECURSOS
		ps.close();
		
		
	}

}
