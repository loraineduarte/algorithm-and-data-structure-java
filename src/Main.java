import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
    
		System.out.printf("\nConteúdo do arquivo texto:\n");
		try {
			BufferedReader lerArq = new BufferedReader(new FileReader("./src/exe1.txt"));
		
			String linha = lerArq.readLine(); // lê a primeira linha
			// a variável "linha" recebe o valor "null" quando o processo
			// de repetição atingir o final do arquivo texto
			while (linha != null) {
				System.out.printf("%s\n", linha);
			
				linha = lerArq.readLine(); // lê da segunda até a última linha
			}
			
		} catch (IOException e) {
			System.err.printf("Erro na abertura do arquivo: %s.\n",
					e.getMessage());
		}
	
		System.out.println();
    }
}
