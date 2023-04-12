import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("------------------\nDescubra se pertence a sequencia Fibonacci!");

        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um Valor: ");
        int numero = sc.nextInt();

        Fibonacci input = new Fibonacci();
        input.verifica_number(numero);
    }
}
