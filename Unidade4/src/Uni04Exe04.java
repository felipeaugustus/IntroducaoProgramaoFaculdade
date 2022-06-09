import java.util.Scanner;

public class Uni04Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Double x = teclado.nextDouble();

        if (x%1 == 0) {
            System.out.println("Numero inteiro");
        }
        else {
            System.out.println("Numero decimal");
        }


        



        teclado.close();
    }
}
