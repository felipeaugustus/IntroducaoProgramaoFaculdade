import java.util.Arrays;
import java.util.Scanner;

public class Uni04Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com 3 numeros:");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();

        System.out.println("Escolha um método 1 2 ou 3");
        int metodo = teclado.nextInt();

        switch (metodo){
            case 1:
            int[] numeros =  {a, b, c};
        Arrays.sort(numeros);
        for(int numero : numeros)
            System.out.println(numero);
            break;
            case 2: 
            if (a > b && a > c && b > c){
                System.out.println(String.format("%s ; %s ; %s", a, b, c));
            }
            else if (b > a && b > c && c > a){
                System.out.println(String.format("%s ; %s ; %s", b, c, a));
            }
            else if (b > a && b > c && a > c) {
                System.out.println(String.format("%s ; %s ; %s", b, a, c));
            }
            else if (c > a && c > b && b > a) {
                System.out.println(String.format("%s ; %s ; %s", c, b, a));
            }
            else if (c > a && c > b && a > b) {
                System.out.println(String.format("%s ; %s ; %s", c, a, b));
            }
            else if (a > b && a > c && c > b) {
                System.out.println(String.format("%s ; %s ; %s", a, c, b));
            }
            break;
            case 3:
            if (a > b && a > c && b > c){
                System.out.println(String.format("%s ; %s ; %s", b, a, c));
            }
            else if (b > a && b > c && c > a){
                System.out.println(String.format("%s ; %s ; %s", c, b, a));
            }
            else if (b > a && b > c && a > c) {
                System.out.println(String.format("%s ; %s ; %s", a, b, c));
            }
            else if (c > a && c > b && b > a) {
                System.out.println(String.format("%s ; %s ; %s", b, c, a));
            }
            else if (c > a && c > b && a > b) {
                System.out.println(String.format("%s ; %s ; %s",  a, c, b));
            }
            else if (a > b && a > c && c > b) {
                System.out.println(String.format("%s ; %s ; %s", c, a, b)); }
                break;
            default: 
            System.out.println("Opcção invalida");
          }

          teclado.close();
    }
}