import java.util.Scanner;

public class Uni04Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int ano1 = teclado.nextInt();
        int ano2 = teclado.nextInt();
        int ano3 = teclado.nextInt();
        if(ano1 == ano2 && ano1 == ano2 && ano2 == ano3) {
            System.out.println("TRI TRI TRI GEMEOOOOOOOS");
        }
        else if (ano1 == ano2 || ano2 == ano3 || ano3 == ano2) {
            System.out.println("GEMEOS");
        }
        else {
            System.out.println("apenas irmaos");
        }
        teclado.close();
    }
}
