import java.util.Scanner;

public class Main {
    public static boolean verificarPalindromo(String str) {
        // Remove os espaços em branco e converte para minúsculas
        str = str.replaceAll("\\s+", "").toLowerCase();

        int esquerda = 0;
        int direita = str.length() - 1;

        while (esquerda < direita) {
            if (str.charAt(esquerda) != str.charAt(direita)) {
                return false;
            }
            esquerda++;
            direita--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para verificar se é um palíndromo: ");
        String str = scanner.nextLine();

        if (verificarPalindromo(str)) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }

        scanner.close();
    }
}