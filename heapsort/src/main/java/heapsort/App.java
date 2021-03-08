package heapsort;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int[] vetorDesordenado = {9, 1, 8, 3, 7, 4, 6, 5};
        HeapSort heapsort = new HeapSort();
        
        // Chama a função de ordenação
        heapsort.sort(vetorDesordenado); 
        heapsort.show(vetorDesordenado);
    }
}
