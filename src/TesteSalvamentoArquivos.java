import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.Base64.Encoder;

public class TesteSalvamentoArquivos {

	public static void main(String[] args) throws IOException {

		String sinistro = "T1602142";

		String caminhoFormatado = String.format("/00%s/%s/%s", sinistro.substring(1, 2), sinistro.substring(2, 5),
				sinistro.substring(5, 8));

		System.out.println(caminhoFormatado);

		String property = System.getProperty("save.arq");

		File pasta = new File(property.concat(caminhoFormatado));
		boolean mkdirs = pasta.mkdirs();

		System.out.println(mkdirs);

		byte[] decode = Base64.getDecoder().decode("VGVzdGU=");

		File arquivo = new File(pasta + "/nomeCriado.txt");

		FileOutputStream os = new FileOutputStream(arquivo);

		os.write(decode);
		os.flush();
		os.close();

	}

}
