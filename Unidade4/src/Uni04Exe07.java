import java.util.Scanner;

public class Uni04Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entre com o peso da carta:");
        int peso = teclado.nextInt();

        if (peso <= 50) {
            Double preco = 0.45;
            System.out.println("Preço final =" + preco);
        }
        else {
            int pesoex = peso - 50;
            int qtadd = (pesoex/20)+1;
            Double preco = 0.45 * qtadd;
            System.out.println("Preço final =" + preco);
        }
       teclado.close();
    }
}
