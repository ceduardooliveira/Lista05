public class Main {
    public static int somaAteN(int N) {

        if (N <= 0) {
            System.out.println("N deve ser maior que 0.");
            return -1;
        }

        int soma = 0;

        for (int i = 1; i <= N; i++) {
            soma += i;
        }
        return soma;
    }

    public static void main(String[] args) {
        int N = 5; // Exemplo de número para teste
        int resultado = somaAteN(N);
        System.out.println("A soma de todos os números de 1 até " + N + " é: " + resultado);
    }
}
