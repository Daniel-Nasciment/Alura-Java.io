import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class TesteSalvamentoArquivos {

	public static void main(String[] args) throws IOException {

		String sinistro = "T1602142";

		// O RESULTADO É DEPOIS DO 5º ATÉ O 8º INDICE
		String fim = sinistro.substring(5, 8);

		// O RESULTADO É DEPOIS DO 2º ATÉ O 5º INDICE
		String meio = sinistro.substring(2, 5);

		// O RESULTADO É DEPOIS DO 1º ATÉ O 2º INDICE
		String inicio = sinistro.substring(1, 2);

		String caminhoFormatado = String.format("/00%s/%s/%s", inicio, meio, fim);

		System.out.println(inicio);
		System.out.println(meio);
		System.out.println(fim);
		System.out.println(caminhoFormatado);

		String property = System.getProperty("save.arq");	

		File pasta = new File(property.concat(caminhoFormatado));
		pasta.mkdirs();
	

		PrintWriter ps = new PrintWriter(pasta + "/lorem1.txt");
		ps.flush();
		ps.close();


		System.out.println(property);

	}

}
