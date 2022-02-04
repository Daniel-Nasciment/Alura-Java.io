import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.spi.FileTypeDetector;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;

public class TesteSalvamentoArquivos {

	private static List<String> mimeType = new ArrayList<String>();

	static {
		mimeType.add("text/plain");
		mimeType.add("application/pdf");
	}

	public static void main(String[] args) throws IOException {

		String nomeArqEnviado = "nome";

		String sinistro = "T1603142";

		String caminhoFormatado = String.format("/00%s/%s/%s", sinistro.substring(1, 2), sinistro.substring(2, 5),
				sinistro.substring(5, 8));

		String property = System.getProperty("save.arq");

		File pasta = new File(property.concat(caminhoFormatado));
		boolean mkdirs = pasta.mkdirs();

		System.out.println(mkdirs);

		byte[] decode = Base64.getDecoder().decode("VGVzdGU=");

		String chave = geraChave();

		String nomeArquivoFormatado = "/".concat(chave).concat("_").concat(sinistro).concat("_")
				.concat(nomeArqEnviado.substring(0, 3).concat("_").concat(".png"));

		File arquivo = new File(pasta + nomeArquivoFormatado);

		boolean mimetypeAllowed = mimetypeAllowed(arquivo);

		System.out.println(mimetypeAllowed);

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

	public static boolean mimetypeAllowed(File arquivo) throws IOException {

		// image/jpeg
		// image/png
		// application/pdf
		// text/plain

		// return Files.probeContentType(arquivo.toPath());

		for (String string : mimeType) {

			if (Files.probeContentType(arquivo.toPath()).equals(string)) {
				return true;
			}

		}

		throw new IllegalArgumentException("Tipo de arquivo inválido");

	}

}
