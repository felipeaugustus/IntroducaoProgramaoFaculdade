import java.util.Scanner;

public class Uni04Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int a = teclado.nextInt();
        int b = teclado.nextInt();

        

        if ((a%b)== 0) {
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("n são multiplos");
        }

        teclado.close();
    }
}
