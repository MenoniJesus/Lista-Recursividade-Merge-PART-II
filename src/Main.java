import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("/home/menoni/Documentos/ALG.II/Ordenacoes/numeros1M.txt");

        List<String> numeros = Files.readAllLines(path);
        String str = numeros.get(0);
        String[] arr = str.split(" ");
        int[] vetorInsertion = new int[1000000];
        int[] vetorBubble = new int[1000000];
        int[] vetorSelection = new int[1000000];
        int[] vetorMerge = new int[1000000];

        for (int i = 0; i < vetorInsertion.length; i++) {
            int value = Integer.parseInt(arr[i]);
            vetorInsertion[i] = value;
            vetorBubble[i] = value;
            vetorSelection[i] = value;
            vetorMerge[i] = value;
        }

        // Bubble Sort
        long startTime = System.nanoTime();
        BubbleSort.bubbleSort(vetorBubble);
        long finalTime = System.nanoTime();
        System.out.println("Tempo de execução do Bubble Sort: " + (finalTime - startTime) + "ns");

        // Insertion Sort
        startTime = System.nanoTime();
        InsertionSort.insertionSort(vetorInsertion);
        finalTime = System.nanoTime();
        System.out.println("Tempo de execução do Insertion Sort: " + (finalTime - startTime) + "ns");

        // Selection Sort
        startTime = System.nanoTime();
        SelectionSort.selectionSort(vetorSelection);
        finalTime = System.nanoTime();
        System.out.println("Tempo de execução do Selection Sort: " + (finalTime - startTime) + "ns");

        // Merge Sort
        int[] aux = new int[vetorMerge.length];
        startTime = System.nanoTime();
        MergeSort.mergeSort(vetorMerge, aux, 0,vetorMerge.length - 1);
        finalTime = System.nanoTime();
        System.out.println("Tempo de execução do Merge Sort: " + (finalTime - startTime) + "ns");
    }
}