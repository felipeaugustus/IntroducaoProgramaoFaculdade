import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira 3 notas");
        Double nota1 = teclado.nextDouble();
        Double nota2 = teclado.nextDouble();
        Double nota3 = teclado.nextDouble();

        Double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("MÉDIA: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        teclado.close();
    }
}
