import java.util.Scanner;

public class Uni04Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Opçoes (1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação)");
        int curso = teclado.nextInt();
        switch (curso) {
            case 1:
            System.out.println("Bacharel em Ciencias da Computação");
            break;
            case 2:
            System.out.println("Licenciado em computação");
            break;
            case 3:
            System.out.println("Bacharel em Sistemas");
            break;
        }
    teclado.close();
        

    }
}
