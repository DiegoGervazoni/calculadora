import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        int somaDosValores = 0;

        System.out.println("Insira um valor para ver a tabuada: ");
        numero = sc.nextInt();
        System.out.println("Tabuda do " + numero);

        for(int i = 1; i <= 10; i++){
            somaDosValores = numero * i;
            System.out.println(numero + " x " + i + " = " + somaDosValores);
        }

    }
}
