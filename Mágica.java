
import java.util.Scanner;

public class Mágica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Anunciante(scanner, "anúncio");
    }

    public static void Anunciante(Scanner scanner, String anúncio) {
        System.out.println("Pense num número de 0 a 9.");
        System.out.println("Enter para pular.");
        scanner.nextLine();

        System.out.println("Agora multiplique esse número por 10.");
        System.out.println("Enter para pular.");
        scanner.nextLine();

        System.out.println("Subtraia o resultado por 3.");
        System.out.println("Enter para pular.");
        scanner.nextLine();

        System.out.println("Seu número deve ter dois dígitos, pense no segundo dígito. Se for 25, pense no 5, se for 78, pense no oito.");
        System.out.println("Enter para pular.");
        scanner.nextLine();

        System.out.println("Agora, escolha a letra que corresponde com seu número");
        System.out.println("0 - A;\n" +
        "1 - G;\n" +
        "2 - O;\n" +
        "3 - U;\n" +
        "4 - C;\n" +
        "5 - F;\n" +
        "6 - S;\n" +
        "7 - M;\n" +
        "8 - E;\n" +
        "9 - L.");
        System.out.println("Enter para pular.");
        scanner.nextLine();

        System.out.println("Agora pense numa fruta com a letra correspondente ao seu número.");
        System.out.println("Enter para pular.");
        scanner.nextLine();

        System.out.println("Por algum acaso, a fruta que você pensou foi a Maçã?");
        scanner.nextLine();
    }
}
