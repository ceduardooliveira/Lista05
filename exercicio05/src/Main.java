public class Main {
    public static int buscaBinaria(int[] array, int elemento) {
        int esquerda = 0;
        int direita = array.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (array[meio] == elemento) {
                return meio;
            }

            if (array[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19}; // Exemplo de um array ordenado
        int elemento = 13; // Exemplo de elemento a ser buscado

        int posicao = buscaBinaria(array, elemento);

        if (posicao != -1) {
            System.out.println("Elemento encontrado na posição: " + posicao);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }
}
