import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;


public class GerarNumeros {
    public static void main(String[] args) {
        int tamanho = 1000000;
        String nomeArquivo = "numeros1M.txt";

        gerarNumeros(tamanho, nomeArquivo);
        System.out.println("Arquivo '" + nomeArquivo + "' com " + tamanho + " números gerado.");
    }


    private static void gerarNumeros(int tamanho, String nomeArquivo) {
        Random random = new Random();
        try (PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo))) {
            for (int i = 0; i < tamanho; i++) {
                writer.print(random.nextInt(10 * tamanho));
                if (i < tamanho - 1) {
                    writer.print(" ");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}