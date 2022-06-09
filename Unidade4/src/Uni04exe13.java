import java.util.Scanner;;
public class Uni04exe13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dgite suas 3 cartas(1= AS; 2 = 2; 3 = 3; 7 = 7; 11 = Valete; 12 = Dama; 13 = Rei):");
        int carta1  = teclado.nextInt();
        int carta2 = teclado.nextInt();
        int carta3 = teclado.nextInt();

        int cartasboas = 0;

        if (carta1 == 1 ||carta1 == 2||carta1 == 3) {
            cartasboas++;
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            cartasboas++;
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            cartasboas++;
        }

        if(cartasboas==3) {
            System.out.println("NOVE");
        }
        else if (cartasboas==2) {
            System.out.println("SEIS");
        }
        else if (cartasboas==1) {
            System.out.println("TRUCO");
        }
        else {
            System.out.println("mão ruim");
        }
        teclado.close();
    }
}
