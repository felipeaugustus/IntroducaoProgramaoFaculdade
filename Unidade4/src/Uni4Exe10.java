import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Idade MArquinhos");
        int marquinhos = teclado.nextInt();
        System.out.println("Idade zezinho");
        int zezinho = teclado.nextInt();
        System.out.println("Idade Lulinha");
        int lulinha = teclado.nextInt();

        if (marquinhos < zezinho && marquinhos < lulinha) {
            System.out.println("Marquinhos é o caçula");
        }
        else if (zezinho < lulinha && zezinho < marquinhos) {
            System.out.println("zezinho é o caçula");
        }
        else {
            System.out.println("lulinha é o caçula");
        }
        
        teclado.close();
    }
}
