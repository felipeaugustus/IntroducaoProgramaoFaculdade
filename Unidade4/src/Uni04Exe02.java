import java.util.Scanner;

public class Uni04Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int valor = teclado.nextInt();

        if (valor%2 == 0) {
            System.out.println("O numero é par");
        }
        else {
            System.out.println("O numero é impar");
        }
        teclado.close();
    }
}
