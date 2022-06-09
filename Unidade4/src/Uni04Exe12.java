import java.util.Scanner;

public class Uni04Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int lado1 = teclado.nextInt();
        int lado2 = teclado.nextInt();
        int lado3 = teclado.nextInt();

        if (lado1 < (lado2 + lado3) && lado3 < (lado2 + lado1) && lado2 < (lado1 + lado3)) {
            System.out.println("É um triangulo");
            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É equilatero");}
            else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Isóceles");}
            else {
                System.out.println("É escaleno");
            }
            
        }
        else {
            System.out.println("Não é triangulo");
        }
 
        teclado.close();
    }
}
