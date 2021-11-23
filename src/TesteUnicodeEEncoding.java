import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEEncoding {

	public static void main(String[] args) {

		String s = "C";

		System.out.println(s.codePointAt(0));
		
		Charset defaultCharset = Charset.defaultCharset();

		System.out.println(defaultCharset.displayName());
		
		// StandardCharsets -> JÁ CONTEM ALGUMAS CONSTANTES COM ENCODINGS
		byte[] bytes = s.getBytes(StandardCharsets.UTF_16);
		
		
		// ENCODINGS
		
//		DEFAULT windows 1252
//		StandardCharsets.US_ASCII
//		StandardCharsets.UTF_8
//		StandardCharsets.UTF_16
		
		System.out.println(bytes.length);
		
	}

 }
