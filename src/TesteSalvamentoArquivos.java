import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.Date;

public class TesteSalvamentoArquivos {

	public static void main(String[] args) throws IOException {

		String sinistro = "T1892142";

		String nomeArqEnviado = "nome";

		String caminhoFormatado = String.format("/00%s/%s/%s", sinistro.substring(1, 2), sinistro.substring(2, 5),
				sinistro.substring(5, 8));

		String property = System.getProperty("save.arq");

		File pasta = new File(property.concat(caminhoFormatado));
		boolean mkdirs = pasta.mkdirs();

		System.out.println(mkdirs);

		byte[] decode = Base64.getDecoder().decode("VGVzdGU=");

		String chave = geraChave();

		String nomeArquivoFormatado = "/".concat(chave).concat("_").concat(sinistro).concat("_")
				.concat(nomeArqEnviado.substring(0, 3).concat("_").concat(".txt"));

		File arquivo = new File(pasta + nomeArquivoFormatado);

		FileOutputStream os = new FileOutputStream(arquivo);

		os.write(decode);
		os.flush();
		os.close();

	}

	public static String geraChave() {

		Long chave = new Date().getTime();

		String chaveFormatada = String.valueOf(chave);

		return chaveFormatada.substring(chaveFormatada.length() - 10, chaveFormatada.length());

	}

}
