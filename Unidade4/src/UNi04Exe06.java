import java.util.Scanner;

public class UNi04Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        Character gen = teclado.next().charAt(0);
        

        if (gen == 'M') {
            System.out.println("Masculino");
        }
        else if (gen == 'F') {
           System.out.println("Feminino");
        }
        else if (gen == 'I') {
            System.out.println("Não informado");
        }
        else {
            System.out.println("Entrada incorreta");
        }

        



        teclado.close();
    }
}
