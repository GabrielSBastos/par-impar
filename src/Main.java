import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = numero.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par");
        }else {
            System.out.println("O número é ímpar");
        }
    }
}