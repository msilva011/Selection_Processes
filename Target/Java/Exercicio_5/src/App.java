import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva uma palavra ou frase: ");
        String stringOriginal = sc.nextLine();

        Reverse input = new Reverse();
        input.inverterString(stringOriginal);
        System.out.println("Original: " + stringOriginal);
        System.out.println("Invertida: " + input.getStrInvertida());
    }
}
