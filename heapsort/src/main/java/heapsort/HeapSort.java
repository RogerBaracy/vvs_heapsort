package heapsort;

public class HeapSort {    
    private static int tam;
    private static int[] vetor;    
    
    
    public void sort(int[] array) {
        vetor = array;          // vetor global recebe o vetor passado como parâmetro
        tam = vetor.length - 1;     // o tamanho deste vetor é armazenado em 'tam', que também é global
        
        // Chama a função para construir um Max-Heap
        constroiHeap();       
       
        for (int i = tam; i > 0; i--) {
            troca(0, tam);      // Troca a posição
            tam -= 1;           // Diminui 'tam' para não alterar a posição do maior valor nas próximas iterações
            maxHeapifica(0);    // Como existe um valor menor no topo, é necessário heapificar novamente a árvore inteira
        }
    }
    
    // Função que constrói o Max-Heap
    private void constroiHeap() {
        // Como o último nível da árvore não tem filhos, a construção se inicia no último elemento da penúltima.
        // Esse elemento se encontra bem no meio do vetor, ou seja, tam/2:
        int meio = (int) (tam/2);
        
        // Para cada elemento do penúltimo nível, chama o maxHeapifica, ou seja
        // encontra o maior elemento e coloca como pai
        for (int i = meio - 1; i >= 0; i--) {
            maxHeapifica(i);
        }
    }
    
    // Função de troca
    // É uma função simples de swap, para auxiliar na troca de posição dos valores
    private void troca(int i, int j) {
        int aux;

        aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
    
    // Função maxHeapifica
    // Essa função é o core do algoritmo.
    // Ela faz a comparação entre os valores de um Heap e ao encontrar o maior, o coloca como pai da Heap.
    // Isso faz com que qualquer Heap se torne um Max-Heap.
    private void maxHeapifica(int pai) {
        int maior = pai,            // O maior elemento é o pai, até que se prove o contrário.
            esquerda = 2 * pai + 1,     // Pega a posição do filho da esquerda
            direita = 2 * pai + 2;  // e a do filho da direita.
        
        // Se o filho da esquerda existe, ou seja, se ele está dentro do intervalo verificável do array E
        // Se este filho é maior que o pai (que no momento é o 'maior')
        if (esquerda <= tam && vetor[esquerda] > vetor[maior])
            maior = esquerda;
        
        // Se o filho da direita existe, ou seja, se ele está dentro do intervalo verificável do array E
        // Se este filho é maior que o 'maior' (que no momento pode ser o 'pai' ou o 'esquerda')
        if (direita <= tam && vetor[direita] > vetor[maior])
            maior = direita;
        
        // Se ao chegar até aqui o 'pai' deixou de ser o 'maior' valor
        if (maior != pai) {
            troca(pai, maior);      // Faz a troca de posições
            maxHeapifica(maior);    // Continua heapificando com o valor que foi trocado
        }
    } 
    
    /**
     * Shows the array.
     *
     * @param values the array
     */
    public void show(int... values) {
        for (int num : values) {
            System.out.print(num + " ");
        }
    }
}
