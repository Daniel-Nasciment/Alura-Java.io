import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Base64.Encoder;

public class TesteSalvamentoArquivos {

	public static void main(String[] args) throws IOException {

		String sinistro = "T1602142";

		String caminhoFormatado = String.format("/00%s/%s/%s", sinistro.substring(1, 2), sinistro.substring(2, 5),
				sinistro.substring(5, 8));

		if (sinistro.length() == 9) {
			caminhoFormatado = String.format("/0%s/%s/%s", sinistro.substring(1, 3), sinistro.substring(3, 6),
					sinistro.substring(6, 9));
		}

		if (sinistro.length() == 10) {
			caminhoFormatado = String.format("/%s/%s/%s", sinistro.substring(1, 4), sinistro.substring(4, 7),
					sinistro.substring(7, 10));
		}

		System.out.println(caminhoFormatado);

		String property = System.getProperty("save.arq");

		File pasta = new File(property.concat(caminhoFormatado));
		boolean mkdirs = pasta.mkdirs();

		System.out.println(mkdirs);

		File arquivo = new File("lorem.txt");

		PrintWriter ps = new PrintWriter(pasta + "/" + arquivo);
		ps.flush();
		ps.close();

	}

}
