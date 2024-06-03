import java.util.Scanner;

public class Main {
    public static int calcularFatorial(int N) {
        if (N < 0) {
            System.out.println("Não é possível calcular o fatorial de um número negativo.");
            return -1;
        }

        if (N == 0) {
            return 1;
        }

        int fatorial = 1;

        for (int i = 1; i <= N; i++) {
            fatorial *= i;
        }

        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        int resultado = calcularFatorial(numero);

        if (resultado != -1) {
            System.out.println("O fatorial de " + numero + " é: " + resultado);
        }

        scanner.close();
    }
}
