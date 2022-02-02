import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteSalvamentoArquivos {

	public static void main(String[] args) throws IOException {

		String sinistro = "T1602142";

		String caminhoFormatado = String.format("/00%s/%s/%s", sinistro.substring(1, 2), sinistro.substring(2, 5), sinistro.substring(5, 8));

		System.out.println(caminhoFormatado);

		String property = System.getProperty("save.arq");	

		File pasta = new File(property.concat(caminhoFormatado));
		boolean mkdirs = pasta.mkdirs();
	
		System.out.println(mkdirs);
		

		PrintWriter ps = new PrintWriter(pasta + "/lorem1.txt");
		ps.flush();
		ps.close();


		System.out.println(property);

	}

}
