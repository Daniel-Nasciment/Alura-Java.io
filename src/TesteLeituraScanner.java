import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeituraScanner {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("arquivo.csv"), "UTF-8");
		
		while(scanner.hasNextLine()) {
			
			String linha = scanner.nextLine();
			System.out.println(linha);
			
			
			Scanner linhaScanner = new Scanner(linha);
			// PADRÃO AMERICANO (VALORES DECIMAIS)
			linhaScanner.useLocale(Locale.US);
			
			// SEPARADOR
			linhaScanner.useDelimiter(",");
			
			String valor1 = linhaScanner.next();
			Integer valor2 = linhaScanner.nextInt();
			Integer valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			BigDecimal valor5 = linhaScanner.nextBigDecimal();
			
			// %s -> Indica que é uma String (Serve para qualquer tipo)
			String valorFormat = String.format(new Locale("pt", "BR") ,"%s %s-%s %s %.2f", valor1, valor2, valor3, valor4, valor5);
			System.out.println(valorFormat);
			
			// Concatenar muitas Strings é sempre má prática
			//System.out.println(valor1 + valor2 + valor3 + valor4 + valor5);
			
			
			linhaScanner.close();
			
			
			
			// SPLIT -> SEPARADOR
			//String[] valores = linha.split(",");
			
			// ARRAYS -> AUXILIAR 
			//System.out.println(Arrays.toString(valores));
			
		}
		
		scanner.close();

	}

}
