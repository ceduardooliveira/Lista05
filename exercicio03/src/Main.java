import java.util.Scanner;

public class Main {
    public static int calcularPotencia(int X, int Y) {

        if (Y < 0) {
            System.out.println("A potência deve ser maior ou igual a zero.");
            return -1;
        }


        if (Y == 0) {
            return 1;
        }
        int resultado = 1;

        for (int i = 0; i < Y; i++) {
            resultado *= X;
        }

        return resultado;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de X (base): ");
        int X = scanner.nextInt();

        System.out.print("Digite o valor de Y (expoente): ");
        int Y = scanner.nextInt();

        int resultado = calcularPotencia(X, Y);

        if (resultado != -1) {
            System.out.println(X + " elevado a " + Y + " é: " + resultado);
        }

        scanner.close();
    }
}